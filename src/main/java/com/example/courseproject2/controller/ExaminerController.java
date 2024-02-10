package com.example.courseproject2.controller;

import com.example.courseproject2.domain.Question;
import com.example.courseproject2.servise.impl.ExaminerService;
import com.example.courseproject2.servise.impl.QuestionService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/exam")
public class ExaminerController {

    ExaminerService examinerService;
//    @Qualifier
//    private QuestionService questionService;

//@GetMapping("/get/{amount}")
//    public Collection<Question> getQuestions(@PathVariable int amount) {
//
//    return examinerService.getQuestions(amount);
//}
}
