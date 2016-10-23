/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings.handler.general;

import senior.hrms.emps.dto.Religion;
import senior.hrms.emps.dto.ReligionPk;
import senior.hrms.emps.exceptions.ReligionDaoException;

/**
 *
 * @author amal
 */
public class ReligionHandler implements ReligionInterface
{

    @Override
    public ReligionPk addReligion(Religion dto) throws ReligionDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateReligion(ReligionPk pk, Religion dto) throws ReligionDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteReligion(ReligionPk pk) throws ReligionDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Religion getReligionById(int religionId) throws ReligionDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Religion[] getAllReligion() throws ReligionDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Religion[] getReligionByName(String religionName) throws ReligionDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
