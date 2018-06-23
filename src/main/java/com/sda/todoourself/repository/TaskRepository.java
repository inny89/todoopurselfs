package com.sda.todoourself.repository;

import com.sda.todoourself.model.TodoTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TaskRepository extends JpaRepository<TodoTask, Long>{

    @Query(value = "select s from Tasks s")
    List<TodoTask> getAll();

}
