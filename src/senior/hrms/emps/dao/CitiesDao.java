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

public interface CitiesDao
{
	/** 
	 * Inserts a new row in the CITIES table.
	 */
	public CitiesPk insert(Cities dto) throws CitiesDaoException;

	/** 
	 * Updates a single row in the CITIES table.
	 */
	public void update(CitiesPk pk, Cities dto) throws CitiesDaoException;

	/** 
	 * Deletes a single row in the CITIES table.
	 */
	public void delete(CitiesPk pk) throws CitiesDaoException;

	/** 
	 * Returns the rows from the CITIES table that matches the specified primary-key value.
	 */
	public Cities findByPrimaryKey(CitiesPk pk) throws CitiesDaoException;

	/** 
	 * Returns all rows from the CITIES table that match the criteria 'CITY_ID = :cityId'.
	 */
	public Cities findByPrimaryKey(int cityId) throws CitiesDaoException;

	/** 
	 * Returns all rows from the CITIES table that match the criteria ''.
	 */
	public Cities[] findAll() throws CitiesDaoException;

	/** 
	 * Returns all rows from the CITIES table that match the criteria 'CITY_ID = :cityId'.
	 */
	public Cities[] findWhereCityIdEquals(int cityId) throws CitiesDaoException;

	/** 
	 * Returns all rows from the CITIES table that match the criteria 'CITY_NAME = :cityName'.
	 */
	public Cities[] findWhereCityNameEquals(String cityName) throws CitiesDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the CITIES table that match the specified arbitrary SQL statement
	 */
	public Cities[] findByDynamicSelect(String sql, Object[] sqlParams) throws CitiesDaoException;

	/** 
	 * Returns all rows from the CITIES table that match the specified arbitrary SQL statement
	 */
	public Cities[] findByDynamicWhere(String sql, Object[] sqlParams) throws CitiesDaoException;

}
