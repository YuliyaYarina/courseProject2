package com.example.courseproject2.servise;

import com.example.courseproject2.domain.Question;
//import com.example.courseproject2.repository.MathQuestionRepository;
import com.example.courseproject2.servise.impl.QuestionService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Random;

//@Service
//public class MathQuestionService  implements QuestionService {
//
////    private QuestionService questionService;
//    private MathQuestionRepository mathQuestionRepository;
//
//    public MathQuestionService(MathQuestionRepository mathQuestionRepository) {
//        this.mathQuestionRepository = mathQuestionRepository;
//    }
//
//    @Override
//    public Question add(String question, String answer){
//        Question newQuestion = new Question(question, answer);
//
//        return mathQuestionRepository.remove(newQuestion);
//    }
//
//    @Override
//    public Question remove(Question question){
//        return mathQuestionRepository.remove(question);
//    }
//
//    @Override
//    public Collection<Question> getAll(){
//        return mathQuestionRepository.getAll();
//    }
//
////    @Override         //?????
////    public Question getRandomQuestion(){
////        return mathQuestionRepository.getRandomQuestion();
////    }
//
//}
