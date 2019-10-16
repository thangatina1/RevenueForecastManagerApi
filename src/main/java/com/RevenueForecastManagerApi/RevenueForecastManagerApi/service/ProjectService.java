package com.RevenueForecastManagerApi.RevenueForecastManagerApi.service;

import com.RevenueForecastManagerApi.RevenueForecastManagerApi.entity.Project;

import java.util.List;

public interface ProjectService {


    public List<Project> getProjects();

    public void saveCustomer(Project project);

    public Project getProject(int theId);

    public void deleteProject(int theId);
}
