/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings.handler.affairs;

import senior.hrms.emps.dto.Leaves;
import senior.hrms.emps.dto.LeavesPk;
import senior.hrms.emps.exceptions.LeavesDaoException;

/**
 *
 * @author amal
 */
public class LeavesHandler implements LeavesInterface
{

    @Override
    public LeavesPk addLeaves(Leaves dto) throws LeavesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateLeaves(LeavesPk pk, Leaves dto) throws LeavesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteLeaves(LeavesPk pk) throws LeavesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Leaves getLeavesById(int leaveId) throws LeavesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Leaves[] getAllLeaves() throws LeavesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Leaves[] getLeavesByName(String leaveName) throws LeavesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
