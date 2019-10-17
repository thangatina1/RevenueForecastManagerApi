package com.RevenueForecastManagerApi.RevenueForecastManagerApi.service;

import com.RevenueForecastManagerApi.RevenueForecastManagerApi.dao.ProjectDAO;
import com.RevenueForecastManagerApi.RevenueForecastManagerApi.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
public class ProjectServiceImpl implements ProjectService{

    //InjectDAO
    @Autowired
    private ProjectDAO projectDAO;

    @Override
    public List<Project> retrieveAllProjects() {
        List<Project> list = new ArrayList<>();
        Iterable<Project> iterable = projectDAO.findAll();
        for (Project project : iterable) {
            list.add(new Project(project.getEsaProjectId(),project.getEsaProjectName(),project.getSowProjectId(),project.getSowProjectName(),project.getFixedBidFlag(),
                    project.getTnmFlag(),project.getProjectLocation(),project.getSbu(),project.getRate(),project.getWorkHours(),project.getActiveStatus()));
        }
        return list;
    }

    @Override
    public Project retrieveProjectById(int id) {
        return null;
    }

    @Override
    public Project createProject(Project project) {


        projectDAO.save(new Project(project.getEsaProjectId(),project.getEsaProjectName(),project.getSowProjectId(),project.getSowProjectName(),project.getFixedBidFlag(),
                project.getTnmFlag(),project.getProjectLocation(),project.getSbu(),project.getRate(),project.getWorkHours(),project.getActiveStatus()));

            return project;
    }

    @Override
    public Project editProject(Project project) {
        return null;
    }

    @Override
    public void deleteProject(int id) {

    }
}
