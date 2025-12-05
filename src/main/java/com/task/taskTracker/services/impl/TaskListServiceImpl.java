package com.task.taskTracker.services.impl;

import com.task.taskTracker.domain.entities.TaskList;
import com.task.taskTracker.repositories.TaskListRepository;
import com.task.taskTracker.services.TaskListService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskListServiceImpl implements TaskListService {

    private final TaskListRepository taskListRepository;


    public TaskListServiceImpl(TaskListRepository taskListRepository) {
        this.taskListRepository = taskListRepository;
    }



    @Override
    public List<TaskList> listTaskLists() {
        return taskListRepository.findAll();
    }
}
