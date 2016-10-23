/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings.handler.affairs;

import senior.hrms.emps.dto.VacationsTypes;
import senior.hrms.emps.dto.VacationsTypesPk;
import senior.hrms.emps.exceptions.VacationsTypesDaoException;

/**
 *
 * @author amal
 */
public class VacationsTypesHandler implements VacationsTypesInterface
{

    @Override
    public VacationsTypesPk addVacationsTypes(VacationsTypes dto) throws VacationsTypesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateVacationsTypes(VacationsTypesPk pk, VacationsTypes dto) throws VacationsTypesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteVacationsTypes(VacationsTypesPk pk) throws VacationsTypesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VacationsTypes getVacationsTypesById(int vacationTypeId) throws VacationsTypesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VacationsTypes[] getAllVacationsTypes() throws VacationsTypesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VacationsTypes[] getVacationTypeByName(String vacationTypeName) throws VacationsTypesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VacationsTypes[] getVacationsTypesByValuePercentage(int valuePercentage) throws VacationsTypesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VacationsTypes[] getVacationsTypesByNote(String note) throws VacationsTypesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
