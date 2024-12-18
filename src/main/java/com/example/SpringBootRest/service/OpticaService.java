package com.example.SpringBootRest.service;

import com.example.SpringBootRest.entities.Optica;
import com.example.SpringBootRest.repository.OpticaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OpticaService implements IOpticaService {
private OpticaRepository opticaRepository;


    @Override
    public List<Optica> findall() {
        return List.of();
    }

    @Override
    public Optional<Optica> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Optica optica) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
