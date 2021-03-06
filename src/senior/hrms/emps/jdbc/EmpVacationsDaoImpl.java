/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package senior.hrms.emps.jdbc;

import senior.hrms.emps.dao.*;
import senior.hrms.emps.factory.*;
import java.util.Date;
import senior.hrms.emps.dto.*;
import senior.hrms.emps.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class EmpVacationsDaoImpl extends AbstractDAO implements EmpVacationsDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT EMP_VACATION_ID, EMPLOYEE_ID, VACATION_TYPE_ID, FINANCIAL_YEAR_ID, DATE_FROM, DATE_TO, REQUEST_EMP_ID, VACATION_REQUEST_STATUS_ID, DECISION_EMP_ID, DECISION_DATE, NOTE FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( EMP_VACATION_ID, EMPLOYEE_ID, VACATION_TYPE_ID, FINANCIAL_YEAR_ID, DATE_FROM, DATE_TO, REQUEST_EMP_ID, VACATION_REQUEST_STATUS_ID, DECISION_EMP_ID, DECISION_DATE, NOTE ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET EMP_VACATION_ID = ?, EMPLOYEE_ID = ?, VACATION_TYPE_ID = ?, FINANCIAL_YEAR_ID = ?, DATE_FROM = ?, DATE_TO = ?, REQUEST_EMP_ID = ?, VACATION_REQUEST_STATUS_ID = ?, DECISION_EMP_ID = ?, DECISION_DATE = ?, NOTE = ? WHERE EMP_VACATION_ID = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE EMP_VACATION_ID = ?";

	/** 
	 * Index of column EMP_VACATION_ID
	 */
	protected static final int COLUMN_EMP_VACATION_ID = 1;

	/** 
	 * Index of column EMPLOYEE_ID
	 */
	protected static final int COLUMN_EMPLOYEE_ID = 2;

	/** 
	 * Index of column VACATION_TYPE_ID
	 */
	protected static final int COLUMN_VACATION_TYPE_ID = 3;

	/** 
	 * Index of column FINANCIAL_YEAR_ID
	 */
	protected static final int COLUMN_FINANCIAL_YEAR_ID = 4;

	/** 
	 * Index of column DATE_FROM
	 */
	protected static final int COLUMN_DATE_FROM = 5;

	/** 
	 * Index of column DATE_TO
	 */
	protected static final int COLUMN_DATE_TO = 6;

	/** 
	 * Index of column REQUEST_EMP_ID
	 */
	protected static final int COLUMN_REQUEST_EMP_ID = 7;

	/** 
	 * Index of column VACATION_REQUEST_STATUS_ID
	 */
	protected static final int COLUMN_VACATION_REQUEST_STATUS_ID = 8;

	/** 
	 * Index of column DECISION_EMP_ID
	 */
	protected static final int COLUMN_DECISION_EMP_ID = 9;

	/** 
	 * Index of column DECISION_DATE
	 */
	protected static final int COLUMN_DECISION_DATE = 10;

	/** 
	 * Index of column NOTE
	 */
	protected static final int COLUMN_NOTE = 11;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 11;

	/** 
	 * Index of primary-key column EMP_VACATION_ID
	 */
	protected static final int PK_COLUMN_EMP_VACATION_ID = 1;

	/** 
	 * Inserts a new row in the EMP_VACATIONS table.
	 */
	public EmpVacationsPk insert(EmpVacations dto) throws EmpVacationsDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			stmt = conn.prepareStatement( SQL_INSERT );
			int index = 1;
			stmt.setLong( index++, dto.getEmpVacationId() );
			stmt.setInt( index++, dto.getEmployeeId() );
			stmt.setInt( index++, dto.getVacationTypeId() );
			stmt.setInt( index++, dto.getFinancialYearId() );
			stmt.setTimestamp(index++, dto.getDateFrom()==null ? null : new java.sql.Timestamp( dto.getDateFrom().getTime() ) );
			stmt.setTimestamp(index++, dto.getDateTo()==null ? null : new java.sql.Timestamp( dto.getDateTo().getTime() ) );
			stmt.setInt( index++, dto.getRequestEmpId() );
			stmt.setInt( index++, dto.getVacationRequestStatusId() );
			if (dto.isDecisionEmpIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getDecisionEmpId() );
			}
		
			stmt.setTimestamp(index++, dto.getDecisionDate()==null ? null : new java.sql.Timestamp( dto.getDecisionDate().getTime() ) );
			stmt.setString( index++, dto.getNote() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new EmpVacationsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the EMP_VACATIONS table.
	 */
	public void update(EmpVacationsPk pk, EmpVacations dto) throws EmpVacationsDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_UPDATE + " with DTO: " + dto );
			stmt = conn.prepareStatement( SQL_UPDATE );
			int index=1;
			stmt.setLong( index++, dto.getEmpVacationId() );
			stmt.setInt( index++, dto.getEmployeeId() );
			stmt.setInt( index++, dto.getVacationTypeId() );
			stmt.setInt( index++, dto.getFinancialYearId() );
			stmt.setTimestamp(index++, dto.getDateFrom()==null ? null : new java.sql.Timestamp( dto.getDateFrom().getTime() ) );
			stmt.setTimestamp(index++, dto.getDateTo()==null ? null : new java.sql.Timestamp( dto.getDateTo().getTime() ) );
			stmt.setInt( index++, dto.getRequestEmpId() );
			stmt.setInt( index++, dto.getVacationRequestStatusId() );
			if (dto.isDecisionEmpIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getDecisionEmpId() );
			}
		
			stmt.setTimestamp(index++, dto.getDecisionDate()==null ? null : new java.sql.Timestamp( dto.getDecisionDate().getTime() ) );
			stmt.setString( index++, dto.getNote() );
			stmt.setLong( 12, pk.getEmpVacationId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new EmpVacationsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the EMP_VACATIONS table.
	 */
	public void delete(EmpVacationsPk pk) throws EmpVacationsDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setLong( 1, pk.getEmpVacationId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new EmpVacationsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the EMP_VACATIONS table that matches the specified primary-key value.
	 */
	public EmpVacations findByPrimaryKey(EmpVacationsPk pk) throws EmpVacationsDaoException
	{
		return findByPrimaryKey( pk.getEmpVacationId() );
	}

	/** 
	 * Returns all rows from the EMP_VACATIONS table that match the criteria 'EMP_VACATION_ID = :empVacationId'.
	 */
	public EmpVacations findByPrimaryKey(long empVacationId) throws EmpVacationsDaoException
	{
		EmpVacations ret[] = findByDynamicSelect( SQL_SELECT + " WHERE EMP_VACATION_ID = ?", new Object[] {  new Long(empVacationId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the EMP_VACATIONS table that match the criteria ''.
	 */
	public EmpVacations[] findAll() throws EmpVacationsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY EMP_VACATION_ID", null );
	}

	/** 
	 * Returns all rows from the EMP_VACATIONS table that match the criteria 'REQUEST_EMP_ID = :requestEmpId'.
	 */
	public EmpVacations[] findByEmployees(int requestEmpId) throws EmpVacationsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE REQUEST_EMP_ID = ?", new Object[] {  new Integer(requestEmpId) } );
	}

	/** 
	 * Returns all rows from the EMP_VACATIONS table that match the criteria 'EMPLOYEE_ID = :employeeId'.
	 */
	public EmpVacations[] findByEmployees2(int employeeId) throws EmpVacationsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE EMPLOYEE_ID = ?", new Object[] {  new Integer(employeeId) } );
	}

	/** 
	 * Returns all rows from the EMP_VACATIONS table that match the criteria 'DECISION_EMP_ID = :decisionEmpId'.
	 */
	public EmpVacations[] findByEmployees3(int decisionEmpId) throws EmpVacationsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DECISION_EMP_ID = ?", new Object[] {  new Integer(decisionEmpId) } );
	}

	/** 
	 * Returns all rows from the EMP_VACATIONS table that match the criteria 'FINANCIAL_YEAR_ID = :financialYearId'.
	 */
	public EmpVacations[] findByFinancialYears(int financialYearId) throws EmpVacationsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FINANCIAL_YEAR_ID = ?", new Object[] {  new Integer(financialYearId) } );
	}

	/** 
	 * Returns all rows from the EMP_VACATIONS table that match the criteria 'VACATION_TYPE_ID = :vacationTypeId'.
	 */
	public EmpVacations[] findByVacationsTypes(int vacationTypeId) throws EmpVacationsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE VACATION_TYPE_ID = ?", new Object[] {  new Integer(vacationTypeId) } );
	}

	/** 
	 * Returns all rows from the EMP_VACATIONS table that match the criteria 'VACATION_REQUEST_STATUS_ID = :vacationRequestStatusId'.
	 */
	public EmpVacations[] findByVacationRequestStatus(int vacationRequestStatusId) throws EmpVacationsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE VACATION_REQUEST_STATUS_ID = ?", new Object[] {  new Integer(vacationRequestStatusId) } );
	}

	/** 
	 * Returns all rows from the EMP_VACATIONS table that match the criteria 'EMP_VACATION_ID = :empVacationId'.
	 */
	public EmpVacations[] findWhereEmpVacationIdEquals(long empVacationId) throws EmpVacationsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE EMP_VACATION_ID = ? ORDER BY EMP_VACATION_ID", new Object[] {  new Long(empVacationId) } );
	}

	/** 
	 * Returns all rows from the EMP_VACATIONS table that match the criteria 'EMPLOYEE_ID = :employeeId'.
	 */
	public EmpVacations[] findWhereEmployeeIdEquals(int employeeId) throws EmpVacationsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE EMPLOYEE_ID = ? ORDER BY EMPLOYEE_ID", new Object[] {  new Integer(employeeId) } );
	}

	/** 
	 * Returns all rows from the EMP_VACATIONS table that match the criteria 'VACATION_TYPE_ID = :vacationTypeId'.
	 */
	public EmpVacations[] findWhereVacationTypeIdEquals(int vacationTypeId) throws EmpVacationsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE VACATION_TYPE_ID = ? ORDER BY VACATION_TYPE_ID", new Object[] {  new Integer(vacationTypeId) } );
	}

	/** 
	 * Returns all rows from the EMP_VACATIONS table that match the criteria 'FINANCIAL_YEAR_ID = :financialYearId'.
	 */
	public EmpVacations[] findWhereFinancialYearIdEquals(int financialYearId) throws EmpVacationsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FINANCIAL_YEAR_ID = ? ORDER BY FINANCIAL_YEAR_ID", new Object[] {  new Integer(financialYearId) } );
	}

	/** 
	 * Returns all rows from the EMP_VACATIONS table that match the criteria 'DATE_FROM = :dateFrom'.
	 */
	public EmpVacations[] findWhereDateFromEquals(Date dateFrom) throws EmpVacationsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DATE_FROM = ? ORDER BY DATE_FROM", new Object[] { dateFrom==null ? null : new java.sql.Timestamp( dateFrom.getTime() ) } );
	}

	/** 
	 * Returns all rows from the EMP_VACATIONS table that match the criteria 'DATE_TO = :dateTo'.
	 */
	public EmpVacations[] findWhereDateToEquals(Date dateTo) throws EmpVacationsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DATE_TO = ? ORDER BY DATE_TO", new Object[] { dateTo==null ? null : new java.sql.Timestamp( dateTo.getTime() ) } );
	}

	/** 
	 * Returns all rows from the EMP_VACATIONS table that match the criteria 'REQUEST_EMP_ID = :requestEmpId'.
	 */
	public EmpVacations[] findWhereRequestEmpIdEquals(int requestEmpId) throws EmpVacationsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE REQUEST_EMP_ID = ? ORDER BY REQUEST_EMP_ID", new Object[] {  new Integer(requestEmpId) } );
	}

	/** 
	 * Returns all rows from the EMP_VACATIONS table that match the criteria 'VACATION_REQUEST_STATUS_ID = :vacationRequestStatusId'.
	 */
	public EmpVacations[] findWhereVacationRequestStatusIdEquals(int vacationRequestStatusId) throws EmpVacationsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE VACATION_REQUEST_STATUS_ID = ? ORDER BY VACATION_REQUEST_STATUS_ID", new Object[] {  new Integer(vacationRequestStatusId) } );
	}

	/** 
	 * Returns all rows from the EMP_VACATIONS table that match the criteria 'DECISION_EMP_ID = :decisionEmpId'.
	 */
	public EmpVacations[] findWhereDecisionEmpIdEquals(int decisionEmpId) throws EmpVacationsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DECISION_EMP_ID = ? ORDER BY DECISION_EMP_ID", new Object[] {  new Integer(decisionEmpId) } );
	}

	/** 
	 * Returns all rows from the EMP_VACATIONS table that match the criteria 'DECISION_DATE = :decisionDate'.
	 */
	public EmpVacations[] findWhereDecisionDateEquals(Date decisionDate) throws EmpVacationsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DECISION_DATE = ? ORDER BY DECISION_DATE", new Object[] { decisionDate==null ? null : new java.sql.Timestamp( decisionDate.getTime() ) } );
	}

	/** 
	 * Returns all rows from the EMP_VACATIONS table that match the criteria 'NOTE = :note'.
	 */
	public EmpVacations[] findWhereNoteEquals(String note) throws EmpVacationsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NOTE = ? ORDER BY NOTE", new Object[] { note } );
	}

	/**
	 * Method 'EmpVacationsDaoImpl'
	 * 
	 */
	public EmpVacationsDaoImpl()
	{
	}

	/**
	 * Method 'EmpVacationsDaoImpl'
	 * 
	 * @param userConn
	 */
	public EmpVacationsDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "HRMS.EMP_VACATIONS";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected EmpVacations fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			EmpVacations dto = new EmpVacations();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected EmpVacations[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			EmpVacations dto = new EmpVacations();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		EmpVacations ret[] = new EmpVacations[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(EmpVacations dto, ResultSet rs) throws SQLException
	{
		dto.setEmpVacationId( rs.getLong( COLUMN_EMP_VACATION_ID ) );
		dto.setEmployeeId( rs.getInt( COLUMN_EMPLOYEE_ID ) );
		dto.setVacationTypeId( rs.getInt( COLUMN_VACATION_TYPE_ID ) );
		dto.setFinancialYearId( rs.getInt( COLUMN_FINANCIAL_YEAR_ID ) );
		dto.setDateFrom( rs.getTimestamp(COLUMN_DATE_FROM ) );
		dto.setDateTo( rs.getTimestamp(COLUMN_DATE_TO ) );
		dto.setRequestEmpId( rs.getInt( COLUMN_REQUEST_EMP_ID ) );
		dto.setVacationRequestStatusId( rs.getInt( COLUMN_VACATION_REQUEST_STATUS_ID ) );
		dto.setDecisionEmpId( rs.getInt( COLUMN_DECISION_EMP_ID ) );
		if (rs.wasNull()) {
			dto.setDecisionEmpIdNull( true );
		}
		
		dto.setDecisionDate( rs.getTimestamp(COLUMN_DECISION_DATE ) );
		dto.setNote( rs.getString( COLUMN_NOTE ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(EmpVacations dto)
	{
	}

	/** 
	 * Returns all rows from the EMP_VACATIONS table that match the specified arbitrary SQL statement
	 */
	public EmpVacations[] findByDynamicSelect(String sql, Object[] sqlParams) throws EmpVacationsDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new EmpVacationsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the EMP_VACATIONS table that match the specified arbitrary SQL statement
	 */
	public EmpVacations[] findByDynamicWhere(String sql, Object[] sqlParams) throws EmpVacationsDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new EmpVacationsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}
