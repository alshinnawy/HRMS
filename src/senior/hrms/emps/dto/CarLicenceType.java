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

public class CarLicenceType implements Serializable
{
	/** 
	 * This attribute maps to the column CAR_LICENCE_TYPE_ID in the CAR_LICENCE_TYPE table.
	 */
	protected int carLicenceTypeId;

	/** 
	 * This attribute maps to the column CAR_LICENCE_TYPE_NAME in the CAR_LICENCE_TYPE table.
	 */
	protected String carLicenceTypeName;

	/**
	 * Method 'CarLicenceType'
	 * 
	 */
	public CarLicenceType()
	{
	}

	/**
	 * Method 'getCarLicenceTypeId'
	 * 
	 * @return int
	 */
	public int getCarLicenceTypeId()
	{
		return carLicenceTypeId;
	}

	/**
	 * Method 'setCarLicenceTypeId'
	 * 
	 * @param carLicenceTypeId
	 */
	public void setCarLicenceTypeId(int carLicenceTypeId)
	{
		this.carLicenceTypeId = carLicenceTypeId;
	}

	/**
	 * Method 'getCarLicenceTypeName'
	 * 
	 * @return String
	 */
	public String getCarLicenceTypeName()
	{
		return carLicenceTypeName;
	}

	/**
	 * Method 'setCarLicenceTypeName'
	 * 
	 * @param carLicenceTypeName
	 */
	public void setCarLicenceTypeName(String carLicenceTypeName)
	{
		this.carLicenceTypeName = carLicenceTypeName;
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
		
		if (!(_other instanceof CarLicenceType)) {
			return false;
		}
		
		final CarLicenceType _cast = (CarLicenceType) _other;
		if (carLicenceTypeId != _cast.carLicenceTypeId) {
			return false;
		}
		
		if (carLicenceTypeName == null ? _cast.carLicenceTypeName != carLicenceTypeName : !carLicenceTypeName.equals( _cast.carLicenceTypeName )) {
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
		_hashCode = 29 * _hashCode + carLicenceTypeId;
		if (carLicenceTypeName != null) {
			_hashCode = 29 * _hashCode + carLicenceTypeName.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return CarLicenceTypePk
	 */
	public CarLicenceTypePk createPk()
	{
		return new CarLicenceTypePk(carLicenceTypeId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "senior.hrms.emps.dto.CarLicenceType: " );
		ret.append( "carLicenceTypeId=" + carLicenceTypeId );
		ret.append( ", carLicenceTypeName=" + carLicenceTypeName );
		return ret.toString();
	}

}
