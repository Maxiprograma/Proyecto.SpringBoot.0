package com.example.SpringBootRest.persistence.imple;

import com.example.SpringBootRest.entities.User;
import com.example.SpringBootRest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserDaoImpl {
@Autowired
    private UserRepository userRepository;

@Autowired
public List<User> findAll(){
    return (List<User>) userRepository.findAll();
    }

@Autowired
public Optional<User> findById(Long id){
    return userRepository.findById(id);
}

}
