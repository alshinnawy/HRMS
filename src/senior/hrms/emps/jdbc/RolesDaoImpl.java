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

public class RolesDaoImpl extends AbstractDAO implements RolesDao
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
	protected final String SQL_SELECT = "SELECT ROLE_ID, ROLE_NAME FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ROLE_ID, ROLE_NAME ) VALUES ( ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ROLE_ID = ?, ROLE_NAME = ? WHERE ROLE_ID = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ROLE_ID = ?";

	/** 
	 * Index of column ROLE_ID
	 */
	protected static final int COLUMN_ROLE_ID = 1;

	/** 
	 * Index of column ROLE_NAME
	 */
	protected static final int COLUMN_ROLE_NAME = 2;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 2;

	/** 
	 * Index of primary-key column ROLE_ID
	 */
	protected static final int PK_COLUMN_ROLE_ID = 1;

	/** 
	 * Inserts a new row in the ROLES table.
	 */
	public RolesPk insert(Roles dto) throws RolesDaoException
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
			stmt.setInt( index++, dto.getRoleId() );
			stmt.setString( index++, dto.getRoleName() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new RolesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the ROLES table.
	 */
	public void update(RolesPk pk, Roles dto) throws RolesDaoException
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
			stmt.setInt( index++, dto.getRoleId() );
			stmt.setString( index++, dto.getRoleName() );
			stmt.setInt( 3, pk.getRoleId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new RolesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the ROLES table.
	 */
	public void delete(RolesPk pk) throws RolesDaoException
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
			stmt.setInt( 1, pk.getRoleId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new RolesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the ROLES table that matches the specified primary-key value.
	 */
	public Roles findByPrimaryKey(RolesPk pk) throws RolesDaoException
	{
		return findByPrimaryKey( pk.getRoleId() );
	}

	/** 
	 * Returns all rows from the ROLES table that match the criteria 'ROLE_ID = :roleId'.
	 */
	public Roles findByPrimaryKey(int roleId) throws RolesDaoException
	{
		Roles ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ROLE_ID = ?", new Object[] {  new Integer(roleId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the ROLES table that match the criteria ''.
	 */
	public Roles[] findAll() throws RolesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ROLE_ID", null );
	}

	/** 
	 * Returns all rows from the ROLES table that match the criteria 'ROLE_ID = :roleId'.
	 */
	public Roles[] findWhereRoleIdEquals(int roleId) throws RolesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ROLE_ID = ? ORDER BY ROLE_ID", new Object[] {  new Integer(roleId) } );
	}

	/** 
	 * Returns all rows from the ROLES table that match the criteria 'ROLE_NAME = :roleName'.
	 */
	public Roles[] findWhereRoleNameEquals(String roleName) throws RolesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ROLE_NAME = ? ORDER BY ROLE_NAME", new Object[] { roleName } );
	}

	/**
	 * Method 'RolesDaoImpl'
	 * 
	 */
	public RolesDaoImpl()
	{
	}

	/**
	 * Method 'RolesDaoImpl'
	 * 
	 * @param userConn
	 */
	public RolesDaoImpl(final java.sql.Connection userConn)
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
		return "HRMS.ROLES";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Roles fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Roles dto = new Roles();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Roles[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Roles dto = new Roles();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Roles ret[] = new Roles[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Roles dto, ResultSet rs) throws SQLException
	{
		dto.setRoleId( rs.getInt( COLUMN_ROLE_ID ) );
		dto.setRoleName( rs.getString( COLUMN_ROLE_NAME ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Roles dto)
	{
	}

	/** 
	 * Returns all rows from the ROLES table that match the specified arbitrary SQL statement
	 */
	public Roles[] findByDynamicSelect(String sql, Object[] sqlParams) throws RolesDaoException
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
			throw new RolesDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the ROLES table that match the specified arbitrary SQL statement
	 */
	public Roles[] findByDynamicWhere(String sql, Object[] sqlParams) throws RolesDaoException
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
			throw new RolesDaoException( "Exception: " + _e.getMessage(), _e );
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
