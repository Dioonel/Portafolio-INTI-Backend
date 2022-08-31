package com.portafolio.backend.portafolio.controllers;

import com.portafolio.backend.portafolio.models.Project;
import com.portafolio.backend.portafolio.services.ProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectsController {
    @Autowired
    private ProjectsService projectsService;

    @GetMapping
    public List<Project> getProjects(){
        return projectsService.getAllProjects();
    }

    @GetMapping("/{id}")
    public Project getProjectById(@PathVariable int id){
        return projectsService.getOneProject(id);
    }

    @PostMapping
    public Project createProject(@RequestBody Project project){
        return projectsService.addProject(project);
    }

    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable int id){
        projectsService.deleteProject(id);
    }

    @PutMapping("/{id}")
    public Project updateProject(@PathVariable int id, @RequestBody Project updatedProject){
        return projectsService.updateProject(id, updatedProject);
    }
}
