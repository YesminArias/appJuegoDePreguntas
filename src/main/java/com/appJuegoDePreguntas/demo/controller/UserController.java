package com.appJuegoDePreguntas.demo.controller;

import com.appJuegoDePreguntas.demo.dtos.UserDto;
import com.appJuegoDePreguntas.demo.model.Jugador;
import com.appJuegoDePreguntas.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {

        this.userService = userService;
    }

    @GetMapping
    public List<Jugador> get(){
        return userService.getUser();
    }


    @PostMapping("/new")
    public String post(@RequestBody UserDto userDto){
        userService.createUser(userDto);
        return userDto.getName();
    }
}
