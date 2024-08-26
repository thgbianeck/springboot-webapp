package br.com.bianeck.curso.springboot.webapp.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bianeck.curso.springboot.webapp.models.User;
import br.com.bianeck.curso.springboot.webapp.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details() {
        UserDto userDto = new UserDto();
        User user = new User("Thiago", "Bianeck");
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo en Spring Boot");

        return userDto;
    }

    @GetMapping("/list")
    public List<User> list() {
        return List.of(
                new User("Thiago", "Bianeck"),
                new User("Lucas", "Carvalho"),
                new User("Maria", "Souza"),
                new User("João", "Pereira"),
                new User("Daniel", "Silva"),
                new User("Rafael", "Costa"),
                new User("Patrícia", "Alves"));
    }

    @GetMapping("/details-map")
    public Map<String, Object> detailsMap() {

        User user = new User("Thiago", "Bianeck");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola Mundo en Spring Boot");
        body.put("user", user);
        return body;
    }
}
