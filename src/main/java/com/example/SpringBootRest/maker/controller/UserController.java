package com.example.SpringBootRest.maker.controller;

import com.example.SpringBootRest.entities.User;
import com.example.SpringBootRest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("user")
public class UserController {
    @Autowired
    private UserService userService;

@GetMapping("/alluser")
public ResponseEntity<User>allUser(@RequestBody User user){
    List<User>userList=userService.findall();

    return ResponseEntity.ok().build();
}
@GetMapping("/allid/{id}")
 public  ResponseEntity<User>findId(@PathVariable Long id){
    Optional<User>allId=userService.findById(id);

    return ResponseEntity.ok().build();
}

@PostMapping("/saveuser")
public ResponseEntity<User>saveUser(@RequestBody User user) throws URISyntaxException {

    return ResponseEntity.created(new URI("api/user/save")).build();
}

@PutMapping("/update/user")
public ResponseEntity.BodyBuilder updateUser(@PathVariable Long id, @RequestBody User user){
    Optional<User>userOptional;
    userOptional = userService.findById(id);

    return ResponseEntity.ok();
}

@DeleteMapping("/delete/{id}")
public ResponseEntity deleteUser(@PathVariable Long id){
    if (id != null) {
        userService.deleteById(id);
        return ResponseEntity.ok("Registro Eliminado");
    }

    return ResponseEntity.badRequest().build();
}




}

