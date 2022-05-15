package com.appJuegoDePreguntas.demo.dtos;

public class ScoreResponse {
    private String message;
    private Integer score;

    public ScoreResponse() {
    }

    public ScoreResponse(String message,  Integer score) {
        this.message = message;

        this.score = score;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
