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

public class BusLineAreas implements Serializable
{
	/** 
	 * This attribute maps to the column BUS_LINE_AREA_ID in the BUS_LINE_AREAS table.
	 */
	protected int busLineAreaId;

	/** 
	 * This attribute maps to the column BUS_LINE_AREA_NAME in the BUS_LINE_AREAS table.
	 */
	protected String busLineAreaName;

	/** 
	 * This attribute maps to the column BUS_LINE_ID in the BUS_LINE_AREAS table.
	 */
	protected int busLineId;

	/**
	 * Method 'BusLineAreas'
	 * 
	 */
	public BusLineAreas()
	{
	}

	/**
	 * Method 'getBusLineAreaId'
	 * 
	 * @return int
	 */
	public int getBusLineAreaId()
	{
		return busLineAreaId;
	}

	/**
	 * Method 'setBusLineAreaId'
	 * 
	 * @param busLineAreaId
	 */
	public void setBusLineAreaId(int busLineAreaId)
	{
		this.busLineAreaId = busLineAreaId;
	}

	/**
	 * Method 'getBusLineAreaName'
	 * 
	 * @return String
	 */
	public String getBusLineAreaName()
	{
		return busLineAreaName;
	}

	/**
	 * Method 'setBusLineAreaName'
	 * 
	 * @param busLineAreaName
	 */
	public void setBusLineAreaName(String busLineAreaName)
	{
		this.busLineAreaName = busLineAreaName;
	}

	/**
	 * Method 'getBusLineId'
	 * 
	 * @return int
	 */
	public int getBusLineId()
	{
		return busLineId;
	}

	/**
	 * Method 'setBusLineId'
	 * 
	 * @param busLineId
	 */
	public void setBusLineId(int busLineId)
	{
		this.busLineId = busLineId;
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
		
		if (!(_other instanceof BusLineAreas)) {
			return false;
		}
		
		final BusLineAreas _cast = (BusLineAreas) _other;
		if (busLineAreaId != _cast.busLineAreaId) {
			return false;
		}
		
		if (busLineAreaName == null ? _cast.busLineAreaName != busLineAreaName : !busLineAreaName.equals( _cast.busLineAreaName )) {
			return false;
		}
		
		if (busLineId != _cast.busLineId) {
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
		_hashCode = 29 * _hashCode + busLineAreaId;
		if (busLineAreaName != null) {
			_hashCode = 29 * _hashCode + busLineAreaName.hashCode();
		}
		
		_hashCode = 29 * _hashCode + busLineId;
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return BusLineAreasPk
	 */
	public BusLineAreasPk createPk()
	{
		return new BusLineAreasPk(busLineAreaId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "senior.hrms.emps.dto.BusLineAreas: " );
		ret.append( "busLineAreaId=" + busLineAreaId );
		ret.append( ", busLineAreaName=" + busLineAreaName );
		ret.append( ", busLineId=" + busLineId );
		return ret.toString();
	}

}
