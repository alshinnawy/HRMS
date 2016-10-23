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

public interface MaritalStatusDao
{
	/** 
	 * Inserts a new row in the MARITAL_STATUS table.
	 */
	public MaritalStatusPk insert(MaritalStatus dto) throws MaritalStatusDaoException;

	/** 
	 * Updates a single row in the MARITAL_STATUS table.
	 */
	public void update(MaritalStatusPk pk, MaritalStatus dto) throws MaritalStatusDaoException;

	/** 
	 * Deletes a single row in the MARITAL_STATUS table.
	 */
	public void delete(MaritalStatusPk pk) throws MaritalStatusDaoException;

	/** 
	 * Returns the rows from the MARITAL_STATUS table that matches the specified primary-key value.
	 */
	public MaritalStatus findByPrimaryKey(MaritalStatusPk pk) throws MaritalStatusDaoException;

	/** 
	 * Returns all rows from the MARITAL_STATUS table that match the criteria 'MARITAL_STATUS_ID = :maritalStatusId'.
	 */
	public MaritalStatus findByPrimaryKey(int maritalStatusId) throws MaritalStatusDaoException;

	/** 
	 * Returns all rows from the MARITAL_STATUS table that match the criteria ''.
	 */
	public MaritalStatus[] findAll() throws MaritalStatusDaoException;

	/** 
	 * Returns all rows from the MARITAL_STATUS table that match the criteria 'MARITAL_STATUS_ID = :maritalStatusId'.
	 */
	public MaritalStatus[] findWhereMaritalStatusIdEquals(int maritalStatusId) throws MaritalStatusDaoException;

	/** 
	 * Returns all rows from the MARITAL_STATUS table that match the criteria 'MARITAL_STATUS_NAME = :maritalStatusName'.
	 */
	public MaritalStatus[] findWhereMaritalStatusNameEquals(String maritalStatusName) throws MaritalStatusDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the MARITAL_STATUS table that match the specified arbitrary SQL statement
	 */
	public MaritalStatus[] findByDynamicSelect(String sql, Object[] sqlParams) throws MaritalStatusDaoException;

	/** 
	 * Returns all rows from the MARITAL_STATUS table that match the specified arbitrary SQL statement
	 */
	public MaritalStatus[] findByDynamicWhere(String sql, Object[] sqlParams) throws MaritalStatusDaoException;

}