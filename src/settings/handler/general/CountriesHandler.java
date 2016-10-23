/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings.handler.general;

import senior.hrms.emps.dto.Countries;
import senior.hrms.emps.dto.CountriesPk;
import senior.hrms.emps.exceptions.CountriesDaoException;

/**
 *
 * @author amal
 */
public class CountriesHandler implements CountriesInterface
{

    @Override
    public CountriesPk addCountries(Countries dto) throws CountriesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateCountries(CountriesPk pk, Countries dto) throws CountriesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteCountries(CountriesPk pk) throws CountriesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Countries getCountriesById(int countryId) throws CountriesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Countries[] getAllCountries() throws CountriesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Countries[] getCountryByName(String countryName) throws CountriesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
