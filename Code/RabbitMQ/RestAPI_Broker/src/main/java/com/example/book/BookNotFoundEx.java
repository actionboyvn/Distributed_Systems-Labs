package com.example.book;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class BookNotFoundEx extends RuntimeException{
    public BookNotFoundEx(int id) {
        super("Book of id " + id + " doesn't exist");
    }
}
