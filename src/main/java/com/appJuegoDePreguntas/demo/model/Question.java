package com.appJuegoDePreguntas.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer level;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Answer> answers;

    private String question;
    private String answer;

    public Question() {
    }

    public Question(Long id, Integer level, Set<Answer> answers, String question, String answer) {
        this.id = id;
        this.level = level;
        this.answers = answers;
        this.question = question;
        this.answer = answer;
    }

    public Long getIdQuestion() {
        return id;
    }

    public void setIdQuestion(Long id) {
        this.id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Set<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<Answer> answers) {
        this.answers = answers;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
