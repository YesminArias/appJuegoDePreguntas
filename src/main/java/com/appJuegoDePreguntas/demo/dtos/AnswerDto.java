package com.appJuegoDePreguntas.demo.dtos;

public class AnswerDto {
    private String rta;
    private Long idQuestion;
    private Long idJugador;

    public AnswerDto() {
    }

    public AnswerDto(String rta, Long idQuestion, Long idJugador) {
        this.rta = rta;
        this.idQuestion = idQuestion;
        this.idJugador = idJugador;
    }

    public String getRta() {
        return rta;
    }

    public void setRta(String rta) {
        this.rta = rta;
    }

    public Long getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(Long idQuestion) {
        this.idQuestion = idQuestion;
    }

    public Long getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(Long idJugador) {
        this.idJugador = idJugador;
    }
}
