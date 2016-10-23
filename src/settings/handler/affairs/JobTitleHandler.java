/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings.handler.affairs;

import senior.hrms.emps.dto.JobTitle;
import senior.hrms.emps.dto.JobTitlePk;
import senior.hrms.emps.exceptions.JobTitleDaoException;

/**
 *
 * @author amal
 */
public class JobTitleHandler implements JobTitleInterface
{

    @Override
    public JobTitlePk addJobTitle(JobTitle dto) throws JobTitleDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateJobTitle(JobTitlePk pk, JobTitle dto) throws JobTitleDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteJobTitle(JobTitlePk pk) throws JobTitleDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JobTitle getJobTitleById(int jobTitleId) throws JobTitleDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JobTitle[] getAllJobTitle() throws JobTitleDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JobTitle[] getJobTitleByName(String jobTitleName) throws JobTitleDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JobTitle[] getJobTitleByDescription(String jobDescription) throws JobTitleDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
