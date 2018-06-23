package com.sda.todoourself.services;

import com.sda.todoourself.model.TodoTask;
import com.sda.todoourself.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class TodoTaskService {

    @Autowired
    private TaskRepository taskRepository;


    public TodoTask create(TodoTask todoTask){
        return taskRepository.save(todoTask);
    }
}
