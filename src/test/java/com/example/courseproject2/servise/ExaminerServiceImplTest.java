package com.example.courseproject2.servise;

import com.example.courseproject2.domain.Question;
import com.example.courseproject2.exc.BAD_REQUEST;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {
    @Mock
    private JavaQuestionService javaQuestionService;

    @InjectMocks
    private ExaminerServiceImpl examinerService;

    @Test
    void testGetQuestions() {
        // given
        int amount = 10;
        when(javaQuestionService.getAll()).thenReturn(List.of());

        //when

        // then
        Assertions.assertThrows(
                BAD_REQUEST.class,
                () -> examinerService.getQuestions(amount)
        );
    }

    @Test
    void shoulCorrectlyGetQuestions() {
        // given
        int amount = 3;

        List<Question> questions = List.of(
                new Question("Question1", "Question1"),
                new Question("Question2", "Question2"),
                new Question("Question3", "Question3"),
                new Question("Question4", "Question4"),
                new Question("Question5", "Question5")
        );
        when(javaQuestionService.getAll()).thenReturn(questions);

        when(javaQuestionService.getRandomQuestion()).thenReturn(
                questions.get(0),
                questions.get(1),
                questions.get(1),
                questions.get(0),
                questions.get(1),
                questions.get(2)
                );

        //when

        Collection<Question> actualQ = examinerService.getQuestions(amount);
        // then
        Assertions.assertEquals(
                Set.of(questions.get(0), questions.get(1), questions.get(2)),
                actualQ
        );

        verify(javaQuestionService, times(6)).getRandomQuestion();
    }
}