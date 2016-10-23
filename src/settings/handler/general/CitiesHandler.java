/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings.handler.general;

import senior.hrms.emps.dto.Cities;
import senior.hrms.emps.dto.CitiesPk;
import senior.hrms.emps.exceptions.CitiesDaoException;

/**
 *
 * @author amal
 */
public class CitiesHandler implements CitiesInterface
{

    @Override
    public CitiesPk addCities(Cities dto) throws CitiesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateCities(CitiesPk pk, Cities dto) throws CitiesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteCities(CitiesPk pk) throws CitiesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cities getCitiesById(int cityId) throws CitiesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cities[] getAllCities() throws CitiesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cities[] getCitiesByName(String cityName) throws CitiesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
