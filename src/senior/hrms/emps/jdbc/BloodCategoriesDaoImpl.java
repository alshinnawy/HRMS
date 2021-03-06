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

public class BloodCategoriesDaoImpl extends AbstractDAO implements BloodCategoriesDao
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
	protected final String SQL_SELECT = "SELECT BLOOD_CATEGORY_ID, BLOOD_CATEGORIES_NAME FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( BLOOD_CATEGORY_ID, BLOOD_CATEGORIES_NAME ) VALUES ( ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET BLOOD_CATEGORY_ID = ?, BLOOD_CATEGORIES_NAME = ? WHERE BLOOD_CATEGORY_ID = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE BLOOD_CATEGORY_ID = ?";

	/** 
	 * Index of column BLOOD_CATEGORY_ID
	 */
	protected static final int COLUMN_BLOOD_CATEGORY_ID = 1;

	/** 
	 * Index of column BLOOD_CATEGORIES_NAME
	 */
	protected static final int COLUMN_BLOOD_CATEGORIES_NAME = 2;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 2;

	/** 
	 * Index of primary-key column BLOOD_CATEGORY_ID
	 */
	protected static final int PK_COLUMN_BLOOD_CATEGORY_ID = 1;

	/** 
	 * Inserts a new row in the BLOOD_CATEGORIES table.
	 */
	public BloodCategoriesPk insert(BloodCategories dto) throws BloodCategoriesDaoException
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
			stmt.setInt( index++, dto.getBloodCategoryId() );
			stmt.setString( index++, dto.getBloodCategoriesName() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new BloodCategoriesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the BLOOD_CATEGORIES table.
	 */
	public void update(BloodCategoriesPk pk, BloodCategories dto) throws BloodCategoriesDaoException
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
			stmt.setInt( index++, dto.getBloodCategoryId() );
			stmt.setString( index++, dto.getBloodCategoriesName() );
			stmt.setInt( 3, pk.getBloodCategoryId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new BloodCategoriesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the BLOOD_CATEGORIES table.
	 */
	public void delete(BloodCategoriesPk pk) throws BloodCategoriesDaoException
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
			stmt.setInt( 1, pk.getBloodCategoryId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new BloodCategoriesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the BLOOD_CATEGORIES table that matches the specified primary-key value.
	 */
	public BloodCategories findByPrimaryKey(BloodCategoriesPk pk) throws BloodCategoriesDaoException
	{
		return findByPrimaryKey( pk.getBloodCategoryId() );
	}

	/** 
	 * Returns all rows from the BLOOD_CATEGORIES table that match the criteria 'BLOOD_CATEGORY_ID = :bloodCategoryId'.
	 */
	public BloodCategories findByPrimaryKey(int bloodCategoryId) throws BloodCategoriesDaoException
	{
		BloodCategories ret[] = findByDynamicSelect( SQL_SELECT + " WHERE BLOOD_CATEGORY_ID = ?", new Object[] {  new Integer(bloodCategoryId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the BLOOD_CATEGORIES table that match the criteria ''.
	 */
	public BloodCategories[] findAll() throws BloodCategoriesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY BLOOD_CATEGORY_ID", null );
	}

	/** 
	 * Returns all rows from the BLOOD_CATEGORIES table that match the criteria 'BLOOD_CATEGORY_ID = :bloodCategoryId'.
	 */
	public BloodCategories[] findWhereBloodCategoryIdEquals(int bloodCategoryId) throws BloodCategoriesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE BLOOD_CATEGORY_ID = ? ORDER BY BLOOD_CATEGORY_ID", new Object[] {  new Integer(bloodCategoryId) } );
	}

	/** 
	 * Returns all rows from the BLOOD_CATEGORIES table that match the criteria 'BLOOD_CATEGORIES_NAME = :bloodCategoriesName'.
	 */
	public BloodCategories[] findWhereBloodCategoriesNameEquals(String bloodCategoriesName) throws BloodCategoriesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE BLOOD_CATEGORIES_NAME = ? ORDER BY BLOOD_CATEGORIES_NAME", new Object[] { bloodCategoriesName } );
	}

	/**
	 * Method 'BloodCategoriesDaoImpl'
	 * 
	 */
	public BloodCategoriesDaoImpl()
	{
	}

	/**
	 * Method 'BloodCategoriesDaoImpl'
	 * 
	 * @param userConn
	 */
	public BloodCategoriesDaoImpl(final java.sql.Connection userConn)
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
		return "HRMS.BLOOD_CATEGORIES";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected BloodCategories fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			BloodCategories dto = new BloodCategories();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected BloodCategories[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			BloodCategories dto = new BloodCategories();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		BloodCategories ret[] = new BloodCategories[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(BloodCategories dto, ResultSet rs) throws SQLException
	{
		dto.setBloodCategoryId( rs.getInt( COLUMN_BLOOD_CATEGORY_ID ) );
		dto.setBloodCategoriesName( rs.getString( COLUMN_BLOOD_CATEGORIES_NAME ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(BloodCategories dto)
	{
	}

	/** 
	 * Returns all rows from the BLOOD_CATEGORIES table that match the specified arbitrary SQL statement
	 */
	public BloodCategories[] findByDynamicSelect(String sql, Object[] sqlParams) throws BloodCategoriesDaoException
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
			throw new BloodCategoriesDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the BLOOD_CATEGORIES table that match the specified arbitrary SQL statement
	 */
	public BloodCategories[] findByDynamicWhere(String sql, Object[] sqlParams) throws BloodCategoriesDaoException
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
			throw new BloodCategoriesDaoException( "Exception: " + _e.getMessage(), _e );
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
