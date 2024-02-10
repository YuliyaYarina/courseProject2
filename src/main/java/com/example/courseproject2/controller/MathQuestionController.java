package com.example.courseproject2.controller;

import com.example.courseproject2.domain.Question;
import com.example.courseproject2.servise.impl.QuestionService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class MathQuestionController {

@Qualifier("MathQuestionService") //???
    private QuestionService questionService;

    @GetMapping("/add")
    public Question addMathematicalQuestions(@RequestParam String question, @RequestParam String answer) {
        return questionService.add(question, answer);
    }


    @GetMapping("/remove")
    public Question removeMathematicalQuestion(@RequestParam String question, @RequestParam String answer) {
        return questionService.remove(new Question(question, answer));
    }

    @GetMapping("/find")
    public Collection<Question> getMathematicalQuestion() {
        return questionService.getAll();
    }

}

