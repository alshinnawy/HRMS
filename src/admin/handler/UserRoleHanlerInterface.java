/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.handler;

import senior.hrms.emps.dto.UsersRoles;
import senior.hrms.emps.dto.UsersRolesPk;
import senior.hrms.emps.exceptions.UsersRolesDaoException;

/**
 *
 * @author amal
 */
public interface UserRoleHanlerInterface
{

    public void addUserRole(UsersRoles dto) throws UsersRolesDaoException;

    public void updateUserRole(UsersRolesPk pk, UsersRoles dto) throws UsersRolesDaoException;

    public void deleteUserRole(UsersRolesPk pk) throws UsersRolesDaoException;

    public UsersRoles getUserRoleById(int userRoleId) throws UsersRolesDaoException;

    public UsersRoles[] getAllUserRole() throws UsersRolesDaoException;

    public UsersRoles[] getUserRolesByRoleId(int roleId) throws UsersRolesDaoException;

    public UsersRoles[] getUserRolesByUserId(int userId) throws UsersRolesDaoException;

    public UsersRoles[] getUserRoleByDescription(String description) throws UsersRolesDaoException;
}
