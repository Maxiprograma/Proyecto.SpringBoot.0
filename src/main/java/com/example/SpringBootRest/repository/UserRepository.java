package com.example.SpringBootRest.repository;

import com.example.SpringBootRest.entities.Article;
import com.example.SpringBootRest.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>  {



}
