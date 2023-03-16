package com.example.base.de.datos.repository;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.base.de.datos.model.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Integer> {

	Iterable<Producto> findByNombre(String nombre);

	Iterable<Producto> findByPrecio(float precio);

	
}
