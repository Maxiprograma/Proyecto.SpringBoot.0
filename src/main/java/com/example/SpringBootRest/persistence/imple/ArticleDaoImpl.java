package com.example.SpringBootRest.persistence.imple;

import com.example.SpringBootRest.entities.Article;
import com.example.SpringBootRest.persistence.ArticleDao;
import com.example.SpringBootRest.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class ArticleDaoImpl implements ArticleDao {
    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public List<Article> findall() {

        return (List<Article>)articleRepository.findAll();
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
     articleRepository.deleteById(id);
    }
}
