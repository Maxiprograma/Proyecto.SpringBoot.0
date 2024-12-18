package com.example.SpringBootRest.repository;

import com.example.SpringBootRest.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article,Long> {

}
