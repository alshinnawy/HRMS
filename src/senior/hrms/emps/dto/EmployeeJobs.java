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

public class EmployeeJobs implements Serializable
{
	/** 
	 * This attribute maps to the column EMPLOYEE_JOB_ID in the EMPLOYEE_JOBS table.
	 */
	protected int employeeJobId;

	/** 
	 * This attribute maps to the column EMPLOYEE_ID in the EMPLOYEE_JOBS table.
	 */
	protected int employeeId;

	/** 
	 * This attribute maps to the column JOB_TITLE_ID in the EMPLOYEE_JOBS table.
	 */
	protected int jobTitleId;

	/** 
	 * This attribute maps to the column JOB_LEVEL_ID in the EMPLOYEE_JOBS table.
	 */
	protected int jobLevelId;

	/** 
	 * This attribute represents whether the primitive attribute jobLevelId is null.
	 */
	protected boolean jobLevelIdNull = true;

	/** 
	 * This attribute maps to the column SECTOR_ID in the EMPLOYEE_JOBS table.
	 */
	protected int sectorId;

	/** 
	 * This attribute represents whether the primitive attribute sectorId is null.
	 */
	protected boolean sectorIdNull = true;

	/** 
	 * This attribute maps to the column DEPARTMENT_ID in the EMPLOYEE_JOBS table.
	 */
	protected int departmentId;

	/** 
	 * This attribute represents whether the primitive attribute departmentId is null.
	 */
	protected boolean departmentIdNull = true;

	/** 
	 * This attribute maps to the column SECTION_ID in the EMPLOYEE_JOBS table.
	 */
	protected int sectionId;

	/** 
	 * This attribute represents whether the primitive attribute sectionId is null.
	 */
	protected boolean sectionIdNull = true;

	/** 
	 * This attribute maps to the column JOIN_DATE in the EMPLOYEE_JOBS table.
	 */
	protected Date joinDate;

	/** 
	 * This attribute maps to the column CURRENT_JOB in the EMPLOYEE_JOBS table.
	 */
	protected int currentJob;

	/** 
	 * This attribute represents whether the primitive attribute currentJob is null.
	 */
	protected boolean currentJobNull = true;

	/** 
	 * This attribute maps to the column IS_MANAGER in the EMPLOYEE_JOBS table.
	 */
	protected int isManager;

	/** 
	 * This attribute represents whether the primitive attribute isManager is null.
	 */
	protected boolean isManagerNull = true;

	/** 
	 * This attribute maps to the column CURRENT_MANAGER in the EMPLOYEE_JOBS table.
	 */
	protected int currentManager;

	/** 
	 * This attribute represents whether the primitive attribute currentManager is null.
	 */
	protected boolean currentManagerNull = true;

	/** 
	 * This attribute maps to the column REQUEST_DATE in the EMPLOYEE_JOBS table.
	 */
	protected Date requestDate;

	/** 
	 * This attribute maps to the column REQUEST_EMP_ID in the EMPLOYEE_JOBS table.
	 */
	protected int requestEmpId;

	/** 
	 * This attribute maps to the column APPROVED_EMP_ID in the EMPLOYEE_JOBS table.
	 */
	protected int approvedEmpId;

	/** 
	 * This attribute maps to the column EMPLOYEE_TYPE_ID in the EMPLOYEE_JOBS table.
	 */
	protected int employeeTypeId;

	/**
	 * Method 'EmployeeJobs'
	 * 
	 */
	public EmployeeJobs()
	{
	}

	/**
	 * Method 'getEmployeeJobId'
	 * 
	 * @return int
	 */
	public int getEmployeeJobId()
	{
		return employeeJobId;
	}

	/**
	 * Method 'setEmployeeJobId'
	 * 
	 * @param employeeJobId
	 */
	public void setEmployeeJobId(int employeeJobId)
	{
		this.employeeJobId = employeeJobId;
	}

	/**
	 * Method 'getEmployeeId'
	 * 
	 * @return int
	 */
	public int getEmployeeId()
	{
		return employeeId;
	}

	/**
	 * Method 'setEmployeeId'
	 * 
	 * @param employeeId
	 */
	public void setEmployeeId(int employeeId)
	{
		this.employeeId = employeeId;
	}

	/**
	 * Method 'getJobTitleId'
	 * 
	 * @return int
	 */
	public int getJobTitleId()
	{
		return jobTitleId;
	}

	/**
	 * Method 'setJobTitleId'
	 * 
	 * @param jobTitleId
	 */
	public void setJobTitleId(int jobTitleId)
	{
		this.jobTitleId = jobTitleId;
	}

	/**
	 * Method 'getJobLevelId'
	 * 
	 * @return int
	 */
	public int getJobLevelId()
	{
		return jobLevelId;
	}

	/**
	 * Method 'setJobLevelId'
	 * 
	 * @param jobLevelId
	 */
	public void setJobLevelId(int jobLevelId)
	{
		this.jobLevelId = jobLevelId;
		this.jobLevelIdNull = false;
	}

	/**
	 * Method 'setJobLevelIdNull'
	 * 
	 * @param value
	 */
	public void setJobLevelIdNull(boolean value)
	{
		this.jobLevelIdNull = value;
	}

	/**
	 * Method 'isJobLevelIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isJobLevelIdNull()
	{
		return jobLevelIdNull;
	}

	/**
	 * Method 'getSectorId'
	 * 
	 * @return int
	 */
	public int getSectorId()
	{
		return sectorId;
	}

	/**
	 * Method 'setSectorId'
	 * 
	 * @param sectorId
	 */
	public void setSectorId(int sectorId)
	{
		this.sectorId = sectorId;
		this.sectorIdNull = false;
	}

	/**
	 * Method 'setSectorIdNull'
	 * 
	 * @param value
	 */
	public void setSectorIdNull(boolean value)
	{
		this.sectorIdNull = value;
	}

	/**
	 * Method 'isSectorIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isSectorIdNull()
	{
		return sectorIdNull;
	}

	/**
	 * Method 'getDepartmentId'
	 * 
	 * @return int
	 */
	public int getDepartmentId()
	{
		return departmentId;
	}

	/**
	 * Method 'setDepartmentId'
	 * 
	 * @param departmentId
	 */
	public void setDepartmentId(int departmentId)
	{
		this.departmentId = departmentId;
		this.departmentIdNull = false;
	}

	/**
	 * Method 'setDepartmentIdNull'
	 * 
	 * @param value
	 */
	public void setDepartmentIdNull(boolean value)
	{
		this.departmentIdNull = value;
	}

	/**
	 * Method 'isDepartmentIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isDepartmentIdNull()
	{
		return departmentIdNull;
	}

	/**
	 * Method 'getSectionId'
	 * 
	 * @return int
	 */
	public int getSectionId()
	{
		return sectionId;
	}

	/**
	 * Method 'setSectionId'
	 * 
	 * @param sectionId
	 */
	public void setSectionId(int sectionId)
	{
		this.sectionId = sectionId;
		this.sectionIdNull = false;
	}

	/**
	 * Method 'setSectionIdNull'
	 * 
	 * @param value
	 */
	public void setSectionIdNull(boolean value)
	{
		this.sectionIdNull = value;
	}

	/**
	 * Method 'isSectionIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isSectionIdNull()
	{
		return sectionIdNull;
	}

	/**
	 * Method 'getJoinDate'
	 * 
	 * @return Date
	 */
	public Date getJoinDate()
	{
		return joinDate;
	}

	/**
	 * Method 'setJoinDate'
	 * 
	 * @param joinDate
	 */
	public void setJoinDate(Date joinDate)
	{
		this.joinDate = joinDate;
	}

	/**
	 * Method 'getCurrentJob'
	 * 
	 * @return int
	 */
	public int getCurrentJob()
	{
		return currentJob;
	}

	/**
	 * Method 'setCurrentJob'
	 * 
	 * @param currentJob
	 */
	public void setCurrentJob(int currentJob)
	{
		this.currentJob = currentJob;
		this.currentJobNull = false;
	}

	/**
	 * Method 'setCurrentJobNull'
	 * 
	 * @param value
	 */
	public void setCurrentJobNull(boolean value)
	{
		this.currentJobNull = value;
	}

	/**
	 * Method 'isCurrentJobNull'
	 * 
	 * @return boolean
	 */
	public boolean isCurrentJobNull()
	{
		return currentJobNull;
	}

	/**
	 * Method 'getIsManager'
	 * 
	 * @return int
	 */
	public int getIsManager()
	{
		return isManager;
	}

	/**
	 * Method 'setIsManager'
	 * 
	 * @param isManager
	 */
	public void setIsManager(int isManager)
	{
		this.isManager = isManager;
		this.isManagerNull = false;
	}

	/**
	 * Method 'setIsManagerNull'
	 * 
	 * @param value
	 */
	public void setIsManagerNull(boolean value)
	{
		this.isManagerNull = value;
	}

	/**
	 * Method 'isIsManagerNull'
	 * 
	 * @return boolean
	 */
	public boolean isIsManagerNull()
	{
		return isManagerNull;
	}

	/**
	 * Method 'getCurrentManager'
	 * 
	 * @return int
	 */
	public int getCurrentManager()
	{
		return currentManager;
	}

	/**
	 * Method 'setCurrentManager'
	 * 
	 * @param currentManager
	 */
	public void setCurrentManager(int currentManager)
	{
		this.currentManager = currentManager;
		this.currentManagerNull = false;
	}

	/**
	 * Method 'setCurrentManagerNull'
	 * 
	 * @param value
	 */
	public void setCurrentManagerNull(boolean value)
	{
		this.currentManagerNull = value;
	}

	/**
	 * Method 'isCurrentManagerNull'
	 * 
	 * @return boolean
	 */
	public boolean isCurrentManagerNull()
	{
		return currentManagerNull;
	}

	/**
	 * Method 'getRequestDate'
	 * 
	 * @return Date
	 */
	public Date getRequestDate()
	{
		return requestDate;
	}

	/**
	 * Method 'setRequestDate'
	 * 
	 * @param requestDate
	 */
	public void setRequestDate(Date requestDate)
	{
		this.requestDate = requestDate;
	}

	/**
	 * Method 'getRequestEmpId'
	 * 
	 * @return int
	 */
	public int getRequestEmpId()
	{
		return requestEmpId;
	}

	/**
	 * Method 'setRequestEmpId'
	 * 
	 * @param requestEmpId
	 */
	public void setRequestEmpId(int requestEmpId)
	{
		this.requestEmpId = requestEmpId;
	}

	/**
	 * Method 'getApprovedEmpId'
	 * 
	 * @return int
	 */
	public int getApprovedEmpId()
	{
		return approvedEmpId;
	}

	/**
	 * Method 'setApprovedEmpId'
	 * 
	 * @param approvedEmpId
	 */
	public void setApprovedEmpId(int approvedEmpId)
	{
		this.approvedEmpId = approvedEmpId;
	}

	/**
	 * Method 'getEmployeeTypeId'
	 * 
	 * @return int
	 */
	public int getEmployeeTypeId()
	{
		return employeeTypeId;
	}

	/**
	 * Method 'setEmployeeTypeId'
	 * 
	 * @param employeeTypeId
	 */
	public void setEmployeeTypeId(int employeeTypeId)
	{
		this.employeeTypeId = employeeTypeId;
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
		
		if (!(_other instanceof EmployeeJobs)) {
			return false;
		}
		
		final EmployeeJobs _cast = (EmployeeJobs) _other;
		if (employeeJobId != _cast.employeeJobId) {
			return false;
		}
		
		if (employeeId != _cast.employeeId) {
			return false;
		}
		
		if (jobTitleId != _cast.jobTitleId) {
			return false;
		}
		
		if (jobLevelId != _cast.jobLevelId) {
			return false;
		}
		
		if (jobLevelIdNull != _cast.jobLevelIdNull) {
			return false;
		}
		
		if (sectorId != _cast.sectorId) {
			return false;
		}
		
		if (sectorIdNull != _cast.sectorIdNull) {
			return false;
		}
		
		if (departmentId != _cast.departmentId) {
			return false;
		}
		
		if (departmentIdNull != _cast.departmentIdNull) {
			return false;
		}
		
		if (sectionId != _cast.sectionId) {
			return false;
		}
		
		if (sectionIdNull != _cast.sectionIdNull) {
			return false;
		}
		
		if (joinDate == null ? _cast.joinDate != joinDate : !joinDate.equals( _cast.joinDate )) {
			return false;
		}
		
		if (currentJob != _cast.currentJob) {
			return false;
		}
		
		if (currentJobNull != _cast.currentJobNull) {
			return false;
		}
		
		if (isManager != _cast.isManager) {
			return false;
		}
		
		if (isManagerNull != _cast.isManagerNull) {
			return false;
		}
		
		if (currentManager != _cast.currentManager) {
			return false;
		}
		
		if (currentManagerNull != _cast.currentManagerNull) {
			return false;
		}
		
		if (requestDate == null ? _cast.requestDate != requestDate : !requestDate.equals( _cast.requestDate )) {
			return false;
		}
		
		if (requestEmpId != _cast.requestEmpId) {
			return false;
		}
		
		if (approvedEmpId != _cast.approvedEmpId) {
			return false;
		}
		
		if (employeeTypeId != _cast.employeeTypeId) {
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
		_hashCode = 29 * _hashCode + employeeJobId;
		_hashCode = 29 * _hashCode + employeeId;
		_hashCode = 29 * _hashCode + jobTitleId;
		_hashCode = 29 * _hashCode + jobLevelId;
		_hashCode = 29 * _hashCode + (jobLevelIdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + sectorId;
		_hashCode = 29 * _hashCode + (sectorIdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + departmentId;
		_hashCode = 29 * _hashCode + (departmentIdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + sectionId;
		_hashCode = 29 * _hashCode + (sectionIdNull ? 1 : 0);
		if (joinDate != null) {
			_hashCode = 29 * _hashCode + joinDate.hashCode();
		}
		
		_hashCode = 29 * _hashCode + currentJob;
		_hashCode = 29 * _hashCode + (currentJobNull ? 1 : 0);
		_hashCode = 29 * _hashCode + isManager;
		_hashCode = 29 * _hashCode + (isManagerNull ? 1 : 0);
		_hashCode = 29 * _hashCode + currentManager;
		_hashCode = 29 * _hashCode + (currentManagerNull ? 1 : 0);
		if (requestDate != null) {
			_hashCode = 29 * _hashCode + requestDate.hashCode();
		}
		
		_hashCode = 29 * _hashCode + requestEmpId;
		_hashCode = 29 * _hashCode + approvedEmpId;
		_hashCode = 29 * _hashCode + employeeTypeId;
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return EmployeeJobsPk
	 */
	public EmployeeJobsPk createPk()
	{
		return new EmployeeJobsPk(employeeJobId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "senior.hrms.emps.dto.EmployeeJobs: " );
		ret.append( "employeeJobId=" + employeeJobId );
		ret.append( ", employeeId=" + employeeId );
		ret.append( ", jobTitleId=" + jobTitleId );
		ret.append( ", jobLevelId=" + jobLevelId );
		ret.append( ", sectorId=" + sectorId );
		ret.append( ", departmentId=" + departmentId );
		ret.append( ", sectionId=" + sectionId );
		ret.append( ", joinDate=" + joinDate );
		ret.append( ", currentJob=" + currentJob );
		ret.append( ", isManager=" + isManager );
		ret.append( ", currentManager=" + currentManager );
		ret.append( ", requestDate=" + requestDate );
		ret.append( ", requestEmpId=" + requestEmpId );
		ret.append( ", approvedEmpId=" + approvedEmpId );
		ret.append( ", employeeTypeId=" + employeeTypeId );
		return ret.toString();
	}

}
