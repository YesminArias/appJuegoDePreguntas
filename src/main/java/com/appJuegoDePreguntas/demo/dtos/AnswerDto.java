package com.appJuegoDePreguntas.demo.dtos;

public class AnswerDto {
    private String text;

    public AnswerDto(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
