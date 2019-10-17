package com.RevenueForecastManagerApi.RevenueForecastManagerApi.service;

import com.RevenueForecastManagerApi.RevenueForecastManagerApi.entity.Project;

import java.util.List;

public interface ProjectService {


    List<Project> retrieveAllProjects();

    Project retrieveProjectById(int id);

    Project createProject(Project project);

    Project editProject(Project project);

    void deleteProject(int id);
}
