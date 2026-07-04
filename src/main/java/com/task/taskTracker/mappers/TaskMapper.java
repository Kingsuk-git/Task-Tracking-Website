package com.task.taskTracker.mappers;

import com.task.taskTracker.domain.dto.TaskDto;
import com.task.taskTracker.domain.entities.Task;
import com.task.taskTracker.domain.entities.TaskList;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);

    Task toDto(TaskList taskList);
}
