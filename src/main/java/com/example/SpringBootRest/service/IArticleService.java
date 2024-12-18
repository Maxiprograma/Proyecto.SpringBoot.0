package com.example.SpringBootRest.service;

import com.example.SpringBootRest.entities.Article;

import java.util.List;
import java.util.Optional;

public interface IArticleService {

    List<Article> findall();

    Optional<Article> findById(Long id);

    void save(Article article);

    void deleteById(Long id);

}
