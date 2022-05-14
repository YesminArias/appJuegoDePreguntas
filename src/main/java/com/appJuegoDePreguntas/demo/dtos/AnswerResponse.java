package com.appJuegoDePreguntas.demo.dtos;

public class AnswerResponse {

    private String message;
    private Integer score;

    public AnswerResponse(String message, Integer score) {
        this.message = message;
        this.score = score;
    }

    public AnswerResponse() {
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
