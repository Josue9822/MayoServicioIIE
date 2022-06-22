package com.idat.service;

import java.util.List;

import com.idat.DTO.ProductoDTOResponse;
import com.idat.model.Productos;

public interface ProductoService {

	void guardarProducto(ProductoDTOResponse productos);
	void actualizarProducto(ProductoDTOResponse productos);
	void eliminarProducto(Integer id);
	List<ProductoDTOResponse> listarProductos();
	ProductoDTOResponse obtenerProducto(Integer id);
	
}
