package com.task.taskTracker.controllers;


import com.task.taskTracker.domain.dto.TaskListDto;
import com.task.taskTracker.domain.entities.TaskList;
import com.task.taskTracker.mappers.TaskListMapper;
import com.task.taskTracker.services.TaskListService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(path = "/task-lists")
public class TaskListController {

    private final TaskListService taskListService;
    private final TaskListMapper taskListMapper;

    public TaskListController(TaskListService taskListService, TaskListMapper taskListMapper) {
        this.taskListService = taskListService;
        this.taskListMapper = taskListMapper;
    }

    @GetMapping
    public List<TaskListDto> listTaskLists(){
        return taskListService.listTaskLists().stream()
                .map(taskListMapper::toDto)
                .toList();
    }

    @PostMapping
    public TaskListDto createTaskList(@RequestBody TaskListDto taskListDto){
        TaskList createdTaskList = taskListService.creataskList(
                taskListMapper.fromDto(taskListDto)
        );
        return taskListMapper.toDto(createdTaskList);
    }

    @GetMapping(path = "/{task_list_id")
    public Optional<TaskListDto> getTaskList(@PathVariable(task_listL_id) UUID taskListId){
        return taskListService.getTaskList(taskListId).map(taskListMapper::toDto);
    }
}
