/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings.handler.general;

import senior.hrms.emps.dao.DegreeDao;
import senior.hrms.emps.dto.Degree;
import senior.hrms.emps.dto.DegreePk;
import senior.hrms.emps.exceptions.DegreeDaoException;
import senior.hrms.emps.factory.DegreeDaoFactory;

/**
 *
 * @author amal
 */
public class DegreeHandler implements DegreeInterface
{

    @Override
    public DegreePk addDegree(Degree dto) throws DegreeDaoException
    {
        DegreeDao md=DegreeDaoFactory.create();
        DegreePk dpk=md.insert(dto);
        return dpk;
    }

    @Override
    public void updateDegree(DegreePk pk, Degree dto) throws DegreeDaoException
    {
        DegreeDao md=DegreeDaoFactory.create();
        md.update(pk, dto);
    }

    @Override
    public void deleteDegree(DegreePk pk) throws DegreeDaoException
    {
        DegreeDao md=DegreeDaoFactory.create();
         md.delete(pk);
    }

    @Override
    public Degree getDegreeById(int degreeId) throws DegreeDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Degree[] getDegreeAll() throws DegreeDaoException
    {
        DegreeDao md=DegreeDaoFactory.create();
        Degree[] deg=md.findAll();
        
        
        return deg;  
    }

    @Override
    public Degree[] getDegreeByName(String degereeName) throws DegreeDaoException
    {
        DegreeDao md=DegreeDaoFactory.create();
        Degree[] deg=md.findWhereDegereeNameEquals(degereeName);
        
        
        return deg; 
    }

}
