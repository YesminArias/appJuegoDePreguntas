package com.appJuegoDePreguntas.demo.service.impl;


import com.appJuegoDePreguntas.demo.dtos.NewUserDto;
import com.appJuegoDePreguntas.demo.dtos.ScoreResponse;
import com.appJuegoDePreguntas.demo.dtos.UserDto;
import com.appJuegoDePreguntas.demo.model.Jugador;
import com.appJuegoDePreguntas.demo.model.Score;
import com.appJuegoDePreguntas.demo.repository.JugadorRepository;
import com.appJuegoDePreguntas.demo.repository.ScoreRepository;
import com.appJuegoDePreguntas.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    final private JugadorRepository userRepository;
    final private ScoreRepository scoreRepository;

    public UserServiceImpl(JugadorRepository userRepository, ScoreRepository scoreRepository) {
        this.userRepository = userRepository;
        this.scoreRepository = scoreRepository;
    }

    @Override
    public NewUserDto createUser(UserDto userDto) {
        Jugador jugador = new Jugador();
        Score score = new Score();
        score.setScore(0);
        jugador.setName(userDto.getName());

        jugador = userRepository.save(jugador);
        score.setIdJugador(jugador.getId());
        scoreRepository.save(score);
        return new NewUserDto(jugador.getId(), jugador.getName());
    }

    @Override
    public List<Jugador> getUser() {

        return (List<Jugador>)userRepository.findAll();
    }

    @Override
    public ScoreResponse getScoreByIdJugador(Long idJugador) {
       Score score = scoreRepository.findScoreByIdJugador(idJugador);

       return new ScoreResponse("Fin del juego", score.getScore());
    }
}
