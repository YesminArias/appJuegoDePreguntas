package com.appJuegoDePreguntas.demo.controller;

import com.appJuegoDePreguntas.demo.dtos.QuestionDto;
import com.appJuegoDePreguntas.demo.dtos.QuestionResponse;
import com.appJuegoDePreguntas.demo.model.Question;
import com.appJuegoDePreguntas.demo.service.ServiceQuestion;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    private final ServiceQuestion serviceQuestion;

    public QuestionController(ServiceQuestion serviceQuestion) {
        this.serviceQuestion = serviceQuestion;
    }

    @GetMapping("/all")
    public List<Question> getAll(){
        return serviceQuestion.getQuestions();
    }

    @GetMapping()
    public QuestionResponse get(@RequestParam Integer level){
        QuestionResponse questionResponse = serviceQuestion.getQuestionByLevel(level);
        return questionResponse;
    }

    @PostMapping
    public String create(@RequestBody List<QuestionDto> questionDtos){
        serviceQuestion.createQuestion(questionDtos);
        return "created";
    }

}
