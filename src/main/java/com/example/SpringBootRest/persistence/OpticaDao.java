package com.example.SpringBootRest.persistence;

import com.example.SpringBootRest.entities.Article;
import com.example.SpringBootRest.entities.Optica;
import com.example.SpringBootRest.entities.User;

import java.util.List;
import java.util.Optional;

public interface OpticaDao {

List<Optica> findall();

Optional <Optica> findById(Long id);

void save(Optica optica);

void deleteById(Long id);


}
