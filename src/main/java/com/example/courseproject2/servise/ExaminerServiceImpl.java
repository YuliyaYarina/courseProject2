package com.example.courseproject2.servise;

import com.example.courseproject2.domain.Question;
import com.example.courseproject2.servise.impl.ExaminerService;
import com.example.courseproject2.servise.impl.QuestionService;

import java.util.Collection;
import java.util.Random;

public class ExaminerServiceImpl implements ExaminerService {

    Random random;  //    ????
    QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    public Collection<Question> getQuestions(int amount) {

        return null;
    }

}
