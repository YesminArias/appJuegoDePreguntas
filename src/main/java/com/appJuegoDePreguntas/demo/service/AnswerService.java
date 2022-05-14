package com.appJuegoDePreguntas.demo.service;

import com.appJuegoDePreguntas.demo.dtos.AnswerDto;
import com.appJuegoDePreguntas.demo.model.Answer;

import java.util.List;

public interface AnswerService {

    String createAnswer(AnswerDto answerDto);

    List<Answer> getAnswer();
}
