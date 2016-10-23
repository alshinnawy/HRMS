/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings.handler.affairs;

import senior.hrms.emps.dto.JobLevel;
import senior.hrms.emps.dto.JobLevelPk;
import senior.hrms.emps.exceptions.JobLevelDaoException;

/**
 *
 * @author amal
 */
public class JobLevelHandler implements JobLevelInterface
{

    @Override
    public JobLevelPk addJobLevel(JobLevel dto) throws JobLevelDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateJobLevel(JobLevelPk pk, JobLevel dto) throws JobLevelDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteJobLevel(JobLevelPk pk) throws JobLevelDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JobLevel getJobLevelById(int jobLevelId) throws JobLevelDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JobLevel[] getAllJobLevel() throws JobLevelDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JobLevel[] getJobLevelByName(String jobLevelName) throws JobLevelDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
