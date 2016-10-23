/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings.handler.general;

import senior.hrms.emps.dao.AccidentTypesDao;
import senior.hrms.emps.dto.AccidentTypes;
import senior.hrms.emps.dto.AccidentTypesPk;
import senior.hrms.emps.exceptions.AccidentTypesDaoException;
import senior.hrms.emps.factory.AccidentTypesDaoFactory;
import senior.hrms.emps.factory.OrganDaoFactory;

/**
 *
 * @author amal
 */
public class AccidentTypesHandler implements AccidentTypesInterface
{

    @Override
    public AccidentTypesPk addAccidentTypes(AccidentTypes dto) throws AccidentTypesDaoException
    {
       AccidentTypesDao atd = AccidentTypesDaoFactory.create();
        atd.insert(dto) ;
        return null;    
    }

    @Override
    public void updateAccidentTypes(AccidentTypesPk pk, senior.hrms.emps.dto.AccidentTypes dto) throws AccidentTypesDaoException
    {
     AccidentTypesDao atd = AccidentTypesDaoFactory.create();  
    atd.update(pk, dto);
    
    }

    @Override
    public void deleteAccidentTypes(AccidentTypesPk pk) throws AccidentTypesDaoException
    {
    AccidentTypesDao atd = AccidentTypesDaoFactory.create();
    atd.delete(pk);
    }

    @Override
    public senior.hrms.emps.dto.AccidentTypes getAccidentTypesById(int accidentTypeId) throws AccidentTypesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public senior.hrms.emps.dto.AccidentTypes[] getAllAccidentTypes() throws AccidentTypesDaoException
    {
       AccidentTypesDao atd = AccidentTypesDaoFactory.create();
       AccidentTypes[] list = atd.findAll();
        return list;
    
    }

    @Override
    public senior.hrms.emps.dto.AccidentTypes[] getAccidentTypeByName(String accidentTypeName) throws AccidentTypesDaoException
    {
        AccidentTypesDao atd = AccidentTypesDaoFactory.create();
        AccidentTypes[] list = atd.findWhereAccidentTypeEquals(accidentTypeName);
        return list;
    
    }

}
