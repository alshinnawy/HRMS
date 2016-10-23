/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings.handler.affairs;

import java.util.Date;
import senior.hrms.emps.dto.OfficialVacationsSched;
import senior.hrms.emps.dto.OfficialVacationsSchedPk;
import senior.hrms.emps.exceptions.OfficialVacationsSchedDaoException;

/**
 *
 * @author amal
 */
public class OfficialVacationsSchedHandler implements OfficialVacationsSchedInterface
{

    @Override
    public OfficialVacationsSchedPk addOfficialVacationsSched(OfficialVacationsSched dto) throws OfficialVacationsSchedDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateOfficialVacationsSched(OfficialVacationsSchedPk pk, OfficialVacationsSched dto) throws OfficialVacationsSchedDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteOfficialVacationsSched(OfficialVacationsSchedPk pk) throws OfficialVacationsSchedDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OfficialVacationsSched getOfficialVacationsSchedById(int officialVacSchedId) throws OfficialVacationsSchedDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OfficialVacationsSched[] getAllOfficialVacationsSched() throws OfficialVacationsSchedDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OfficialVacationsSched[] getOfficialVacationsSchedByFinancialYearId(int financialYearId) throws OfficialVacationsSchedDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OfficialVacationsSched[] getOfficialVacationsSchedByOfficialVacationsId(int officialVacationId) throws OfficialVacationsSchedDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OfficialVacationsSched[] getOfficialVacationsSchedByDateFrom(Date dateFrom) throws OfficialVacationsSchedDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OfficialVacationsSched[] getOfficialVacationsSchedByDateTo(Date dateTo) throws OfficialVacationsSchedDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
