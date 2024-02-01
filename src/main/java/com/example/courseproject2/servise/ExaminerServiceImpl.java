package com.example.courseproject2.servise;

import com.example.courseproject2.domain.Question;
import com.example.courseproject2.exc.BAD_REQUEST;
import com.example.courseproject2.servise.impl.ExaminerService;
import com.example.courseproject2.servise.impl.QuestionService;
import org.springframework.stereotype.Service;

import javax.sound.midi.MidiFileFormat;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import static org.apache.el.lang.ELArithmetic.add;
@Service
public class ExaminerServiceImpl implements ExaminerService {

    private final Random random = new Random();
    QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        if (questionService.getAll().size() < amount) {
            throw new BAD_REQUEST("не достаточно вопросов в индексе");
        }
        Set<Question> questions = new HashSet<>();

        while (questions.size() < amount) {
            questions.add(questionService.getRandomQuestion());
        }

        return questions;
    }
}
