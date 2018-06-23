package com.sda.todoourself.repository;

import com.sda.todoourself.model.TodoTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TodoTask, Long>{

}
