package com.example.SpringBootRest.maker.controller;




import com.example.SpringBootRest.entities.Article;
import com.example.SpringBootRest.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/article")

public class ArticleController {
    @Autowired
    private ArticleService articleservice;


    @GetMapping("/find/{id}")
    public ResponseEntity<Article> findById(@PathVariable long id) {
        Optional<Article> product = articleservice.findById(id);

        return ResponseEntity.ok().build();
    }

    @GetMapping("/findall")
    public ResponseEntity<Article> findall(@RequestBody Article article) {
        List<Article> articles = articleservice.findall();

        return ResponseEntity.ok().build();
    }


    @PostMapping("/save")
    public ResponseEntity save(@RequestBody Article article) throws URISyntaxException {
       return  ResponseEntity.created(new URI("/api/article/save")).build();
    }



@PutMapping("/update/{id}")
    public ResponseEntity.BodyBuilder update(@PathVariable Long id,@RequestBody Article article){
      Optional<Article>articleOptional;
       articleOptional=articleservice.findById(id);
       return ResponseEntity.ok();


    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteById(@PathVariable Long id) {
        if (id != null) {
            articleservice.deleteById(id);
            return ResponseEntity.ok("Registro Eliminado");
        }


        return ResponseEntity.badRequest().build();
    }






}





