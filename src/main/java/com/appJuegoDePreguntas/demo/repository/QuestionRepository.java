package com.appJuegoDePreguntas.demo.repository;

import com.appJuegoDePreguntas.demo.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findQuestionByLevel(Integer level);
}
