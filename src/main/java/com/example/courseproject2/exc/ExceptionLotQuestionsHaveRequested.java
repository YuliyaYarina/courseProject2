package com.example.courseproject2.exc;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class ExceptionLotQuestionsHaveRequested extends RuntimeException{
    public ExceptionLotQuestionsHaveRequested() {
    }

    public ExceptionLotQuestionsHaveRequested(String message) {
        super("запрошено большее количество вопросов, чем хранится в сервисе");
    }

    public ExceptionLotQuestionsHaveRequested(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionLotQuestionsHaveRequested(Throwable cause) {
        super(cause);
    }

    public ExceptionLotQuestionsHaveRequested(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
