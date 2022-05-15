package com.appJuegoDePreguntas.demo.controller;

import com.appJuegoDePreguntas.demo.dtos.NewUserDto;
import com.appJuegoDePreguntas.demo.dtos.ScoreResponse;
import com.appJuegoDePreguntas.demo.dtos.UserDto;
import com.appJuegoDePreguntas.demo.model.Jugador;
import com.appJuegoDePreguntas.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
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
    public NewUserDto post(@RequestBody UserDto userDto){
        return userService.createUser(userDto);
    }
    @GetMapping("/finish")
    public ScoreResponse get(@RequestParam Long idJugador){
        ScoreResponse scoreResponse = userService.getScoreByIdJugador(idJugador);
        return scoreResponse;
    }
}
