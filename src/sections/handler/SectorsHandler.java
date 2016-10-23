/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sections.handler;

import senior.hrms.emps.dto.Sectors;
import senior.hrms.emps.dto.SectorsPk;
import senior.hrms.emps.exceptions.SectorsDaoException;

/**
 *
 * @author amal
 */
public class SectorsHandler implements SectorsInterface
{

    @Override
    public SectorsPk addSectors(Sectors dto) throws SectorsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateSectors(SectorsPk pk, Sectors dto) throws SectorsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteSectors(SectorsPk pk) throws SectorsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sectors getSectorsById(int sectorId) throws SectorsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sectors[] getAllSectors() throws SectorsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sectors[] getSectorByName(String sectorName) throws SectorsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
