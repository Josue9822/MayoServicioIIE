package com.idat.MayoServicioPrueba.service;

import java.util.List;

import com.idat.MayoServicioPrueba.DTO.ProductoDTOResponse;
import com.idat.MayoServicioPrueba.model.Productos;

public interface ProductoService {

	void guardarProducto(ProductoDTOResponse productos);
	void actualizarProducto(ProductoDTOResponse productos);
	void eliminarProducto(Integer id);
	List<ProductoDTOResponse> listarProductos();
	ProductoDTOResponse obtenerProducto(Integer id);
	
}
