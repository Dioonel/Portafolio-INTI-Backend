package com.portafolio.backend.portafolio.services;

import com.portafolio.backend.portafolio.models.Project;

import java.util.List;

public interface ProjectsService {
    public List<Project> getAllProjects();
    public Project getOneProject(int id);
    public Project addProject(Project project);
    public void deleteProject(int id);
    public Project updateProject(int id, Project project);
}
