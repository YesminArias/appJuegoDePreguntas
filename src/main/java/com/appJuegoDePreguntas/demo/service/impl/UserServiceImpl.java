package com.appJuegoDePreguntas.demo.service.impl;


import com.appJuegoDePreguntas.demo.dtos.UserDto;
import com.appJuegoDePreguntas.demo.model.Jugador;
import com.appJuegoDePreguntas.demo.repository.JugadorRepository;
import com.appJuegoDePreguntas.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    final private JugadorRepository userRepository;

    public UserServiceImpl(JugadorRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String createUser(UserDto userDto) {
        Jugador jugador = new Jugador();
        jugador.setName(userDto.getName());
        userRepository.save(jugador);
        return jugador.getName();
    }

    @Override
    public List<Jugador> getUser() {

        return (List<Jugador>)userRepository.findAll();
    }
}
