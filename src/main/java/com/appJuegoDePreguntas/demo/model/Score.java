package com.appJuegoDePreguntas.demo.model;

import javax.persistence.Entity;

@Entity

public class Score {

    private long id ;
    private long idUser;
    private int score;

    public Score(long id, long idUser, int score) {
        this.id = id;
        this.idUser = idUser;
        this.score = score;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
