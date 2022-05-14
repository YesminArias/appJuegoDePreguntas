package com.appJuegoDePreguntas.demo.service.impl;

import com.appJuegoDePreguntas.demo.repository.AnswerRepository;
import org.springframework.stereotype.Service;

@Service
public class AnswerServiceImpl {
    final private AnswerRepository answerRepository;

    public AnswerServiceImpl(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }
}
