package com.example.courseproject2.servise;

import com.example.courseproject2.domain.Question;
import com.example.courseproject2.exc.ExceptionLotQuestionsHaveRequested;
import com.example.courseproject2.servise.impl.ExaminerService;
import com.example.courseproject2.servise.impl.QuestionService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Service
public class ExaminerServiceImpl implements ExaminerService {

    private final Random random = new Random();
    private QuestionService questionService;

    public ExaminerServiceImpl(@Qualifier("javaQuestionService") QuestionService questionService) {
        this.questionService = questionService;
    }

//    @Override
//    public Collection<Question> getQuestions(int amount) {
//        if (questionService.getAll().size() < amount) {
//            throw new ExceptionLotQuestionsHaveRequested("не достаточно вопросов в индексе");
//        }
//        Set<Question> questions = new HashSet<>();
//
//        while (questions.size() < amount) {
//            questions.add(questionService.getRandomQuestion());
//        }
//
//        return questions;
//    }

//     @Override
//    public Collection<Question> getMatQuestions(int amount) {
//        if (questionService.getAll().size() < amount) {
//            throw new ExceptionLotQuestionsHaveRequested("не достаточно вопросов в индексе");
//        }
//        Set<Question> questions = new HashSet<>();
//
//        while (questions.size() < amount) {
//            questions.add(questionService.getRandomQuestion());
//        }
//
//        return questions;
//    }


}
