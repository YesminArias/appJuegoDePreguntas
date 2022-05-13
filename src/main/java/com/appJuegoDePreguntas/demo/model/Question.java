package com.appJuegoDePreguntas.demo.model;

import javax.persistence.Entity;
import java.util.Map;

@Entity
public class Question {

    private long id;
    private Integer level;
    private Map <Integer, String > answer;
    private String question;
    private Integer correctAnswer;

    public Question(long id, Integer level, Map<Integer, String> answer, String question, Integer correctAnswer) {
        this.id = id;
        this.level = level;
        this.answer = answer;
        this.question = question;
        this.correctAnswer = correctAnswer;
    }

    public Integer getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(Integer correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Map<Integer, String> getAnswer() {
        return answer;
    }

    public void setAnswer(Map<Integer, String> answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
