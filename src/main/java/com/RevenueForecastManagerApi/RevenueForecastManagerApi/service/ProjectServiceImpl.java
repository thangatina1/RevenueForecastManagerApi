package com.RevenueForecastManagerApi.RevenueForecastManagerApi.service;

import com.RevenueForecastManagerApi.RevenueForecastManagerApi.dao.ProjectDAO;
import com.RevenueForecastManagerApi.RevenueForecastManagerApi.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
public class ProjectServiceImpl implements ProjectService{

    //InjectDAO
    @Autowired
    private ProjectDAO projectDAO;


    @Override
    @Transactional
    public List<Project> getProjects() {
        return projectDAO.getProjects();
    }

    @Override
    @Transactional
    public void saveCustomer(Project project) {
        projectDAO.saveProject(project);

    }

    @Override
    @Transactional
    public Project getProject(int theId) {
        return projectDAO.getProject(theId);
    }

    @Override
    @Transactional
    public void deleteProject(int theId) {
        projectDAO.deleteProject(theId);
    }
}
