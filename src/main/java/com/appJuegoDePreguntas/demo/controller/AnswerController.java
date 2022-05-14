package com.appJuegoDePreguntas.demo.controller;

import com.appJuegoDePreguntas.demo.dtos.AnswerDto;
import com.appJuegoDePreguntas.demo.dtos.AnswerResponse;
import com.appJuegoDePreguntas.demo.service.AnswerService;
import com.appJuegoDePreguntas.demo.service.impl.AnswerServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/answer")
public class AnswerController {

    private final AnswerService answerService;

    public AnswerController(AnswerServiceImpl answerService) {
        this.answerService = answerService;
    }

    @GetMapping
    public AnswerResponse get(@RequestBody AnswerDto answerDto){
        AnswerResponse answerResponse = answerService.correctAnswer(answerDto);

        return answerResponse;

    }
}
