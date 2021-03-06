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

public interface CarLicenceTypeDao
{
	/** 
	 * Inserts a new row in the CAR_LICENCE_TYPE table.
	 */
	public CarLicenceTypePk insert(CarLicenceType dto) throws CarLicenceTypeDaoException;

	/** 
	 * Updates a single row in the CAR_LICENCE_TYPE table.
	 */
	public void update(CarLicenceTypePk pk, CarLicenceType dto) throws CarLicenceTypeDaoException;

	/** 
	 * Deletes a single row in the CAR_LICENCE_TYPE table.
	 */
	public void delete(CarLicenceTypePk pk) throws CarLicenceTypeDaoException;

	/** 
	 * Returns the rows from the CAR_LICENCE_TYPE table that matches the specified primary-key value.
	 */
	public CarLicenceType findByPrimaryKey(CarLicenceTypePk pk) throws CarLicenceTypeDaoException;

	/** 
	 * Returns all rows from the CAR_LICENCE_TYPE table that match the criteria 'CAR_LICENCE_TYPE_ID = :carLicenceTypeId'.
	 */
	public CarLicenceType findByPrimaryKey(int carLicenceTypeId) throws CarLicenceTypeDaoException;

	/** 
	 * Returns all rows from the CAR_LICENCE_TYPE table that match the criteria ''.
	 */
	public CarLicenceType[] findAll() throws CarLicenceTypeDaoException;

	/** 
	 * Returns all rows from the CAR_LICENCE_TYPE table that match the criteria 'CAR_LICENCE_TYPE_ID = :carLicenceTypeId'.
	 */
	public CarLicenceType[] findWhereCarLicenceTypeIdEquals(int carLicenceTypeId) throws CarLicenceTypeDaoException;

	/** 
	 * Returns all rows from the CAR_LICENCE_TYPE table that match the criteria 'CAR_LICENCE_TYPE_NAME = :carLicenceTypeName'.
	 */
	public CarLicenceType[] findWhereCarLicenceTypeNameEquals(String carLicenceTypeName) throws CarLicenceTypeDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the CAR_LICENCE_TYPE table that match the specified arbitrary SQL statement
	 */
	public CarLicenceType[] findByDynamicSelect(String sql, Object[] sqlParams) throws CarLicenceTypeDaoException;

	/** 
	 * Returns all rows from the CAR_LICENCE_TYPE table that match the specified arbitrary SQL statement
	 */
	public CarLicenceType[] findByDynamicWhere(String sql, Object[] sqlParams) throws CarLicenceTypeDaoException;

}
