package com.appJuegoDePreguntas.demo.dtos;

import java.util.List;
import java.util.Map;

public class QuestionDto {

    private Long id;
    private String question;
    private Integer level;
    private List<String> answers;
    private static String correctAnswer;

    public QuestionDto() {
    }

    public QuestionDto(Long id, String question, Integer level, List<String> answers, String correctAnswer) {
        this.id = id;
        this.question = question;
        this.level = level;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
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

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
