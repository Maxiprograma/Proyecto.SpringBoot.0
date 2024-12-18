package com.example.SpringBootRest.service;

import com.example.SpringBootRest.entities.Article;
import com.example.SpringBootRest.entities.User;
import com.example.SpringBootRest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserService implements IUserService {

    private com.example.SpringBootRest.entities.User User;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findall() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void save(Article article) {

    }


    @Override
    public void save(User user) {
        userRepository.save(User);
    }

    @Override
    public void deleteById(Long id) {

    }
}
