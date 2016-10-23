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
import java.util.Date;

public class OfficialVacationsSched implements Serializable
{
	/** 
	 * This attribute maps to the column OFFICIAL_VAC_SCHED_ID in the OFFICIAL_VACATIONS_SCHED table.
	 */
	protected int officialVacSchedId;

	/** 
	 * This attribute maps to the column OFFICIAL_VACATION_ID in the OFFICIAL_VACATIONS_SCHED table.
	 */
	protected int officialVacationId;

	/** 
	 * This attribute maps to the column DATE_FROM in the OFFICIAL_VACATIONS_SCHED table.
	 */
	protected Date dateFrom;

	/** 
	 * This attribute maps to the column DATE_TO in the OFFICIAL_VACATIONS_SCHED table.
	 */
	protected Date dateTo;

	/** 
	 * This attribute maps to the column FINANCIAL_YEAR_ID in the OFFICIAL_VACATIONS_SCHED table.
	 */
	protected int financialYearId;

	/**
	 * Method 'OfficialVacationsSched'
	 * 
	 */
	public OfficialVacationsSched()
	{
	}

	/**
	 * Method 'getOfficialVacSchedId'
	 * 
	 * @return int
	 */
	public int getOfficialVacSchedId()
	{
		return officialVacSchedId;
	}

	/**
	 * Method 'setOfficialVacSchedId'
	 * 
	 * @param officialVacSchedId
	 */
	public void setOfficialVacSchedId(int officialVacSchedId)
	{
		this.officialVacSchedId = officialVacSchedId;
	}

	/**
	 * Method 'getOfficialVacationId'
	 * 
	 * @return int
	 */
	public int getOfficialVacationId()
	{
		return officialVacationId;
	}

	/**
	 * Method 'setOfficialVacationId'
	 * 
	 * @param officialVacationId
	 */
	public void setOfficialVacationId(int officialVacationId)
	{
		this.officialVacationId = officialVacationId;
	}

	/**
	 * Method 'getDateFrom'
	 * 
	 * @return Date
	 */
	public Date getDateFrom()
	{
		return dateFrom;
	}

	/**
	 * Method 'setDateFrom'
	 * 
	 * @param dateFrom
	 */
	public void setDateFrom(Date dateFrom)
	{
		this.dateFrom = dateFrom;
	}

	/**
	 * Method 'getDateTo'
	 * 
	 * @return Date
	 */
	public Date getDateTo()
	{
		return dateTo;
	}

	/**
	 * Method 'setDateTo'
	 * 
	 * @param dateTo
	 */
	public void setDateTo(Date dateTo)
	{
		this.dateTo = dateTo;
	}

	/**
	 * Method 'getFinancialYearId'
	 * 
	 * @return int
	 */
	public int getFinancialYearId()
	{
		return financialYearId;
	}

	/**
	 * Method 'setFinancialYearId'
	 * 
	 * @param financialYearId
	 */
	public void setFinancialYearId(int financialYearId)
	{
		this.financialYearId = financialYearId;
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
		
		if (!(_other instanceof OfficialVacationsSched)) {
			return false;
		}
		
		final OfficialVacationsSched _cast = (OfficialVacationsSched) _other;
		if (officialVacSchedId != _cast.officialVacSchedId) {
			return false;
		}
		
		if (officialVacationId != _cast.officialVacationId) {
			return false;
		}
		
		if (dateFrom == null ? _cast.dateFrom != dateFrom : !dateFrom.equals( _cast.dateFrom )) {
			return false;
		}
		
		if (dateTo == null ? _cast.dateTo != dateTo : !dateTo.equals( _cast.dateTo )) {
			return false;
		}
		
		if (financialYearId != _cast.financialYearId) {
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
		_hashCode = 29 * _hashCode + officialVacSchedId;
		_hashCode = 29 * _hashCode + officialVacationId;
		if (dateFrom != null) {
			_hashCode = 29 * _hashCode + dateFrom.hashCode();
		}
		
		if (dateTo != null) {
			_hashCode = 29 * _hashCode + dateTo.hashCode();
		}
		
		_hashCode = 29 * _hashCode + financialYearId;
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return OfficialVacationsSchedPk
	 */
	public OfficialVacationsSchedPk createPk()
	{
		return new OfficialVacationsSchedPk(officialVacSchedId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "senior.hrms.emps.dto.OfficialVacationsSched: " );
		ret.append( "officialVacSchedId=" + officialVacSchedId );
		ret.append( ", officialVacationId=" + officialVacationId );
		ret.append( ", dateFrom=" + dateFrom );
		ret.append( ", dateTo=" + dateTo );
		ret.append( ", financialYearId=" + financialYearId );
		return ret.toString();
	}

}