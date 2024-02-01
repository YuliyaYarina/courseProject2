package com.example.courseproject2.servise;

import com.example.courseproject2.domain.Question;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class JavaQuestionServiceTest {

    private final JavaQuestionService questionService = new JavaQuestionService();

    @Test
    void add() {
        // given
        Question question = new Question("a", "b");
        // wheh
        Question addedQuestion = questionService.add(question);
        // then
        Assertions.assertEquals(question, addedQuestion);
    }

    @Test
    void testAdd() {
        Question question = new Question("a", "b");
        // wheh
        Question addedQuestion = questionService.add(question);
        // then
        Assertions.assertEquals(question, addedQuestion);
    }

    @Test
    void remove() {
        Question question = new Question("a", "b");
        questionService.add(question);
        // wheh
        Question addedQuestion = questionService.remove(question);
        // then
        Assertions.assertEquals(question, addedQuestion);
    }

    @Test
    void getAll() {
        Question question1 = new Question("a", "b");
        Question question2 = new Question("f", "l");

        questionService.add(question1);
        questionService.add(question2);

        // wheh
        Collection<Question> actualQ = questionService.getAll();

        // then
        Assertions.assertIterableEquals(List.of(question1, question2), actualQ);
    }

    @Test
    void getRandomQuestion() {
        Question question1 = new Question("a", "b");
        Question question2 = new Question("f", "l");

        questionService.add(question1);
        questionService.add(question2);

        // wheh
        Question randomQ = questionService.getRandomQuestion();

        // then
        assertTrue(Set.of(question1, question2).contains(randomQ));
    }


}