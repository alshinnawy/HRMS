/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import admin.handler.RoleHandler;
import senior.hrms.emps.dto.*;
import senior.hrms.emps.exceptions.CountriesDaoException;
import senior.hrms.emps.exceptions.RolesDaoException;
import settings.handler.general.*;
/**
 *
 * @author amal
 */
public class TestHandlers
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RolesDaoException, CountriesDaoException
    {
        directAccess(); 
     
        inDirectAccess();
    }
    protected static void inDirectAccess() throws RolesDaoException
    {
        Roles obj = new Roles();
        obj.setRoleName("Test123");
        RoleHandler handler = new RoleHandler();
        handler.addRole(obj);
    }
    protected static void directAccess() throws CountriesDaoException
    {
        Country obj = new Country();
        Countries[] countryList = obj.getCountries();
        for(int i=0; i< countryList.length; i++)
        {
            Countries country = countryList[i];
            System.out.println(i + "-" + country.getCountryName() + "-" + country.getCountryId());
        }
    }
    
}
