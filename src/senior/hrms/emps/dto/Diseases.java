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

public class Diseases implements Serializable
{
	/** 
	 * This attribute maps to the column DISEASE_ID in the DISEASES table.
	 */
	protected int diseaseId;

	/** 
	 * This attribute maps to the column DISEASE_NAME in the DISEASES table.
	 */
	protected String diseaseName;

	/** 
	 * This attribute maps to the column RESULT in the DISEASES table.
	 */
	protected String result;

	/** 
	 * This attribute maps to the column DISEASE_TYPE_ID in the DISEASES table.
	 */
	protected int diseaseTypeId;

	/** 
	 * This attribute represents whether the primitive attribute diseaseTypeId is null.
	 */
	protected boolean diseaseTypeIdNull = true;

	/**
	 * Method 'Diseases'
	 * 
	 */
	public Diseases()
	{
	}

	/**
	 * Method 'getDiseaseId'
	 * 
	 * @return int
	 */
	public int getDiseaseId()
	{
		return diseaseId;
	}

	/**
	 * Method 'setDiseaseId'
	 * 
	 * @param diseaseId
	 */
	public void setDiseaseId(int diseaseId)
	{
		this.diseaseId = diseaseId;
	}

	/**
	 * Method 'getDiseaseName'
	 * 
	 * @return String
	 */
	public String getDiseaseName()
	{
		return diseaseName;
	}

	/**
	 * Method 'setDiseaseName'
	 * 
	 * @param diseaseName
	 */
	public void setDiseaseName(String diseaseName)
	{
		this.diseaseName = diseaseName;
	}

	/**
	 * Method 'getResult'
	 * 
	 * @return String
	 */
	public String getResult()
	{
		return result;
	}

	/**
	 * Method 'setResult'
	 * 
	 * @param result
	 */
	public void setResult(String result)
	{
		this.result = result;
	}

	/**
	 * Method 'getDiseaseTypeId'
	 * 
	 * @return int
	 */
	public int getDiseaseTypeId()
	{
		return diseaseTypeId;
	}

	/**
	 * Method 'setDiseaseTypeId'
	 * 
	 * @param diseaseTypeId
	 */
	public void setDiseaseTypeId(int diseaseTypeId)
	{
		this.diseaseTypeId = diseaseTypeId;
		this.diseaseTypeIdNull = false;
	}

	/**
	 * Method 'setDiseaseTypeIdNull'
	 * 
	 * @param value
	 */
	public void setDiseaseTypeIdNull(boolean value)
	{
		this.diseaseTypeIdNull = value;
	}

	/**
	 * Method 'isDiseaseTypeIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isDiseaseTypeIdNull()
	{
		return diseaseTypeIdNull;
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
		
		if (!(_other instanceof Diseases)) {
			return false;
		}
		
		final Diseases _cast = (Diseases) _other;
		if (diseaseId != _cast.diseaseId) {
			return false;
		}
		
		if (diseaseName == null ? _cast.diseaseName != diseaseName : !diseaseName.equals( _cast.diseaseName )) {
			return false;
		}
		
		if (result == null ? _cast.result != result : !result.equals( _cast.result )) {
			return false;
		}
		
		if (diseaseTypeId != _cast.diseaseTypeId) {
			return false;
		}
		
		if (diseaseTypeIdNull != _cast.diseaseTypeIdNull) {
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
		_hashCode = 29 * _hashCode + diseaseId;
		if (diseaseName != null) {
			_hashCode = 29 * _hashCode + diseaseName.hashCode();
		}
		
		if (result != null) {
			_hashCode = 29 * _hashCode + result.hashCode();
		}
		
		_hashCode = 29 * _hashCode + diseaseTypeId;
		_hashCode = 29 * _hashCode + (diseaseTypeIdNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return DiseasesPk
	 */
	public DiseasesPk createPk()
	{
		return new DiseasesPk(diseaseId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "senior.hrms.emps.dto.Diseases: " );
		ret.append( "diseaseId=" + diseaseId );
		ret.append( ", diseaseName=" + diseaseName );
		ret.append( ", result=" + result );
		ret.append( ", diseaseTypeId=" + diseaseTypeId );
		return ret.toString();
	}

}
