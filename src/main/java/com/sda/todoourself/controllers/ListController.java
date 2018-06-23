package com.sda.todoourself.controllers;

import com.sda.todoourself.model.TodoTask;
import com.sda.todoourself.repository.TaskRepository;
import com.sda.todoourself.services.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping
public class ListController {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private ListService listService;

    @RequestMapping(method = RequestMethod.GET)
    public List<TodoTask> search(){
        return taskRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public TodoTask get(Long id){
        return listService.getById(id);
    }
}
