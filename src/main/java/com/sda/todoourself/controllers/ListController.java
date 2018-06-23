package com.sda.todoourself.controllers;

import com.sda.todoourself.model.TodoTask;
import com.sda.todoourself.repository.TaskRepository;
import com.sda.todoourself.services.ListService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/task")
public class ListController {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private ListService listService;

    @RequestMapping(method = RequestMethod.GET)
    public List<TodoTask> search(){
        return taskRepository.findAll();
    }

//    @RequestMapping( = "/{id}", method = RequestMethod.GET)
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TodoTask get(@PathVariable Long id) throws NotFoundException {
        return listService.getById(id);
    }
}
