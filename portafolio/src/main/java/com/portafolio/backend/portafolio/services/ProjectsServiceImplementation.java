package com.portafolio.backend.portafolio.services;

import com.portafolio.backend.portafolio.models.Project;
import com.portafolio.backend.portafolio.repository.ProjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectsServiceImplementation implements ProjectsService{
    @Autowired
    private ProjectsRepository projectsRepo;


    @Override
    public List<Project> getAllProjects() {
        return projectsRepo.findAll();
    }

    @Override
    public Project getOneProject(int id) {
        return projectsRepo.findById(id).orElse(null);
    }

    @Override
    public Project addProject(Project project) {
        return projectsRepo.save(project);
    }

    @Override
    public void deleteProject(int id) {
        projectsRepo.deleteById(id);
    }

    @Override
    public Project updateProject(int id, Project updatedProject) {
        return projectsRepo.findById(id).map(project -> {
            project.setName(updatedProject.getName());
            project.setDescription(updatedProject.getDescription());
            project.setIcon(updatedProject.getIcon());
            project.setLink(updatedProject.getLink());
            return projectsRepo.save(project);
        }).get();
    }
}
