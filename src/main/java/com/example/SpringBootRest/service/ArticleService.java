package com.example.SpringBootRest.service;

import com.example.SpringBootRest.entities.Article;
import com.example.SpringBootRest.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ArticleService implements IArticleService {
@Autowired
private ArticleRepository articleRepository;

    @Override
    public List<Article> findall() {
        return articleRepository.findAll();
    }

    @Override
    public Optional<Article> findById(Long id) {
        return articleRepository.findById(id);
    }

    @Override
    public void save(Article article) {
        articleRepository.save(article);
    }

    @Override
    public void deleteById(Long id) {

    }
}






