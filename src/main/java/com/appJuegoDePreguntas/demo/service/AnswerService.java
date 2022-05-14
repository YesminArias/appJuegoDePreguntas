package com.appJuegoDePreguntas.demo.service;

import com.appJuegoDePreguntas.demo.dtos.AnswerDto;
import com.appJuegoDePreguntas.demo.dtos.AnswerResponse;
import com.appJuegoDePreguntas.demo.model.Answer;

import java.util.List;

public interface AnswerService {

    AnswerResponse correctAnswer(AnswerDto answerDto);
}
