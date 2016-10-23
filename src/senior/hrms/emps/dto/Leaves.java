/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package senior.hrms.emps.dto;

import senior.hrms.emps.dao.*;
import senior.hrms.emps.factory.*;
import senior.hrms.emps.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class Leaves implements Serializable
{
	/** 
	 * This attribute maps to the column LEAVE_ID in the LEAVES table.
	 */
	protected int leaveId;

	/** 
	 * This attribute maps to the column LEAVE_NAME in the LEAVES table.
	 */
	protected String leaveName;

	/**
	 * Method 'Leaves'
	 * 
	 */
	public Leaves()
	{
	}

	/**
	 * Method 'getLeaveId'
	 * 
	 * @return int
	 */
	public int getLeaveId()
	{
		return leaveId;
	}

	/**
	 * Method 'setLeaveId'
	 * 
	 * @param leaveId
	 */
	public void setLeaveId(int leaveId)
	{
		this.leaveId = leaveId;
	}

	/**
	 * Method 'getLeaveName'
	 * 
	 * @return String
	 */
	public String getLeaveName()
	{
		return leaveName;
	}

	/**
	 * Method 'setLeaveName'
	 * 
	 * @param leaveName
	 */
	public void setLeaveName(String leaveName)
	{
		this.leaveName = leaveName;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof Leaves)) {
			return false;
		}
		
		final Leaves _cast = (Leaves) _other;
		if (leaveId != _cast.leaveId) {
			return false;
		}
		
		if (leaveName == null ? _cast.leaveName != leaveName : !leaveName.equals( _cast.leaveName )) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + leaveId;
		if (leaveName != null) {
			_hashCode = 29 * _hashCode + leaveName.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return LeavesPk
	 */
	public LeavesPk createPk()
	{
		return new LeavesPk(leaveId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "senior.hrms.emps.dto.Leaves: " );
		ret.append( "leaveId=" + leaveId );
		ret.append( ", leaveName=" + leaveName );
		return ret.toString();
	}

}