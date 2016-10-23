/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package senior.hrms.emps.dao;

import senior.hrms.emps.dto.*;
import senior.hrms.emps.exceptions.*;

public interface JobTitleDao
{
	/** 
	 * Inserts a new row in the JOB_TITLE table.
	 */
	public JobTitlePk insert(JobTitle dto) throws JobTitleDaoException;

	/** 
	 * Updates a single row in the JOB_TITLE table.
	 */
	public void update(JobTitlePk pk, JobTitle dto) throws JobTitleDaoException;

	/** 
	 * Deletes a single row in the JOB_TITLE table.
	 */
	public void delete(JobTitlePk pk) throws JobTitleDaoException;

	/** 
	 * Returns the rows from the JOB_TITLE table that matches the specified primary-key value.
	 */
	public JobTitle findByPrimaryKey(JobTitlePk pk) throws JobTitleDaoException;

	/** 
	 * Returns all rows from the JOB_TITLE table that match the criteria 'JOB_TITLE_ID = :jobTitleId'.
	 */
	public JobTitle findByPrimaryKey(int jobTitleId) throws JobTitleDaoException;

	/** 
	 * Returns all rows from the JOB_TITLE table that match the criteria ''.
	 */
	public JobTitle[] findAll() throws JobTitleDaoException;

	/** 
	 * Returns all rows from the JOB_TITLE table that match the criteria 'JOB_TITLE_ID = :jobTitleId'.
	 */
	public JobTitle[] findWhereJobTitleIdEquals(int jobTitleId) throws JobTitleDaoException;

	/** 
	 * Returns all rows from the JOB_TITLE table that match the criteria 'JOB_TITLE_NAME = :jobTitleName'.
	 */
	public JobTitle[] findWhereJobTitleNameEquals(String jobTitleName) throws JobTitleDaoException;

	/** 
	 * Returns all rows from the JOB_TITLE table that match the criteria 'JOB_DESCRIPTION = :jobDescription'.
	 */
	public JobTitle[] findWhereJobDescriptionEquals(String jobDescription) throws JobTitleDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the JOB_TITLE table that match the specified arbitrary SQL statement
	 */
	public JobTitle[] findByDynamicSelect(String sql, Object[] sqlParams) throws JobTitleDaoException;

	/** 
	 * Returns all rows from the JOB_TITLE table that match the specified arbitrary SQL statement
	 */
	public JobTitle[] findByDynamicWhere(String sql, Object[] sqlParams) throws JobTitleDaoException;

}