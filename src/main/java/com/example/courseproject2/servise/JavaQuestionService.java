package com.example.courseproject2.servise;

import com.example.courseproject2.domain.Question;
import com.example.courseproject2.servise.impl.QuestionService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.*;

import static org.springframework.http.RequestEntity.put;

@Service
public class JavaQuestionService implements QuestionService {

   private final Set<String> questions = new HashSet<>();

    @PostConstruct
    public void question(){
        put("Дайте определение переменной.", "Petin");
        put("Перечислите типы переменных. ", "Petin");
        put("Какие методы называются геттерами?", "Petin");
        put("Что геттеры делают?", "Petin");
        put("Какие условные операторы вы знаете?", "Petin");
        put("Что такое массив?", "Petin");
        put("Дайте определение сеттерам.", "Petin");
        put("Какие циклы вы знаете?", "Petin");
        put("Что такое массив?", "Petin");
        put("Что такое конструкторы?", "Petin");
        put("Где String создается?", "Petin");
        put("В чем разница между == и equals()?", "Petin");
        put("Какая функция у оператора return?", "Petin");
        put("Когда применяется цикл while?", "Petin");
        put("Для чего применяется метод toString?", "Petin");
        put("Что такое область видимости?", "Petin");
    };
@Override
    public Question add(String question, String answer){


       return null;
    }

@Override
    public Question add(Question question){


       return null;
    }

    @Override
    public Question remove(Question question){


       return null;
    }

    @Override
    public Collection<Question> getAll(){


       return null;
    }

    @Override
    public Question getRandomQuestion(){


       return null;
    }


}
