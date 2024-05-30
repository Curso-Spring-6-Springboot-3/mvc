package com.sparksx.curso.pringboot.webapp.springboot_web_mvc.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sparksx.curso.pringboot.webapp.springboot_web_mvc.models.User;
import com.sparksx.curso.pringboot.webapp.springboot_web_mvc.models.dto.UserDto;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController // Se le declara que es un controller de tipo Rest
@RequestMapping("/api") // Prefix de la ruta
public class UserRestController {

    // USANDO MAP
    @GetMapping(path="/details-map") // Esta es la ruta
    public Map<String, Object> detailsMap(){ //No lleva el model porque ya no vamos a regresar una vista si no solo datos

        User user = new User("David", "Ley");

        Map<String, Object> response = new HashMap<>();

        response.put("title", "Hola mundo Spring Boot");
        response.put("user", user);
        return response; 
    }

    @GetMapping(path="/details")
    public UserDto details(){

        UserDto userDto = new UserDto();

        User user = new User("David", "Ley");
        userDto.setUser(user);
        userDto.setTitle("Fullstack");
        
        return userDto;
    }

    @GetMapping(path="/list")
    public List<User> list(){
        User user1 = new User("David", "Ley");
        User user2 = new User("David", "Ley");
        User user3 = new User("David", "Ley");

        // Forma 1 de generar un array de objetos
        List<User> users = new ArrayList<>();

        users.add(user1);
        users.add(user2);
        users.add(user3);

        // Forma 2 de generar un array de objetos
        List<User> users2 = Arrays.asList(user1,user2,user3);

        return users2;
    }

}
