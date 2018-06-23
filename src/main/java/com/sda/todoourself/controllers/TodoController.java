package com.sda.todoourself.controllers;

import com.sda.todoourself.model.TodoTask;
import com.sda.todoourself.repository.TaskRepository;
import com.sda.todoourself.services.TodoTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task")
public class TodoController {

    @Autowired
    private TaskRepository taskRepository;


    @Autowired
    private TodoTaskService todoTaskService;

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public ResponseEntity<TodoTask> test(){
        return ResponseEntity.ok(new TodoTask());
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TodoTask create(@RequestBody TodoTask todoTask){
        return todoTaskService.create(todoTask);
    }
}
