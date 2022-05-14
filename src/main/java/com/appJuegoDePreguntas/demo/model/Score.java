package com.appJuegoDePreguntas.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Score {
    @Id
    @GeneratedValue
    private long id ;
    @Column(name= "id_jugador")
    private long idJugador;
    private int score;

    public Score(long id, long idJugador, int score) {
        this.id = id;
        this.idJugador = idJugador;
        this.score = score;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(long idJugador) {
        this.idJugador = idJugador;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
