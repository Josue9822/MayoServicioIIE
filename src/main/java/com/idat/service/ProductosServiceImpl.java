package com.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.model.Productos;
import com.idat.repository.ProductoRepository;

@Service
public class ProductosServiceImpl implements ProductoService {
	
	@Autowired
	ProductoRepository repository;

	@Override
	public void guardarProducto(Productos productos) {
		repository.save(productos);

	}

	@Override
	public void actualizarProducto(Productos productos) {
		repository.saveAndFlush(productos);

	}

	@Override
	public void eliminarProducto(Integer id) {
		repository.deleteById(id);

	}

	@Override
	public List<Productos> listarProductos() {
		
		return repository.findAll();
	}

	@Override
	public Productos obtenerProducto(Integer id) {
		
		return repository.findById(id).orElse(null);
	}

}
