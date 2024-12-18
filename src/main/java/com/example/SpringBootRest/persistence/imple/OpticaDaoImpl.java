package com.example.SpringBootRest.persistence.imple;

import com.example.SpringBootRest.entities.Optica;
import com.example.SpringBootRest.persistence.OpticaDao;
import com.example.SpringBootRest.repository.OpticaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class OpticaDaoImpl implements OpticaDao {

   @Autowired
  private OpticaRepository opticaRepository;
    @Override
    public List<Optica> findall() {
        return (List<Optica>)opticaRepository.findAll();
    }

    @Override
    public Optional<Optica> findById(Long id) {
        return opticaRepository.findById(id);
    }

    @Override
    public void save(Optica optica) {opticaRepository.save(optica);
    }

    @Override
    public void deleteById(Long id) {
    opticaRepository.deleteById(id);
    }
}
