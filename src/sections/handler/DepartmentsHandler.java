/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sections.handler;

import senior.hrms.emps.dto.Departments;
import senior.hrms.emps.dto.DepartmentsPk;
import senior.hrms.emps.exceptions.DepartmentsDaoException;

/**
 *
 * @author amal
 */
public class DepartmentsHandler implements DepartmentsInterface
{

    @Override
    public DepartmentsPk addDepartments(Departments dto) throws DepartmentsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateDepartments(DepartmentsPk pk, Departments dto) throws DepartmentsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteDepartments(DepartmentsPk pk) throws DepartmentsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Departments getDepartmentsById(int departmentId) throws DepartmentsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Departments[] getAllDepartments() throws DepartmentsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Departments[] getDepartmentsByParentId(int parentDeptId) throws DepartmentsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Departments[] getDepartmentsBySectorId(int sectorId) throws DepartmentsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Departments[] getDepartmentByName(String departmentName) throws DepartmentsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
