/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings.handler.general;

import senior.hrms.emps.dto.MaritalStatus;
import senior.hrms.emps.dto.MaritalStatusPk;
import senior.hrms.emps.exceptions.MaritalStatusDaoException;

/**
 *
 * @author amal
 */
public class MaritalStatusHandler implements MaritalStatusInterface
{

    @Override
    public MaritalStatusPk addMaritalStatus(MaritalStatus dto) throws MaritalStatusDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateMaritalStatus(MaritalStatusPk pk, MaritalStatus dto) throws MaritalStatusDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteMaritalStatus(MaritalStatusPk pk) throws MaritalStatusDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MaritalStatus getMaritalStatusById(int maritalStatusId) throws MaritalStatusDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MaritalStatus[] getAllMaritalStatus() throws MaritalStatusDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MaritalStatus[] getMaritalStatusByName(String maritalStatusName) throws MaritalStatusDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
