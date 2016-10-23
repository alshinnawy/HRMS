/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings.handler.general;

import senior.hrms.emps.dao.MajorDao;
import senior.hrms.emps.dto.Major;
import senior.hrms.emps.dto.MajorPk;
import senior.hrms.emps.exceptions.MajorDaoException;
import senior.hrms.emps.factory.MajorDaoFactory;
import settings.forms.general.Majors;

/**
 *
 * @author amal
 */
public class MajorHandler implements MajorInterface
{

    @Override
    public MajorPk addMajor(Major dto) throws MajorDaoException
    {
         MajorDao md=MajorDaoFactory.create();
         MajorPk mpk= md.insert(dto);   
        return mpk;
    }

    @Override
    public void updateMajor(MajorPk pk, Major dto) throws MajorDaoException
    {
       MajorDao md=MajorDaoFactory.create();
         md.update(pk, dto);
    }

    @Override
    public void deleteMajor(MajorPk pk) throws MajorDaoException
    {
     MajorDao md=MajorDaoFactory.create();
       md.delete(pk);
    }

    @Override
    public Major getMajorById(int majorId) throws MajorDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Major[] getAllMajor() throws MajorDaoException
    {
        MajorDao md=MajorDaoFactory.create();
        Major[] maj=md.findAll();
        
        return maj;
        
    }

    @Override
    public Major[] getMajorByName(String majorName) throws MajorDaoException
    {
        MajorDao md=MajorDaoFactory.create();
        Major[] maj=md.findWhereMajorNameEquals(majorName);
        
        
        return maj; 
                
    }

}
