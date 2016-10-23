/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings.handler.general;

import senior.hrms.emps.dto.BusLines;
import senior.hrms.emps.dto.BusLinesPk;
import senior.hrms.emps.exceptions.BusLinesDaoException;

/**
 *
 * @author amal
 */
public class BusLinesHandler implements BusLinesInterface
{

    @Override
    public BusLinesPk addBusLines(BusLines dto) throws BusLinesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateBusLines(BusLinesPk pk, BusLines dto) throws BusLinesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteBusLines(BusLinesPk pk) throws BusLinesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BusLines getBusLinesById(int busLineId) throws BusLinesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BusLines[] getAllBusLines() throws BusLinesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BusLines[] getBusLineByName(String busLineName) throws BusLinesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
