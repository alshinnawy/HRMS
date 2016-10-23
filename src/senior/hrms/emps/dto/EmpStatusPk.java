/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package senior.hrms.emps.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the EMP_STATUS table.
 */
public class EmpStatusPk implements Serializable
{
	protected int empStatusId;

	/** 
	 * This attribute represents whether the primitive attribute empStatusId is null.
	 */
	protected boolean empStatusIdNull;

	/** 
	 * Sets the value of empStatusId
	 */
	public void setEmpStatusId(int empStatusId)
	{
		this.empStatusId = empStatusId;
	}

	/** 
	 * Gets the value of empStatusId
	 */
	public int getEmpStatusId()
	{
		return empStatusId;
	}

	/**
	 * Method 'EmpStatusPk'
	 * 
	 */
	public EmpStatusPk()
	{
	}

	/**
	 * Method 'EmpStatusPk'
	 * 
	 * @param empStatusId
	 */
	public EmpStatusPk(final int empStatusId)
	{
		this.empStatusId = empStatusId;
	}

	/** 
	 * Sets the value of empStatusIdNull
	 */
	public void setEmpStatusIdNull(boolean empStatusIdNull)
	{
		this.empStatusIdNull = empStatusIdNull;
	}

	/** 
	 * Gets the value of empStatusIdNull
	 */
	public boolean isEmpStatusIdNull()
	{
		return empStatusIdNull;
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
		
		if (!(_other instanceof EmpStatusPk)) {
			return false;
		}
		
		final EmpStatusPk _cast = (EmpStatusPk) _other;
		if (empStatusId != _cast.empStatusId) {
			return false;
		}
		
		if (empStatusIdNull != _cast.empStatusIdNull) {
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
		_hashCode = 29 * _hashCode + empStatusId;
		_hashCode = 29 * _hashCode + (empStatusIdNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "senior.hrms.emps.dto.EmpStatusPk: " );
		ret.append( "empStatusId=" + empStatusId );
		return ret.toString();
	}

}