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

public interface EmpDocumentsDao
{
	/** 
	 * Inserts a new row in the EMP_DOCUMENTS table.
	 */
	public EmpDocumentsPk insert(EmpDocuments dto) throws EmpDocumentsDaoException;

	/** 
	 * Updates a single row in the EMP_DOCUMENTS table.
	 */
	public void update(EmpDocumentsPk pk, EmpDocuments dto) throws EmpDocumentsDaoException;

	/** 
	 * Deletes a single row in the EMP_DOCUMENTS table.
	 */
	public void delete(EmpDocumentsPk pk) throws EmpDocumentsDaoException;

	/** 
	 * Returns the rows from the EMP_DOCUMENTS table that matches the specified primary-key value.
	 */
	public EmpDocuments findByPrimaryKey(EmpDocumentsPk pk) throws EmpDocumentsDaoException;

	/** 
	 * Returns all rows from the EMP_DOCUMENTS table that match the criteria 'EMP_DOCUMENT_ID = :empDocumentId'.
	 */
	public EmpDocuments findByPrimaryKey(int empDocumentId) throws EmpDocumentsDaoException;

	/** 
	 * Returns all rows from the EMP_DOCUMENTS table that match the criteria ''.
	 */
	public EmpDocuments[] findAll() throws EmpDocumentsDaoException;

	/** 
	 * Returns all rows from the EMP_DOCUMENTS table that match the criteria 'DOCUMENT_ID = :documentId'.
	 */
	public EmpDocuments[] findByDocuments(int documentId) throws EmpDocumentsDaoException;

	/** 
	 * Returns all rows from the EMP_DOCUMENTS table that match the criteria 'EMPLOYEE_ID = :employeeId'.
	 */
	public EmpDocuments[] findByEmployees(int employeeId) throws EmpDocumentsDaoException;

	/** 
	 * Returns all rows from the EMP_DOCUMENTS table that match the criteria 'EMP_DOCUMENT_ID = :empDocumentId'.
	 */
	public EmpDocuments[] findWhereEmpDocumentIdEquals(int empDocumentId) throws EmpDocumentsDaoException;

	/** 
	 * Returns all rows from the EMP_DOCUMENTS table that match the criteria 'EMPLOYEE_ID = :employeeId'.
	 */
	public EmpDocuments[] findWhereEmployeeIdEquals(int employeeId) throws EmpDocumentsDaoException;

	/** 
	 * Returns all rows from the EMP_DOCUMENTS table that match the criteria 'DOCUMENT_ID = :documentId'.
	 */
	public EmpDocuments[] findWhereDocumentIdEquals(int documentId) throws EmpDocumentsDaoException;

	/** 
	 * Returns all rows from the EMP_DOCUMENTS table that match the criteria 'DOUCUMENT_IMAGE = :doucumentImage'.
	 */
	public EmpDocuments[] findWhereDoucumentImageEquals(byte[] doucumentImage) throws EmpDocumentsDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the EMP_DOCUMENTS table that match the specified arbitrary SQL statement
	 */
	public EmpDocuments[] findByDynamicSelect(String sql, Object[] sqlParams) throws EmpDocumentsDaoException;

	/** 
	 * Returns all rows from the EMP_DOCUMENTS table that match the specified arbitrary SQL statement
	 */
	public EmpDocuments[] findByDynamicWhere(String sql, Object[] sqlParams) throws EmpDocumentsDaoException;

}
