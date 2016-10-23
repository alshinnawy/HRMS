/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.handler;

import senior.hrms.emps.dao.*;
import senior.hrms.emps.dto.*;
import senior.hrms.emps.exceptions.UsersDaoException;
import senior.hrms.emps.factory.*;

/**
 *
 * @author coc
 */
public class LoginHandler 
{
    public Users[] isValidUsers(String username, String password) throws UsersDaoException
    {
        String[] sqlParams = new String[2];
        sqlParams[0] = username;
        sqlParams[1] = password;
//        Object[] sqlParams = {username , password};
        
        UsersDao usrDao = UsersDaoFactory.create();
        
        String sql =" USER_NAME=? AND USER_PASSWORD=? order by USER_ID desc";

        
        Users userList[] = usrDao.findByDynamicWhere(sql, sqlParams);
       
        return userList;
    }
    
    
   
    
    
    
}