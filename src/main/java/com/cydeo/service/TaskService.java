package com.cydeo.service;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.dto.TaskDTO;
import com.cydeo.entity.User;
import com.cydeo.enums.Status;

import java.util.List;

public interface TaskService {

    TaskDTO findById(Long id);

    List<TaskDTO> listAllTasks();

    void save(TaskDTO dto);

    void delete(Long id);

    void update(TaskDTO dto);

    int totalNonCompletedTask(String projectCode);

    int totalCompletedTask(String projectCode);

    void deleteByProject(ProjectDTO project);

    void completeByProject(ProjectDTO project);

    List<TaskDTO> listAllTasksByStatusIsNot(Status complete);

    void updateStatus(TaskDTO task);

    List<TaskDTO> listAllTasksByStatus(Status complete);

    List<TaskDTO> readAllByAssignedEmployee(User assignedEmployee);
}
