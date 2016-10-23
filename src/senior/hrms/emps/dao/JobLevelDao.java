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

public interface JobLevelDao
{
	/** 
	 * Inserts a new row in the JOB_LEVEL table.
	 */
	public JobLevelPk insert(JobLevel dto) throws JobLevelDaoException;

	/** 
	 * Updates a single row in the JOB_LEVEL table.
	 */
	public void update(JobLevelPk pk, JobLevel dto) throws JobLevelDaoException;

	/** 
	 * Deletes a single row in the JOB_LEVEL table.
	 */
	public void delete(JobLevelPk pk) throws JobLevelDaoException;

	/** 
	 * Returns the rows from the JOB_LEVEL table that matches the specified primary-key value.
	 */
	public JobLevel findByPrimaryKey(JobLevelPk pk) throws JobLevelDaoException;

	/** 
	 * Returns all rows from the JOB_LEVEL table that match the criteria 'JOB_LEVEL_ID = :jobLevelId'.
	 */
	public JobLevel findByPrimaryKey(int jobLevelId) throws JobLevelDaoException;

	/** 
	 * Returns all rows from the JOB_LEVEL table that match the criteria ''.
	 */
	public JobLevel[] findAll() throws JobLevelDaoException;

	/** 
	 * Returns all rows from the JOB_LEVEL table that match the criteria 'JOB_LEVEL_ID = :jobLevelId'.
	 */
	public JobLevel[] findWhereJobLevelIdEquals(int jobLevelId) throws JobLevelDaoException;

	/** 
	 * Returns all rows from the JOB_LEVEL table that match the criteria 'JOB_LEVEL_NAME = :jobLevelName'.
	 */
	public JobLevel[] findWhereJobLevelNameEquals(String jobLevelName) throws JobLevelDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the JOB_LEVEL table that match the specified arbitrary SQL statement
	 */
	public JobLevel[] findByDynamicSelect(String sql, Object[] sqlParams) throws JobLevelDaoException;

	/** 
	 * Returns all rows from the JOB_LEVEL table that match the specified arbitrary SQL statement
	 */
	public JobLevel[] findByDynamicWhere(String sql, Object[] sqlParams) throws JobLevelDaoException;

}