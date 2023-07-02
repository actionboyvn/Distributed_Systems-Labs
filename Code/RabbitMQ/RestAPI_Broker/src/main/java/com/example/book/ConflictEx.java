package com.example.book;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT)
public class ConflictEx extends RuntimeException{
    public ConflictEx(String status){
        super("You can't borrow a book with status " + status + ".");
    }
}
