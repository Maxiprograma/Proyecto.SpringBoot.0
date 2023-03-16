package com.example.base.de.datos.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.base.de.datos.model.Cliente;
import com.example.base.de.datos.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository clienteRepository;

	public Iterable<Cliente> findAll() {
		return clienteRepository.findAll();
	}

	public Cliente save(Cliente cliente) {

		return clienteRepository.save(cliente);
	}

	public Iterable<Cliente> findByNombre(String nombre) {
		return clienteRepository.findByNombre(nombre);
	}

	public Optional<Cliente> findById(int id) {
		return clienteRepository.findById(id);
	}



}
