/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.handler;

import senior.hrms.emps.dto.Roles;
import senior.hrms.emps.dto.RolesPk;
import senior.hrms.emps.exceptions.RolesDaoException;

/**
 *
 * @author amal
 */
public interface RoleHndlerInterface
{

    public void addRole(Roles dto) throws RolesDaoException;

    public void updateRole(RolesPk pk, Roles dto) throws RolesDaoException;

    public void deleteRole(RolesPk pk) throws RolesDaoException;

    public Roles getRoleByRoleId(int roleId) throws RolesDaoException;

    public Roles[] getAllRoles() throws RolesDaoException;

    public Roles[] getRoleByName(String roleName) throws RolesDaoException;
}
