package com.task.taskTracker.services;

import com.task.taskTracker.domain.entities.TaskList;

import java.util.List;

public interface TaskListService {
    List<TaskList> listTaskLists();
}
