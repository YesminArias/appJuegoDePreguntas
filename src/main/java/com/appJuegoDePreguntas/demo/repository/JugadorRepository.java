package com.appJuegoDePreguntas.demo.repository;

import com.appJuegoDePreguntas.demo.model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JugadorRepository extends JpaRepository<Jugador, Long> {
}
