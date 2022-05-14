package com.appJuegoDePreguntas.demo.service.impl;

import com.appJuegoDePreguntas.demo.dtos.AnswerDto;
import com.appJuegoDePreguntas.demo.dtos.AnswerResponse;
import com.appJuegoDePreguntas.demo.model.Question;
import com.appJuegoDePreguntas.demo.model.Score;
import com.appJuegoDePreguntas.demo.repository.QuestionRepository;
import com.appJuegoDePreguntas.demo.repository.ScoreRepository;
import com.appJuegoDePreguntas.demo.service.AnswerService;
import org.springframework.stereotype.Service;

@Service
public class AnswerServiceImpl implements AnswerService {

    private final QuestionRepository questionRepository;
    private final ScoreRepository scoreRepository;

    public AnswerServiceImpl(QuestionRepository questionRepository, ScoreRepository scoreRepository) {
        this.questionRepository = questionRepository;
        this.scoreRepository = scoreRepository;
    }

    @Override
    public AnswerResponse correctAnswer(AnswerDto answerDto) {
        Question question = questionRepository.findById(answerDto.getIdQuestion()).orElse(null);
        Score score = scoreRepository.findScoreByIdJugador(answerDto.getIdJugador());
        if(answerDto.getRta().equals(question != null ? question.getAnswer() : null)){
            score.setScore(score.getScore()+20);
            scoreRepository.save(score);
        }else {
            return new AnswerResponse("Respuesta Incorrecta", score.getScore());
        }
        return new AnswerResponse("Correcto", score.getScore());
    }

}
