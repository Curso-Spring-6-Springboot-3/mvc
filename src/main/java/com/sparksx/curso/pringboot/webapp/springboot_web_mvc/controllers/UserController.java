package com.sparksx.curso.pringboot.webapp.springboot_web_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details") // Esta es la ruta
    public String details(Model model){
        model.addAttribute("title", "Hola mundo Spring Boot");
        model.addAttribute("name", "Sparksx");
        model.addAttribute("dev", "fullstack");

        return "details";  // Lo que está dentro de "" hace referencia al template que estoy ocupando dentro de src/main/resources/templates
    }
}
