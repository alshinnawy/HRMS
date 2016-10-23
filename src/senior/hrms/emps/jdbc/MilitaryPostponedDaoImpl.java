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

public class MilitaryPostponedDaoImpl extends AbstractDAO implements MilitaryPostponedDao
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
	protected final String SQL_SELECT = "SELECT MIL_POSTPONED_ID, EMPLOYEE_ID, POSTPONED_DATE, MILITARY_REPORT_IMAGE, MILITARY_POSTPONED_NOTE FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( MIL_POSTPONED_ID, EMPLOYEE_ID, POSTPONED_DATE, MILITARY_REPORT_IMAGE, MILITARY_POSTPONED_NOTE ) VALUES ( ?, ?, ?, EMPTY_BLOB(), ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET MIL_POSTPONED_ID = ?, EMPLOYEE_ID = ?, POSTPONED_DATE = ?, MILITARY_REPORT_IMAGE = EMPTY_BLOB(), MILITARY_POSTPONED_NOTE = ? WHERE MIL_POSTPONED_ID = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE MIL_POSTPONED_ID = ?";

	/** 
	 * Index of column MIL_POSTPONED_ID
	 */
	protected static final int COLUMN_MIL_POSTPONED_ID = 1;

	/** 
	 * Index of column EMPLOYEE_ID
	 */
	protected static final int COLUMN_EMPLOYEE_ID = 2;

	/** 
	 * Index of column POSTPONED_DATE
	 */
	protected static final int COLUMN_POSTPONED_DATE = 3;

	/** 
	 * Index of column MILITARY_REPORT_IMAGE
	 */
	protected static final int COLUMN_MILITARY_REPORT_IMAGE = 4;

	/** 
	 * Index of column MILITARY_POSTPONED_NOTE
	 */
	protected static final int COLUMN_MILITARY_POSTPONED_NOTE = 5;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 5;

	/** 
	 * Index of primary-key column MIL_POSTPONED_ID
	 */
	protected static final int PK_COLUMN_MIL_POSTPONED_ID = 1;

	/** 
	 * Inserts a new row in the MILITARY_POSTPONED table.
	 */
	public MilitaryPostponedPk insert(MilitaryPostponed dto) throws MilitaryPostponedDaoException
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
			stmt.setInt( index++, dto.getMilPostponedId() );
			stmt.setInt( index++, dto.getEmployeeId() );
			stmt.setTimestamp(index++, dto.getPostponedDate()==null ? null : new java.sql.Timestamp( dto.getPostponedDate().getTime() ) );
			// no need to bind value for LOB column
			stmt.setString( index++, dto.getMilitaryPostponedNote() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MilitaryPostponedDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the MILITARY_POSTPONED table.
	 */
	public void update(MilitaryPostponedPk pk, MilitaryPostponed dto) throws MilitaryPostponedDaoException
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
			stmt.setInt( index++, dto.getMilPostponedId() );
			stmt.setInt( index++, dto.getEmployeeId() );
			stmt.setTimestamp(index++, dto.getPostponedDate()==null ? null : new java.sql.Timestamp( dto.getPostponedDate().getTime() ) );
			// no need to bind value for LOB column
			stmt.setString( index++, dto.getMilitaryPostponedNote() );
			stmt.setInt( 5, pk.getMilPostponedId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MilitaryPostponedDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the MILITARY_POSTPONED table.
	 */
	public void delete(MilitaryPostponedPk pk) throws MilitaryPostponedDaoException
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
			stmt.setInt( 1, pk.getMilPostponedId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MilitaryPostponedDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the MILITARY_POSTPONED table that matches the specified primary-key value.
	 */
	public MilitaryPostponed findByPrimaryKey(MilitaryPostponedPk pk) throws MilitaryPostponedDaoException
	{
		return findByPrimaryKey( pk.getMilPostponedId() );
	}

	/** 
	 * Returns all rows from the MILITARY_POSTPONED table that match the criteria 'MIL_POSTPONED_ID = :milPostponedId'.
	 */
	public MilitaryPostponed findByPrimaryKey(int milPostponedId) throws MilitaryPostponedDaoException
	{
		MilitaryPostponed ret[] = findByDynamicSelect( SQL_SELECT + " WHERE MIL_POSTPONED_ID = ?", new Object[] {  new Integer(milPostponedId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the MILITARY_POSTPONED table that match the criteria ''.
	 */
	public MilitaryPostponed[] findAll() throws MilitaryPostponedDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY MIL_POSTPONED_ID", null );
	}

	/** 
	 * Returns all rows from the MILITARY_POSTPONED table that match the criteria 'EMPLOYEE_ID = :employeeId'.
	 */
	public MilitaryPostponed[] findByEmployees(int employeeId) throws MilitaryPostponedDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE EMPLOYEE_ID = ?", new Object[] {  new Integer(employeeId) } );
	}

	/** 
	 * Returns all rows from the MILITARY_POSTPONED table that match the criteria 'MIL_POSTPONED_ID = :milPostponedId'.
	 */
	public MilitaryPostponed[] findWhereMilPostponedIdEquals(int milPostponedId) throws MilitaryPostponedDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MIL_POSTPONED_ID = ? ORDER BY MIL_POSTPONED_ID", new Object[] {  new Integer(milPostponedId) } );
	}

	/** 
	 * Returns all rows from the MILITARY_POSTPONED table that match the criteria 'EMPLOYEE_ID = :employeeId'.
	 */
	public MilitaryPostponed[] findWhereEmployeeIdEquals(int employeeId) throws MilitaryPostponedDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE EMPLOYEE_ID = ? ORDER BY EMPLOYEE_ID", new Object[] {  new Integer(employeeId) } );
	}

	/** 
	 * Returns all rows from the MILITARY_POSTPONED table that match the criteria 'POSTPONED_DATE = :postponedDate'.
	 */
	public MilitaryPostponed[] findWherePostponedDateEquals(Date postponedDate) throws MilitaryPostponedDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE POSTPONED_DATE = ? ORDER BY POSTPONED_DATE", new Object[] { postponedDate==null ? null : new java.sql.Timestamp( postponedDate.getTime() ) } );
	}

	/** 
	 * Returns all rows from the MILITARY_POSTPONED table that match the criteria 'MILITARY_REPORT_IMAGE = :militaryReportImage'.
	 */
	public MilitaryPostponed[] findWhereMilitaryReportImageEquals(byte[] militaryReportImage) throws MilitaryPostponedDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MILITARY_REPORT_IMAGE = ? ORDER BY MILITARY_REPORT_IMAGE", new Object[] { militaryReportImage } );
	}

	/** 
	 * Returns all rows from the MILITARY_POSTPONED table that match the criteria 'MILITARY_POSTPONED_NOTE = :militaryPostponedNote'.
	 */
	public MilitaryPostponed[] findWhereMilitaryPostponedNoteEquals(String militaryPostponedNote) throws MilitaryPostponedDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MILITARY_POSTPONED_NOTE = ? ORDER BY MILITARY_POSTPONED_NOTE", new Object[] { militaryPostponedNote } );
	}

	/**
	 * Method 'MilitaryPostponedDaoImpl'
	 * 
	 */
	public MilitaryPostponedDaoImpl()
	{
	}

	/**
	 * Method 'MilitaryPostponedDaoImpl'
	 * 
	 * @param userConn
	 */
	public MilitaryPostponedDaoImpl(final java.sql.Connection userConn)
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
		return "HRMS.MILITARY_POSTPONED";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected MilitaryPostponed fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			MilitaryPostponed dto = new MilitaryPostponed();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected MilitaryPostponed[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			MilitaryPostponed dto = new MilitaryPostponed();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		MilitaryPostponed ret[] = new MilitaryPostponed[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(MilitaryPostponed dto, ResultSet rs) throws SQLException
	{
		dto.setMilPostponedId( rs.getInt( COLUMN_MIL_POSTPONED_ID ) );
		dto.setEmployeeId( rs.getInt( COLUMN_EMPLOYEE_ID ) );
		dto.setPostponedDate( rs.getTimestamp(COLUMN_POSTPONED_DATE ) );
		dto.setMilitaryReportImage( super.getBlobColumn(rs, COLUMN_MILITARY_REPORT_IMAGE ) );
		dto.setMilitaryPostponedNote( rs.getString( COLUMN_MILITARY_POSTPONED_NOTE ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(MilitaryPostponed dto)
	{
	}

	/** 
	 * Returns all rows from the MILITARY_POSTPONED table that match the specified arbitrary SQL statement
	 */
	public MilitaryPostponed[] findByDynamicSelect(String sql, Object[] sqlParams) throws MilitaryPostponedDaoException
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
			throw new MilitaryPostponedDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the MILITARY_POSTPONED table that match the specified arbitrary SQL statement
	 */
	public MilitaryPostponed[] findByDynamicWhere(String sql, Object[] sqlParams) throws MilitaryPostponedDaoException
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
			throw new MilitaryPostponedDaoException( "Exception: " + _e.getMessage(), _e );
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