package com.example.courseproject2.controller;

import com.example.courseproject2.domain.Question;
import com.example.courseproject2.servise.impl.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
public class JavaQuestionControlle {
   private QuestionService service;
   private Question question;

//    Добавить: “/exam/java/add?question=QuestionText&answer=QuestionAnswer”
//
//    Удалить: “/exam/java/remove?question=QuestionText&answer=QuestionAnswer”
//
//    Получить все вопросы: “/exam/java”

    public JavaQuestionControlle(QuestionService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public Question addQuestion(@RequestParam String question, @RequestParam String answer) {
        return null;
    }

//    @GetMapping
//    public Question add(@RequestParam Question question) {
//        return null;
//    }

   @GetMapping
    public Question removeQuestion(@RequestParam Question question) {
        return null;
    }

    @GetMapping
    public Collection<Question> get() {
        return null;
    }

//    @GetMapping("/exam/get/{amount}")
//    public Question getRandomQuestion() {
//        return null;
//    }


}
