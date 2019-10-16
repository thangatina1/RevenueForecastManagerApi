package com.RevenueForecastManagerApi.RevenueForecastManagerApi.dao;

import com.RevenueForecastManagerApi.RevenueForecastManagerApi.entity.Project;

import java.util.List;

public interface ProjectDAO {

    public List<Project> getProjects();

    public void saveProject(Project project);

    public Project getProject(int theId);

    public void deleteProject(int theId);
}
