package com.appJuegoDePreguntas.demo.service;

import com.appJuegoDePreguntas.demo.dtos.NewUserDto;
import com.appJuegoDePreguntas.demo.dtos.ScoreResponse;
import com.appJuegoDePreguntas.demo.dtos.UserDto;
import com.appJuegoDePreguntas.demo.model.Jugador;

import java.util.List;

public interface UserService {
    NewUserDto createUser(UserDto userDto);

    List<Jugador> getUser();

    ScoreResponse getScoreByIdJugador(Long idJugador);



}