package com.example.courseproject2.repository;

import com.example.courseproject2.domain.Question;
import com.example.courseproject2.servise.impl.QuestionRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.*;
//
//@Repository
//public class MathQuestionRepository implements QuestionRepository {
//    private final Set<Question> mathQuestions = new HashSet<>();
//    private final Random random = new Random();
//
//
//    @PostConstruct
//    public void init() {
//       add("2+2.", "4");
//       add("3^2. ", "9");
//       add("6*6", "36");
//       add("5^4", "625");
//       add("2+10_000?", "10_002");
//       add("Что такое круг?", "шар");
//       add("Дайте определение треугольнику", "3 угла");
//       add("Какие формулы вы знаете?", "всякие");
//       add("Что такое параллепипед?", "параллепипед");
//       add("Какая функция у log?", "сложная");
//    }
//
//
//    @Override
//    public Question add(String question, String answer){
//        Question newQuestion = new Question(question, answer);
//        mathQuestions.add(newQuestion);
//        return newQuestion;
//    }
//
//    @Override
//    public Question add(Question question){
//        mathQuestions.add(question);
//        return question;
//    }
//
//    @Override
//    public Question remove(Question question){
//        mathQuestions.remove(question);
//        return question;
//    }
//
//    @Override
//    public Collection<Question> getAll(){
//        return mathQuestions;
//    }
//
////    @Override
////    public Question getRandomQuestion(){
////        Random random = new Random();
////        int index = random.nextInt(mathQuestions.size());
////        return new ArrayList<>(mathQuestions).get(index);
////    }
//}
