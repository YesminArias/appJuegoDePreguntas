package com.appJuegoDePreguntas.demo.service;

import com.appJuegoDePreguntas.demo.dtos.QuestionDto;
import com.appJuegoDePreguntas.demo.dtos.QuestionResponse;
import com.appJuegoDePreguntas.demo.model.Question;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ServiceQuestion {

    String createQuestion(List<QuestionDto> questionDtos);
    List<Question> getQuestions();
    QuestionResponse getQuestionByLevel(Integer level);
}
