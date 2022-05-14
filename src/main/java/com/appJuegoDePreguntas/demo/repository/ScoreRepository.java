package com.appJuegoDePreguntas.demo.repository;

import com.appJuegoDePreguntas.demo.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Long> {
    Score findScoreByIdJugador(Long idJugador);
}
