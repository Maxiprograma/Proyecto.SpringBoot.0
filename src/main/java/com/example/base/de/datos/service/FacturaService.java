package com.example.base.de.datos.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.base.de.datos.model.Cliente;
import com.example.base.de.datos.model.Factura;
import com.example.base.de.datos.repository.FacturaRepository;

@Service
public class FacturaService {
	@Autowired
	FacturaRepository facturaRepository;

	public Iterable<Factura> findAll() {
		return facturaRepository.findAll();
	}

	public Factura save(Factura factura) {

		return facturaRepository.save(factura);
	}

	public Iterable<Factura> findByTotal(float total) {
		return facturaRepository.findByTotal(total);
	}

	public Iterable<Factura> findByCliente(Cliente cliente) {
		return facturaRepository.findByCliente(cliente);
	}

	public Optional<Factura> findById(int id) {
		return facturaRepository.findById(id);
	}
}

