package com.RevenueForecastManagerApi.RevenueForecastManagerApi.controller;


import com.RevenueForecastManagerApi.RevenueForecastManagerApi.entity.Project;
import com.RevenueForecastManagerApi.RevenueForecastManagerApi.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;


    @GetMapping("/projects")
    public List<Project> retrieveAllProjects() {
        return projectService.retrieveAllProjects();
    }

    @PostMapping("/projects")
    public ResponseEntity<Project> createProject(@RequestBody Project project) {
        Project saveProject = projectService.createProject(project);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(saveProject.getProject_id()).toUri();

        return ResponseEntity.created(location).build();
    }

}
