package com.sparksx.curso.pringboot.webapp.springboot_web_mvc.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@RestController // Se le declara que es un controller de tipo Rest
@RequestMapping("/api") // Prefix de la ruta
public class UserRestController {

    @GetMapping("/details") // Esta es la ruta
    public Map<String, Object> details(){ //No lleva el model porque ya no vamos a regresar una vista si no solo datos
        Map<String, Object> response = new HashMap<>();
        response.put("title", "Hola mundo Spring Boot");
        response.put("name", "Sparksx");
        response.put("dev", "fullstack");

        return response; 
    }
}
