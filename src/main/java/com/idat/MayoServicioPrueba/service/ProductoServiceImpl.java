package com.idat.MayoServicioPrueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MayoServicioPrueba.model.Productos;
import com.idat.MayoServicioPrueba.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository repository;
	
	@Override
	public void guardarProducto(Productos producto) {
		repository.guardarProducto(producto);

	}

	@Override
	public void actualizarProducto(Productos producto) {
		repository.actualizarProducto(producto);

	}

	@Override
	public void eliminarProducto(Integer id) {
		repository.eliminarProducto(id);

	}

	@Override
	public List<Productos> listarProductos() {
		// TODO Auto-generated method stub
		return repository.listarProductos();
	}

	@Override
	public Productos obtenerProductoId(Integer id) {
		// TODO Auto-generated method stub
		return repository.obtenerProductoId(id);
	}

}
