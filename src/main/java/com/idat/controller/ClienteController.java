package com.idat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.idat.model.Cliente;
import com.idat.service.ClienteService;

@Controller
@RequestMapping("/clientes/v1")
public class ClienteController {
	
	@Autowired
	private ClienteService service;
	
	//LISTAR
	
	@RequestMapping("/listar")
	public ResponseEntity<List<Cliente>> listar(){
		return new ResponseEntity<List<Cliente>>(service.listaCliente(), HttpStatus.OK);
	}
	
	//LISTAR POR ID
	
	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Cliente> listarPorId(@PathVariable Integer id){
		Cliente c = service.obtenerCliente(id);
		
		if (c!=null) {
			return new ResponseEntity<Cliente>(service.obtenerCliente(id), HttpStatus.OK);
		}
		
		return new ResponseEntity<Cliente>(HttpStatus.NOT_FOUND);
	}
	
	//GUARDAR
	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody Cliente cliente){
		service.guardarCliente(cliente);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	//ACTUALIZAR
	@RequestMapping(path = "actualizar", method = RequestMethod.PUT)
	public ResponseEntity<Void> actualizar(@RequestBody Cliente cliente){
		Cliente c = service.obtenerCliente(cliente.getIdCliente());
		if (c!=null) {
			service.actualizarCliente(cliente);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	//ELIMINAR
	@RequestMapping(path = "eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		Cliente c = service.obtenerCliente(id);
		if (c!= null) {
			service.eliminarCliente(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	

}
