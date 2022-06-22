package com.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.model.Cliente;
import com.idat.repository.ClienteRepository;
@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	ClienteRepository repository;
	
	@Override
	public void guardarCliente(Cliente cliente) {
		repository.save(cliente);
	}

	@Override
	public void actualizarCliente(Cliente cliente) {
		repository.saveAndFlush(cliente);

	}

	@Override
	public void eliminarCliente(Integer id) {
		repository.deleteById(id);

	}

	@Override
	public Cliente obtenerCliente(Integer id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public List<Cliente> listaCliente() {
		return repository.findAll();
	}

}
