package com.task.taskTracker.repositories;

import com.task.taskTracker.domain.entities.Task;
import com.task.taskTracker.domain.entities.TaskList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TaskRepository extends JpaRepository<Task, UUID> {
    List<Task> findByTaskListId(UUID taskListId);


    Optional<TaskList> findByTaskIdAndId(UUID taskListId, UUID uuid);
}
