package com.sparksx.curso.pringboot.webapp.springboot_web_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sparksx.curso.pringboot.webapp.springboot_web_mvc.models.User;

@Controller
public class UserController {

    @GetMapping("/details") // Esta es la ruta
    public String details(Model model){

        User user = new User("David", "Ley");

        model.addAttribute("title", "Hola mundo Spring Boot");
        model.addAttribute("user", user);
        user.setEmail("ley.chang@hotmail.com");
        return "details";  // Lo que está dentro de "" hace referencia al template que estoy ocupando dentro de src/main/resources/templates
    }
}
