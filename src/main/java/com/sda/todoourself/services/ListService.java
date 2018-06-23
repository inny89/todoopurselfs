package com.sda.todoourself.services;

import com.sda.todoourself.model.TodoTask;
import com.sda.todoourself.repository.TaskRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ListService {

    @Autowired
    private TaskRepository taskRepository;

    public TodoTask getById(Long id) throws NotFoundException {
        Optional<TodoTask> product = taskRepository.findById(id);
        if (!product.isPresent()) {   //jezeli nasz produkt nie istnieje, jest nullem, rzucamy ex
            throw new NotFoundException(String.format("task with id %s does not exist", id));
        }
        return product.get();
    }
}
