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

public class Roles implements Serializable
{
	/** 
	 * This attribute maps to the column ROLE_ID in the ROLES table.
	 */
	protected int roleId;

	/** 
	 * This attribute maps to the column ROLE_NAME in the ROLES table.
	 */
	protected String roleName;

	/**
	 * Method 'Roles'
	 * 
	 */
	public Roles()
	{
	}

	/**
	 * Method 'getRoleId'
	 * 
	 * @return int
	 */
	public int getRoleId()
	{
		return roleId;
	}

	/**
	 * Method 'setRoleId'
	 * 
	 * @param roleId
	 */
	public void setRoleId(int roleId)
	{
		this.roleId = roleId;
	}

	/**
	 * Method 'getRoleName'
	 * 
	 * @return String
	 */
	public String getRoleName()
	{
		return roleName;
	}

	/**
	 * Method 'setRoleName'
	 * 
	 * @param roleName
	 */
	public void setRoleName(String roleName)
	{
		this.roleName = roleName;
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
		
		if (!(_other instanceof Roles)) {
			return false;
		}
		
		final Roles _cast = (Roles) _other;
		if (roleId != _cast.roleId) {
			return false;
		}
		
		if (roleName == null ? _cast.roleName != roleName : !roleName.equals( _cast.roleName )) {
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
		_hashCode = 29 * _hashCode + roleId;
		if (roleName != null) {
			_hashCode = 29 * _hashCode + roleName.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return RolesPk
	 */
	public RolesPk createPk()
	{
		return new RolesPk(roleId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "senior.hrms.emps.dto.Roles: " );
		ret.append( "roleId=" + roleId );
		ret.append( ", roleName=" + roleName );
		return ret.toString();
	}

}
