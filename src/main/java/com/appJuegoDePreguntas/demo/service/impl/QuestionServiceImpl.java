package com.appJuegoDePreguntas.demo.service.impl;

import com.appJuegoDePreguntas.demo.dtos.QuestionDto;
import com.appJuegoDePreguntas.demo.dtos.QuestionResponse;
import com.appJuegoDePreguntas.demo.model.Answer;
import com.appJuegoDePreguntas.demo.model.Question;
import com.appJuegoDePreguntas.demo.repository.QuestionRepository;
import com.appJuegoDePreguntas.demo.service.ServiceQuestion;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class QuestionServiceImpl implements ServiceQuestion {

    private final QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public String createQuestion(List<QuestionDto> questionDtos) {
        for(QuestionDto questionDto: questionDtos){
            Question question = new Question();
            Set<Answer> answers = getAnswers(questionDto);
            question.setQuestion(questionDto.getQuestion());
            System.out.println(questionDto.getCorrectAnswer());
            question.setAnswer(questionDto.getCorrectAnswer());
            question.setAnswers(answers);
            question.setLevel(questionDto.getLevel());
            questionRepository.save(question);
        }
        return null;
    }

    @Override
    public List<Question> getQuestions() {
        return questionRepository.findAll();
    }

    @Override
    public QuestionResponse getQuestionByLevel(Integer level) {
        List<Question> questions = questionRepository.findQuestionByLevel(level);
        int random = (int)(Math.random()*(4-0+1));
        Question questionResponse = questions.get(random);
        List<String> ans = createAnwersList(questionResponse.getAnswers());

        return new QuestionResponse(questionResponse.getIdQuestion(), questionResponse.getQuestion(), ans);
    }

    private List<String> createAnwersList(Set<Answer> answers) {
        List<String> answerList = new ArrayList<>();
        for(Answer answer: answers){
            answerList.add(answer.getText());
        }
        return answerList;
    }

    private Set<Answer> getAnswers(QuestionDto questionDto) {
        Set<Answer> answerList = new HashSet<>();
        for (String ans : questionDto.getAnswers()) {
            Answer answer = new Answer();
            answer.setText(ans);
            answerList.add(answer);
        }
        return answerList;
    }
}
