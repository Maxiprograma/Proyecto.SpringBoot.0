package com.example.SpringBootRest.repository;

import com.example.SpringBootRest.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article,Long> {

    @Query("SELECT a FROM Article a WHERE a.nombreArticulo = :nombre")
    Article findByNombre(@Param("nombre") String nombre);

    @Query("SELECT a FROM Article a WHERE a.borrado = false")
    @Override
    List<Article> findAll();

}
