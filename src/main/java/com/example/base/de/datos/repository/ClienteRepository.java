package com.example.base.de.datos.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.base.de.datos.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
	Iterable<Cliente> findByNombre(String nombre);

}
