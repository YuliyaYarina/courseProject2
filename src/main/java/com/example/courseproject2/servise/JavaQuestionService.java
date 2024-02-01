package com.example.courseproject2.servise;

import com.example.courseproject2.domain.Question;
import com.example.courseproject2.servise.impl.QuestionService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.*;

import static org.springframework.http.RequestEntity.put;

@Service
public class JavaQuestionService implements QuestionService {

   private final Set<Question> questions = new HashSet<>();

   private final Random random = new Random();

   @PostConstruct
   public void init() {
      add("Дайте определение переменной.", "Petin");
      add("Перечислите типы переменных. ", "Petin");
      add("Какие методы называются геттерами?", "Petin");
      add("Что геттеры делают?", "Petin");
      add("Какие условные операторы вы знаете?", "Petin");
      add("Что такое массив?", "Petin");
      add("Дайте определение сеттерам.", "Petin");
      add("Какие циклы вы знаете?", "Petin");
      add("Что такое массив?", "Petin");
      add("Что такое конструкторы?", "Petin");
      add("Где String создается?", "Petin");
      add("В чем разница между == и equals()?", "Petin");
      add("Какая функция у оператора return?", "Petin");
      add("Когда применяется цикл while?", "Petin");

   }

@Override
    public Question add(String question, String answer){
    Question newQuestion = new Question(question, answer);
    questions.add(newQuestion);
    return newQuestion;
    }

@Override
    public Question add(Question question){
    questions.add(question);
       return question;
    }

    @Override
    public Question remove(Question question){
    questions.remove(question);
       return question;
    }

    @Override
    public Collection<Question> getAll(){
        return questions;
    }

    @Override
    public Question getRandomQuestion(){
    Random random = new Random();
    int index = random.nextInt(questions.size());
           return new ArrayList<>(questions).get(index);
    }


}
