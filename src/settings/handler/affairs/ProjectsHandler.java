/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings.handler.affairs;

import senior.hrms.emps.dto.Projects;
import senior.hrms.emps.dto.ProjectsPk;
import senior.hrms.emps.exceptions.ProjectsDaoException;

/**
 *
 * @author amal
 */
public class ProjectsHandler implements ProjectsInterface
{

    @Override
    public ProjectsPk addProjects(Projects dto) throws ProjectsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateProjects(ProjectsPk pk, Projects dto) throws ProjectsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteProjects(ProjectsPk pk) throws ProjectsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Projects getProjectsById(int projectId) throws ProjectsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Projects[] getAllProjects() throws ProjectsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Projects[] getProjectsByName(String projectName) throws ProjectsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Projects[] getProjectsByDescription(String projectDescription) throws ProjectsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
