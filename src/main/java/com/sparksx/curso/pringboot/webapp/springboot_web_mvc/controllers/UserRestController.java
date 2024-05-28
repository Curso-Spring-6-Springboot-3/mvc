package com.sparksx.curso.pringboot.webapp.springboot_web_mvc.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sparksx.curso.pringboot.webapp.springboot_web_mvc.models.User;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@RestController // Se le declara que es un controller de tipo Rest
@RequestMapping("/api") // Prefix de la ruta
public class UserRestController {

    @GetMapping("/details") // Esta es la ruta
    public Map<String, Object> details(){ //No lleva el model porque ya no vamos a regresar una vista si no solo datos

        User user = new User("David", "Ley");

        Map<String, Object> response = new HashMap<>();

        response.put("title", "Hola mundo Spring Boot");
        response.put("user", user);
        return response; 
    }
}
