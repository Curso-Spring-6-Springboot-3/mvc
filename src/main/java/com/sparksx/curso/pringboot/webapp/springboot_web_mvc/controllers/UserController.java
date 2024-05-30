package com.sparksx.curso.pringboot.webapp.springboot_web_mvc.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

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

    @GetMapping("/list")
    public String list(ModelMap model){
        List<User> users = Arrays.asList(
            new User("Usuario1", "apellido"),
            new User("Usuario2", "apellido"),
            new User("Usuario3", "apellido")
        );
        users.get(0).setEmail("test@gmail.com");
        model.addAttribute("users", users);
        model.addAttribute("title", "Lista de usuarios");
        return "list";
    }

    // En caso de que quisieramos reutilizar los datos
    @ModelAttribute("users") // <- le llamamos "users" porque en la plantilla lo ocupamos como users en thymeleaf
    public List<User> usersModel(){
        List<User> users = Arrays.asList(
            new User("Usuario1", "apellido"),
            new User("Usuario2", "apellido"),
            new User("Usuario3", "apellido")
        );
        return users;
    }
}
