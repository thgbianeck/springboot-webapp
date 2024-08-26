package br.com.bianeck.curso.springboot.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.bianeck.curso.springboot.webapp.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Thiago", "Bianeck", "thiagobianeck@gmail.com");
        model.addAttribute("title", "Hola Mundo en Spring Boot");
        model.addAttribute("user", user);
        return "details";
    }
}
