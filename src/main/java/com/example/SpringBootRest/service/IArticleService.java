package com.example.SpringBootRest.service;

import com.example.SpringBootRest.entities.Article;
import com.example.SpringBootRest.excepciones.BussinesException;

import java.util.List;
import java.util.Optional;

public interface IArticleService {

    List<Article> findall();

    Optional<Article> findById(Long id);

    void save(Article article) throws BussinesException ;

    void deleteById(Long id) throws BussinesException;

}
