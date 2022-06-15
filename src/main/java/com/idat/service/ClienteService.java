package com.idat.service;

import java.util.List;

import com.idat.model.Cliente;

public interface ClienteService {
	void guardarCliente(Cliente cliente);
	void actualizarCliente(Cliente cliente);
	void eliminarCliente(Integer id);
	Cliente obtenerCliente(Integer id);
	List<Cliente> listaCliente();
}
