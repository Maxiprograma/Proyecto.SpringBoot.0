package com.example.SpringBootRest.service;

import com.example.SpringBootRest.entities.Article;
import com.example.SpringBootRest.excepciones.BussinesException;
import com.example.SpringBootRest.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public void save(Article article) throws BussinesException {
        if (articleRepository.findByNombre(article.getNombreArticulo()) == null) {
            articleRepository.save(article);
        } else {
          throw new BussinesException("El Articulo con el nombre: "+ article.getNombreArticulo() + " ya esta registrado en la DB!");
        }
    }

    @Override
    @Transactional
    public void deleteById(Long id) throws BussinesException {
        try {
            Optional<Article> articulo = articleRepository.findById(id);
            Article articuloBorrado = articulo.get();
            articuloBorrado.setBorrado(true);
        } catch (Exception e) {
            throw new BussinesException("Error" + e);
        }
    }

}






