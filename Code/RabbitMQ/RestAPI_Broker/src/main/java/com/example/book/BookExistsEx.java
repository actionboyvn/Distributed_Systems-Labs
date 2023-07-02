package com.example.book;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.FOUND)
public class BookExistsEx extends RuntimeException{
    public BookExistsEx(int id) {
        super("Book of id " + id + " already exists.");
    }
}
