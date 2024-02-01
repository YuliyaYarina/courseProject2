package com.example.courseproject2.exc;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class BAD_REQUEST extends RuntimeException{
    public BAD_REQUEST() {
    }

    public BAD_REQUEST(String message) {
        super("запрошено большее количество вопросов, чем хранится в сервисе");
    }

    public BAD_REQUEST(String message, Throwable cause) {
        super(message, cause);
    }

    public BAD_REQUEST(Throwable cause) {
        super(cause);
    }

    public BAD_REQUEST(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
