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
 * This class represents the primary key of the FINANCIAL_YEARS table.
 */
public class FinancialYearsPk implements Serializable
{
	protected int financialYearId;

	/** 
	 * This attribute represents whether the primitive attribute financialYearId is null.
	 */
	protected boolean financialYearIdNull;

	/** 
	 * Sets the value of financialYearId
	 */
	public void setFinancialYearId(int financialYearId)
	{
		this.financialYearId = financialYearId;
	}

	/** 
	 * Gets the value of financialYearId
	 */
	public int getFinancialYearId()
	{
		return financialYearId;
	}

	/**
	 * Method 'FinancialYearsPk'
	 * 
	 */
	public FinancialYearsPk()
	{
	}

	/**
	 * Method 'FinancialYearsPk'
	 * 
	 * @param financialYearId
	 */
	public FinancialYearsPk(final int financialYearId)
	{
		this.financialYearId = financialYearId;
	}

	/** 
	 * Sets the value of financialYearIdNull
	 */
	public void setFinancialYearIdNull(boolean financialYearIdNull)
	{
		this.financialYearIdNull = financialYearIdNull;
	}

	/** 
	 * Gets the value of financialYearIdNull
	 */
	public boolean isFinancialYearIdNull()
	{
		return financialYearIdNull;
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
		
		if (!(_other instanceof FinancialYearsPk)) {
			return false;
		}
		
		final FinancialYearsPk _cast = (FinancialYearsPk) _other;
		if (financialYearId != _cast.financialYearId) {
			return false;
		}
		
		if (financialYearIdNull != _cast.financialYearIdNull) {
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
		_hashCode = 29 * _hashCode + financialYearId;
		_hashCode = 29 * _hashCode + (financialYearIdNull ? 1 : 0);
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
		ret.append( "senior.hrms.emps.dto.FinancialYearsPk: " );
		ret.append( "financialYearId=" + financialYearId );
		return ret.toString();
	}

}
