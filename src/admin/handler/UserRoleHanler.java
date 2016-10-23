/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.handler;

import senior.hrms.emps.dao.*;
import senior.hrms.emps.dto.*;
import senior.hrms.emps.dto.*;
import senior.hrms.emps.exceptions.*;
import senior.hrms.emps.factory.*;

/**
 *
 * @author amal
 */
public class UserRoleHanler implements UserRoleHanlerInterface
{

    public void addUserRole(UsersRoles dto) throws UsersRolesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateUserRole(UsersRolesPk pk, UsersRoles dto) throws UsersRolesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void deleteUserRole(UsersRolesPk pk) throws UsersRolesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public UsersRoles getUserRoleById(int userRoleId) throws UsersRolesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public UsersRoles[] getAllUserRole() throws UsersRolesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public UsersRoles[] getUserRolesByRoleId(int roleId) throws UsersRolesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public UsersRoles[] getUserRolesByUserId(int userId) throws UsersRolesDaoException
    {
        UsersRolesDao urDao = UsersRolesDaoFactory.create();
        UsersRoles[] usrRoleList =urDao.findWhereUserIdEquals(userId);
        return usrRoleList;
    }

    public UsersRoles[] getUserRoleByDescription(String description) throws UsersRolesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
