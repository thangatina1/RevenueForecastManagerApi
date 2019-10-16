package com.RevenueForecastManagerApi.RevenueForecastManagerApi.dao;

import com.RevenueForecastManagerApi.RevenueForecastManagerApi.entity.Project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProjectDAOImpl implements ProjectDAO {

    // need to inject the session factory
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Project> getProjects() {
        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create a query ...sort by last name
        Query<Project> query = currentSession.createQuery("from Project", Project.class);

        // execute query and get result list
        List<Project> projects = query.getResultList();

        // return the results
        return projects;
    }

    @Override
    public void saveProject(Project project) {
        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // saving customer to db
        currentSession.saveOrUpdate(project);
    }

    @Override
    public Project getProject(int theId) {
        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // retrieve/read from database using the primary key
        Project project = currentSession.get(Project.class, theId);

        // return the customer
        return project;
    }

    @Override
    public void deleteProject(int theId) {

        // get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // delete customer with id = theId
        Query theQuery = currentSession.createQuery("delete from Project where esaProjectId=:projectId");
        theQuery.setParameter("projectId", theId);

        theQuery.executeUpdate();

    }
}
