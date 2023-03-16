
package com.example.base.de.datos.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.base.de.datos.model.Producto;
import com.example.base.de.datos.repository.ProductoRepository;

@Service

public class ProductoService {

	@Autowired
	ProductoRepository productoRepository;

	public Iterable<Producto> findAll() {
		return productoRepository.findAll();
	}

	public Iterable<Producto> findByNombre(String nombre) {

		return productoRepository.findByNombre(nombre);
	}

	public Producto save(Producto producto) {

		return productoRepository.save(producto);
	}

	public Iterable<Producto> findByPrecio(float precio) {
		return productoRepository.findByPrecio(precio);
	}

	public Optional<Producto> findById(int id) {
		return productoRepository.findById(id);
	}

	

	
	
}