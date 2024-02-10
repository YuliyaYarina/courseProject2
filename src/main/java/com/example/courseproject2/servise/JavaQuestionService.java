package com.example.courseproject2.servise;

import com.example.courseproject2.domain.Question;
import com.example.courseproject2.repository.JavaQuestionRepository;
import com.example.courseproject2.servise.impl.QuestionService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.*;

import static org.springframework.http.RequestEntity.put;

@Service
public class JavaQuestionService implements QuestionService {

   private JavaQuestionRepository javaQuestionRepository;

   public JavaQuestionService(JavaQuestionRepository javaQuestionRepository) {
      this.javaQuestionRepository = javaQuestionRepository;
   }

   @Override
    public Question add(String question, String answer){
    Question newQuestion = new Question(question, answer);

      return javaQuestionRepository.add(newQuestion);
    }


    @Override
    public Question remove(Question question){
       return javaQuestionRepository.remove(question);
    }

    @Override
    public Collection<Question> getAll(){
        return javaQuestionRepository.getAll();
    }

//    @Override
//    public Question getRandomQuestion(){
////        Random random = new Random();
////        int index = random.nextInt(javaQuestionRepository.init().size());
//        return javaQuestionRepository.getRandomQuestion();
//    }


}
