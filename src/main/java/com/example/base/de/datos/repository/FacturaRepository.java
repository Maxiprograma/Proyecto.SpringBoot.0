package com.example.base.de.datos.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.base.de.datos.model.Cliente;
import com.example.base.de.datos.model.Factura;

public interface FacturaRepository extends CrudRepository<Factura, Integer> {

	Iterable<Factura> findByTotal(float total);

	Iterable<Factura> findByCliente(Cliente cliente);

	Optional<Factura> findAllById(int id);

	

}
