package com.appJuegoDePreguntas.demo.dtos;

import java.util.List;

public class QuestionResponse {
    private Long id;
    private String question;
    private List<String> answers;

    public QuestionResponse() {
    }

    public QuestionResponse(Long id, String question, List<String> answers) {
        this.id = id;
        this.question = question;
        this.answers = answers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }
}
