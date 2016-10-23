/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import senior.hrms.emps.dao.UsersDao;
import senior.hrms.emps.dto.Users;
import senior.hrms.emps.exceptions.UsersDaoException;
import senior.hrms.emps.factory.UsersDaoFactory;

/**
 *
 * @author DoaaSobhy
 */
public class Test
{
    public void print()
    {
        UsersDao dao = UsersDaoFactory.create();
        int rows = dao.getMaxRows();
        System.out.println("Total Rows = " + rows);
    }
    /**
     * 
     * @throws UsersDaoException 
     */
    public void getAll() throws UsersDaoException
    {
        String[] sqlParams = new String[2];
        sqlParams[0] = "admin";
        sqlParams[1] = "admin";
        
        String sql =" USER_NAME=? AND USER_PASSWORD=? order by USER_ID desc";
        
        UsersDao usrDao = UsersDaoFactory.create();
        //Users userList[] = usrDao.findByDynamicWhere(sql, sqlParams);
        Users userList[] = usrDao.findAll();
        System.out.println("Total Users = " + userList.length);
    }
}
