/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.handler;

import senior.hrms.emps.dto.*;
import senior.hrms.emps.dao.*;
import senior.hrms.emps.exceptions.*;
import senior.hrms.emps.factory.*;

/**
 *
 * @author amal
 */
public class RoleHandler implements RoleHndlerInterface
{

    public void addRole(Roles dto) throws RolesDaoException
    {
        RolesDao dao = RolesDaoFactory.create();
        dao.insert(dto);
    }

    public void updateRole(RolesPk pk, Roles dto) throws RolesDaoException
    {
        RolesDao dao = RolesDaoFactory.create();
        dao.update(pk, dto);
    }

    public void deleteRole(RolesPk pk) throws RolesDaoException
    {
        RolesDao dao = RolesDaoFactory.create();
        dao.delete(pk);
    }

    public Roles getRoleByRoleId(int roleId) throws RolesDaoException
    {
        RolesDao dao = RolesDaoFactory.create();
        return dao.findByPrimaryKey(roleId);
    }

    public Roles[] getAllRoles() throws RolesDaoException
    {
        RolesDao dao = RolesDaoFactory.create();
        return dao.findAll();
    }

    public Roles[] getRoleByName(String roleName) throws RolesDaoException
    {
        RolesDao dao = RolesDaoFactory.create();
        return dao.findWhereRoleNameEquals(roleName);
    }

}
