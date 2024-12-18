package com.example.SpringBootRest.service;

import com.example.SpringBootRest.entities.Article;
import com.example.SpringBootRest.entities.Optica;

import java.util.List;
import java.util.Optional;

public interface IOpticaService {

    List<Optica> findall();

    Optional<Optica> findById(Long id);

    void save(Optica optica);

    void deleteById(Long id);

}
