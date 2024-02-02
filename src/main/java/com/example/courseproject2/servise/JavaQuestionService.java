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
      add("Дайте определение переменной.", "Контейнер, в котором может храниться некоторое значение данных");
      add("Перечислите типы переменных. ", "Целочисленные, с плавающей точкой, символы, логические");
      add("Какие методы называются геттерами?", "Метод, который возвращает нам значение какого-то поля");
      add("Что геттеры делают?", "Геттеры позволяют получать значение поля обьекта");
      add("Какие условные операторы вы знаете?", "if-else, switch");
      add("Что такое массив?", "Структура данных, которая хранит набор пронумерованных значений одного типа");
      add("Дайте определение сеттерам.", "Метод, который изменяет значения поля");
      add("Какие циклы вы знаете?", "while, do while, for each");
      add("Что такое конструкторы?", "<Блок кода, похожий на метод, предназначенный для инициализации полей обьекта при его создании");
      add("Какая функция у оператора return?", "завершает выполнение функции и возвращает управление вызывающей функции");

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
