package com.example.courseproject2.domain;

import java.util.Objects;

public class Question {
    private String question;
    private String answe;

    public Question(String question, String answe) {
        this.question = question;
        this.answe = answe;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswe() {
        return answe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question1 = (Question) o;
        return Objects.equals(question, question1.question) && Objects.equals(answe, question1.answe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, answe);
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", answe='" + answe + '\'' +
                '}';
    }
}
