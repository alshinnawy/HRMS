/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings.handler.general;

import senior.hrms.emps.dao.GradeDao;
import senior.hrms.emps.dto.Grade;
import senior.hrms.emps.dto.GradePk;
import senior.hrms.emps.exceptions.GradeDaoException;
import senior.hrms.emps.factory.GradeDaoFactory;

/**
 *
 * @author amal
 */
public class GradeHandler implements GradeInterface
{

    @Override
    public GradePk addGrade(Grade dto) throws GradeDaoException
    {
       GradeDao md=GradeDaoFactory.create();
      GradePk gpk= md.insert(dto);   
        return gpk;
    }

    @Override
    public void updateGrade(GradePk pk, Grade dto) throws GradeDaoException
    {
       GradeDao md=GradeDaoFactory.create();
         md.update(pk, dto);
    }

    @Override
    public void deleteGrade(GradePk pk) throws GradeDaoException
    {
      GradeDao md=GradeDaoFactory.create();
      md.delete(pk);
    }

    @Override
    public Grade getGradeById(int gradeId) throws GradeDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Grade[] getAllGrade() throws GradeDaoException
    {
        GradeDao md=GradeDaoFactory.create();
        Grade[] grad=md.findAll();
        
        
        return grad;
    }

    @Override
    public Grade[] getGradeByName(String gradeName) throws GradeDaoException
    {
        GradeDao md=GradeDaoFactory.create();
        Grade[] grad=md.findWhereGradeNameEquals(gradeName);
        
        
        return grad;
    }

}
