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

public interface MilitaryStatusDao
{
	/** 
	 * Inserts a new row in the MILITARY_STATUS table.
	 */
	public MilitaryStatusPk insert(MilitaryStatus dto) throws MilitaryStatusDaoException;

	/** 
	 * Updates a single row in the MILITARY_STATUS table.
	 */
	public void update(MilitaryStatusPk pk, MilitaryStatus dto) throws MilitaryStatusDaoException;

	/** 
	 * Deletes a single row in the MILITARY_STATUS table.
	 */
	public void delete(MilitaryStatusPk pk) throws MilitaryStatusDaoException;

	/** 
	 * Returns the rows from the MILITARY_STATUS table that matches the specified primary-key value.
	 */
	public MilitaryStatus findByPrimaryKey(MilitaryStatusPk pk) throws MilitaryStatusDaoException;

	/** 
	 * Returns all rows from the MILITARY_STATUS table that match the criteria 'MILITARY_STATUS_ID = :militaryStatusId'.
	 */
	public MilitaryStatus findByPrimaryKey(int militaryStatusId) throws MilitaryStatusDaoException;

	/** 
	 * Returns all rows from the MILITARY_STATUS table that match the criteria ''.
	 */
	public MilitaryStatus[] findAll() throws MilitaryStatusDaoException;

	/** 
	 * Returns all rows from the MILITARY_STATUS table that match the criteria 'MILITARY_STATUS_ID = :militaryStatusId'.
	 */
	public MilitaryStatus[] findWhereMilitaryStatusIdEquals(int militaryStatusId) throws MilitaryStatusDaoException;

	/** 
	 * Returns all rows from the MILITARY_STATUS table that match the criteria 'MILITARY_STATUS_NAME = :militaryStatusName'.
	 */
	public MilitaryStatus[] findWhereMilitaryStatusNameEquals(byte[] militaryStatusName) throws MilitaryStatusDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the MILITARY_STATUS table that match the specified arbitrary SQL statement
	 */
	public MilitaryStatus[] findByDynamicSelect(String sql, Object[] sqlParams) throws MilitaryStatusDaoException;

	/** 
	 * Returns all rows from the MILITARY_STATUS table that match the specified arbitrary SQL statement
	 */
	public MilitaryStatus[] findByDynamicWhere(String sql, Object[] sqlParams) throws MilitaryStatusDaoException;

}