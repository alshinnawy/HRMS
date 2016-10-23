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

public class DriversModeratorsLinesDaoImpl extends AbstractDAO implements DriversModeratorsLinesDao
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
	protected final String SQL_SELECT = "SELECT DRIVER_MODERATOR_LINE_ID, DRIVER_ID, BUS_LINE_ID, MODERATOR_EMP_ID FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( DRIVER_MODERATOR_LINE_ID, DRIVER_ID, BUS_LINE_ID, MODERATOR_EMP_ID ) VALUES ( ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET DRIVER_MODERATOR_LINE_ID = ?, DRIVER_ID = ?, BUS_LINE_ID = ?, MODERATOR_EMP_ID = ? WHERE DRIVER_MODERATOR_LINE_ID = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE DRIVER_MODERATOR_LINE_ID = ?";

	/** 
	 * Index of column DRIVER_MODERATOR_LINE_ID
	 */
	protected static final int COLUMN_DRIVER_MODERATOR_LINE_ID = 1;

	/** 
	 * Index of column DRIVER_ID
	 */
	protected static final int COLUMN_DRIVER_ID = 2;

	/** 
	 * Index of column BUS_LINE_ID
	 */
	protected static final int COLUMN_BUS_LINE_ID = 3;

	/** 
	 * Index of column MODERATOR_EMP_ID
	 */
	protected static final int COLUMN_MODERATOR_EMP_ID = 4;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 4;

	/** 
	 * Index of primary-key column DRIVER_MODERATOR_LINE_ID
	 */
	protected static final int PK_COLUMN_DRIVER_MODERATOR_LINE_ID = 1;

	/** 
	 * Inserts a new row in the DRIVERS_MODERATORS_LINES table.
	 */
	public DriversModeratorsLinesPk insert(DriversModeratorsLines dto) throws DriversModeratorsLinesDaoException
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
			stmt.setInt( index++, dto.getDriverModeratorLineId() );
			stmt.setInt( index++, dto.getDriverId() );
			stmt.setInt( index++, dto.getBusLineId() );
			if (dto.isModeratorEmpIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getModeratorEmpId() );
			}
		
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DriversModeratorsLinesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the DRIVERS_MODERATORS_LINES table.
	 */
	public void update(DriversModeratorsLinesPk pk, DriversModeratorsLines dto) throws DriversModeratorsLinesDaoException
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
			stmt.setInt( index++, dto.getDriverModeratorLineId() );
			stmt.setInt( index++, dto.getDriverId() );
			stmt.setInt( index++, dto.getBusLineId() );
			if (dto.isModeratorEmpIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getModeratorEmpId() );
			}
		
			stmt.setInt( 5, pk.getDriverModeratorLineId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DriversModeratorsLinesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the DRIVERS_MODERATORS_LINES table.
	 */
	public void delete(DriversModeratorsLinesPk pk) throws DriversModeratorsLinesDaoException
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
			stmt.setInt( 1, pk.getDriverModeratorLineId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DriversModeratorsLinesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the DRIVERS_MODERATORS_LINES table that matches the specified primary-key value.
	 */
	public DriversModeratorsLines findByPrimaryKey(DriversModeratorsLinesPk pk) throws DriversModeratorsLinesDaoException
	{
		return findByPrimaryKey( pk.getDriverModeratorLineId() );
	}

	/** 
	 * Returns all rows from the DRIVERS_MODERATORS_LINES table that match the criteria 'DRIVER_MODERATOR_LINE_ID = :driverModeratorLineId'.
	 */
	public DriversModeratorsLines findByPrimaryKey(int driverModeratorLineId) throws DriversModeratorsLinesDaoException
	{
		DriversModeratorsLines ret[] = findByDynamicSelect( SQL_SELECT + " WHERE DRIVER_MODERATOR_LINE_ID = ?", new Object[] {  new Integer(driverModeratorLineId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the DRIVERS_MODERATORS_LINES table that match the criteria ''.
	 */
	public DriversModeratorsLines[] findAll() throws DriversModeratorsLinesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY DRIVER_MODERATOR_LINE_ID", null );
	}

	/** 
	 * Returns all rows from the DRIVERS_MODERATORS_LINES table that match the criteria 'BUS_LINE_ID = :busLineId'.
	 */
	public DriversModeratorsLines[] findByBusLines(int busLineId) throws DriversModeratorsLinesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE BUS_LINE_ID = ?", new Object[] {  new Integer(busLineId) } );
	}

	/** 
	 * Returns all rows from the DRIVERS_MODERATORS_LINES table that match the criteria 'DRIVER_ID = :driverId'.
	 */
	public DriversModeratorsLines[] findByEmployees(int driverId) throws DriversModeratorsLinesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DRIVER_ID = ?", new Object[] {  new Integer(driverId) } );
	}

	/** 
	 * Returns all rows from the DRIVERS_MODERATORS_LINES table that match the criteria 'MODERATOR_EMP_ID = :moderatorEmpId'.
	 */
	public DriversModeratorsLines[] findByEmployees2(int moderatorEmpId) throws DriversModeratorsLinesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MODERATOR_EMP_ID = ?", new Object[] {  new Integer(moderatorEmpId) } );
	}

	/** 
	 * Returns all rows from the DRIVERS_MODERATORS_LINES table that match the criteria 'DRIVER_MODERATOR_LINE_ID = :driverModeratorLineId'.
	 */
	public DriversModeratorsLines[] findWhereDriverModeratorLineIdEquals(int driverModeratorLineId) throws DriversModeratorsLinesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DRIVER_MODERATOR_LINE_ID = ? ORDER BY DRIVER_MODERATOR_LINE_ID", new Object[] {  new Integer(driverModeratorLineId) } );
	}

	/** 
	 * Returns all rows from the DRIVERS_MODERATORS_LINES table that match the criteria 'DRIVER_ID = :driverId'.
	 */
	public DriversModeratorsLines[] findWhereDriverIdEquals(int driverId) throws DriversModeratorsLinesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DRIVER_ID = ? ORDER BY DRIVER_ID", new Object[] {  new Integer(driverId) } );
	}

	/** 
	 * Returns all rows from the DRIVERS_MODERATORS_LINES table that match the criteria 'BUS_LINE_ID = :busLineId'.
	 */
	public DriversModeratorsLines[] findWhereBusLineIdEquals(int busLineId) throws DriversModeratorsLinesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE BUS_LINE_ID = ? ORDER BY BUS_LINE_ID", new Object[] {  new Integer(busLineId) } );
	}

	/** 
	 * Returns all rows from the DRIVERS_MODERATORS_LINES table that match the criteria 'MODERATOR_EMP_ID = :moderatorEmpId'.
	 */
	public DriversModeratorsLines[] findWhereModeratorEmpIdEquals(int moderatorEmpId) throws DriversModeratorsLinesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MODERATOR_EMP_ID = ? ORDER BY MODERATOR_EMP_ID", new Object[] {  new Integer(moderatorEmpId) } );
	}

	/**
	 * Method 'DriversModeratorsLinesDaoImpl'
	 * 
	 */
	public DriversModeratorsLinesDaoImpl()
	{
	}

	/**
	 * Method 'DriversModeratorsLinesDaoImpl'
	 * 
	 * @param userConn
	 */
	public DriversModeratorsLinesDaoImpl(final java.sql.Connection userConn)
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
		return "HRMS.DRIVERS_MODERATORS_LINES";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected DriversModeratorsLines fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			DriversModeratorsLines dto = new DriversModeratorsLines();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected DriversModeratorsLines[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			DriversModeratorsLines dto = new DriversModeratorsLines();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		DriversModeratorsLines ret[] = new DriversModeratorsLines[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(DriversModeratorsLines dto, ResultSet rs) throws SQLException
	{
		dto.setDriverModeratorLineId( rs.getInt( COLUMN_DRIVER_MODERATOR_LINE_ID ) );
		dto.setDriverId( rs.getInt( COLUMN_DRIVER_ID ) );
		dto.setBusLineId( rs.getInt( COLUMN_BUS_LINE_ID ) );
		dto.setModeratorEmpId( rs.getInt( COLUMN_MODERATOR_EMP_ID ) );
		if (rs.wasNull()) {
			dto.setModeratorEmpIdNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(DriversModeratorsLines dto)
	{
	}

	/** 
	 * Returns all rows from the DRIVERS_MODERATORS_LINES table that match the specified arbitrary SQL statement
	 */
	public DriversModeratorsLines[] findByDynamicSelect(String sql, Object[] sqlParams) throws DriversModeratorsLinesDaoException
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
			throw new DriversModeratorsLinesDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the DRIVERS_MODERATORS_LINES table that match the specified arbitrary SQL statement
	 */
	public DriversModeratorsLines[] findByDynamicWhere(String sql, Object[] sqlParams) throws DriversModeratorsLinesDaoException
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
			throw new DriversModeratorsLinesDaoException( "Exception: " + _e.getMessage(), _e );
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