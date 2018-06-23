package com.sda.todoourself.controllers;

import com.sda.todoourself.model.TodoTask;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class TodoController {

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public ResponseEntity<TodoTask> test(){
        return ResponseEntity.ok(new TodoTask());
    }


//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)

}
