/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import senior.hrms.emps.dao.*;
import senior.hrms.emps.dto.*;
import senior.hrms.emps.exceptions.*;
import senior.hrms.emps.factory.*;

/**
 *
 * @author amal
 */
public class Country
{
    public Countries[] getCountries() throws CountriesDaoException
    {
        CountriesDao countryDao = (CountriesDao) CountriesDaoFactory.create();
        return countryDao.findAll();
    }
}
