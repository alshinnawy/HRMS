/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings.handler.general;

import senior.hrms.emps.dto.MilitaryStatus;
import senior.hrms.emps.dto.MilitaryStatusPk;
import senior.hrms.emps.exceptions.MilitaryStatusDaoException;

/**
 *
 * @author amal
 */
public class MilitaryStatusHandler implements MilitaryStatusInterface
{

    @Override
    public MilitaryStatusPk addMilitaryStatus(MilitaryStatus dto) throws MilitaryStatusDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateMilitaryStatus(MilitaryStatusPk pk, MilitaryStatus dto) throws MilitaryStatusDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteMilitaryStatus(MilitaryStatusPk pk) throws MilitaryStatusDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MilitaryStatus getMilitaryStatusById(int militaryStatusId) throws MilitaryStatusDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MilitaryStatus[] getAllMilitaryStatus() throws MilitaryStatusDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MilitaryStatus[] getMilitaryStatusByName(byte[] militaryStatusName) throws MilitaryStatusDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
