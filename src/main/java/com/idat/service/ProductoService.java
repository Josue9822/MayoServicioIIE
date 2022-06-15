package com.idat.service;

import java.util.List;

import com.idat.model.Productos;

public interface ProductoService {

	void guardarProducto(Productos productos);
	void actualizarProducto(Productos productos);
	void eliminarProducto(Integer id);
	List<Productos> listarProductos();
	Productos obtenerProducto(Integer id);
	
}
