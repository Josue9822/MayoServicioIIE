package com.idat.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.DTO.ProductoDTOResponse;
import com.idat.model.Productos;
import com.idat.repository.ProductoRepository;

@Service
public class ProductosServiceImpl implements ProductoService {
	
	@Autowired
	ProductoRepository repository;

	@Override
	public void guardarProducto(ProductoDTOResponse productos) {
		
		Productos p = new Productos();
		p.setNombreProducto(productos.getNombreProducto());
		p.setDescripcion(p.getDescripcion());
		p.setPrecio(productos.getPrecioProducto());
		p.setStock(productos.getStockProducto());
		repository.save(p);

	}

	@Override
	public void actualizarProducto(ProductoDTOResponse productos) {
		
		Productos p = new Productos();
		p.setIdProducto(productos.getIdProducto());
		p.setNombreProducto(productos.getNombreProducto());
		p.setDescripcion(p.getDescripcion());
		p.setPrecio(productos.getPrecioProducto());
		p.setStock(productos.getStockProducto());

		repository.saveAndFlush(p);

	}

	@Override
	public void eliminarProducto(Integer id) {
		repository.deleteById(id);

	}

	@Override
	public List<ProductoDTOResponse> listarProductos() {
		
		List<ProductoDTOResponse> listar = new ArrayList<>();
		ProductoDTOResponse dto = null;
		List<Productos> p = repository.findAll();
		
		for(Productos productos : p) {
			dto = new ProductoDTOResponse();
			dto.setDescripcionProducto(productos.getDescripcion());
			dto.setNombreProducto(productos.getNombreProducto());
			dto.setPrecioProducto(productos.getPrecio());
			dto.setStockProducto(productos.getStock());
			dto.setIdProducto(productos.getIdProducto());
			
			listar.add(dto);
			
		}
		
		return listar;
	}

	@Override
	public ProductoDTOResponse obtenerProducto(Integer id) {
		
		Productos productos = repository.findById(id).orElse(null);
		ProductoDTOResponse dto = new ProductoDTOResponse();
		
		dto.setDescripcionProducto(productos.getDescripcion());
		dto.setNombreProducto(productos.getNombreProducto());
		dto.setPrecioProducto(productos.getPrecio());
		dto.setStockProducto(productos.getStock());
		dto.setIdProducto(productos.getIdProducto());
		
		return dto;
		
		
	}

}
