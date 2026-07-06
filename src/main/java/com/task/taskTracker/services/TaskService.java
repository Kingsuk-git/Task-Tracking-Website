package com.task.taskTracker.services;

import com.task.taskTracker.domain.entities.Task;
import com.task.taskTracker.domain.entities.TaskList;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TaskService {
    List<Task> listTasks(UUID taskListId);
    Task createTask(UUID taskListId, Task task);
    Optional<TaskList> getTask(UUID taskListId, UUID taskId);
    Task updateTask(UUID taskListId,UUID taskId, Task task);
    void deleteTask(UUID taskListId, UUID taskId);
}
