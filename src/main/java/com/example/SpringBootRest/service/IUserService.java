package com.example.SpringBootRest.service;

import com.example.SpringBootRest.entities.Article;
import com.example.SpringBootRest.entities.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    List<User> findall();


    Optional<User> findById(Long id);


    void save(Article article);

    void save(User user);

    void deleteById(Long id);





}
