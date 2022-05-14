package com.appJuegoDePreguntas.demo.service;

import com.appJuegoDePreguntas.demo.dtos.UserDto;
import com.appJuegoDePreguntas.demo.model.Jugador;

import java.util.List;

public interface UserService {
    String createUser(UserDto userDto);

    List<Jugador> getUser();
}