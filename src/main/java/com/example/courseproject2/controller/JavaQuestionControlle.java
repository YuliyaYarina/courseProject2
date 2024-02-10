package com.example.courseproject2.controller;

import com.example.courseproject2.domain.Question;
import com.example.courseproject2.servise.impl.QuestionService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
public class JavaQuestionControlle {

//   @Qualifier("JavaQuestionService") //???
   private QuestionService questionService;


//    Добавить: “/exam/java/add?question=QuestionText&answer=QuestionAnswer”
//
//    Удалить: “/exam/java/remove?question=QuestionText&answer=QuestionAnswer”
//
//    Получить все вопросы: “/exam/java”

    @GetMapping("/add")
    public Question addQuestion(@RequestParam String question, @RequestParam String answer) {
        return questionService.add(question, answer);
    }


   @GetMapping("/remove")
    public Question removeQuestion(@RequestParam String question, @RequestParam String answer) {
        return questionService.remove(new Question(question, answer));
    }

    @GetMapping("/find")
    public Collection<Question> get() {
        return questionService.getAll();
    }

}
