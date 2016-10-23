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

public class JobCandidatesDaoImpl extends AbstractDAO implements JobCandidatesDao
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
	protected final String SQL_SELECT = "SELECT CANDIDATE_ID, CANDIDATE_NAME, CANDIDATE_PHONE, CANDIDATE_MOBILE, CANDIDATE_ADDRESS, CANDIDATE_REG_DATE, CANDIDATE_INTERVIEW_DEGREE, JOB_TITLE_ID, CV_FILE, CANDIDATE_IMAGE, CV_DEGREE FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( CANDIDATE_ID, CANDIDATE_NAME, CANDIDATE_PHONE, CANDIDATE_MOBILE, CANDIDATE_ADDRESS, CANDIDATE_REG_DATE, CANDIDATE_INTERVIEW_DEGREE, JOB_TITLE_ID, CV_FILE, CANDIDATE_IMAGE, CV_DEGREE ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, EMPTY_BLOB(), EMPTY_BLOB(), ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET CANDIDATE_ID = ?, CANDIDATE_NAME = ?, CANDIDATE_PHONE = ?, CANDIDATE_MOBILE = ?, CANDIDATE_ADDRESS = ?, CANDIDATE_REG_DATE = ?, CANDIDATE_INTERVIEW_DEGREE = ?, JOB_TITLE_ID = ?, CV_FILE = EMPTY_BLOB(), CANDIDATE_IMAGE = EMPTY_BLOB(), CV_DEGREE = ? WHERE CANDIDATE_ID = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE CANDIDATE_ID = ?";

	/** 
	 * Index of column CANDIDATE_ID
	 */
	protected static final int COLUMN_CANDIDATE_ID = 1;

	/** 
	 * Index of column CANDIDATE_NAME
	 */
	protected static final int COLUMN_CANDIDATE_NAME = 2;

	/** 
	 * Index of column CANDIDATE_PHONE
	 */
	protected static final int COLUMN_CANDIDATE_PHONE = 3;

	/** 
	 * Index of column CANDIDATE_MOBILE
	 */
	protected static final int COLUMN_CANDIDATE_MOBILE = 4;

	/** 
	 * Index of column CANDIDATE_ADDRESS
	 */
	protected static final int COLUMN_CANDIDATE_ADDRESS = 5;

	/** 
	 * Index of column CANDIDATE_REG_DATE
	 */
	protected static final int COLUMN_CANDIDATE_REG_DATE = 6;

	/** 
	 * Index of column CANDIDATE_INTERVIEW_DEGREE
	 */
	protected static final int COLUMN_CANDIDATE_INTERVIEW_DEGREE = 7;

	/** 
	 * Index of column JOB_TITLE_ID
	 */
	protected static final int COLUMN_JOB_TITLE_ID = 8;

	/** 
	 * Index of column CV_FILE
	 */
	protected static final int COLUMN_CV_FILE = 9;

	/** 
	 * Index of column CANDIDATE_IMAGE
	 */
	protected static final int COLUMN_CANDIDATE_IMAGE = 10;

	/** 
	 * Index of column CV_DEGREE
	 */
	protected static final int COLUMN_CV_DEGREE = 11;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 11;

	/** 
	 * Index of primary-key column CANDIDATE_ID
	 */
	protected static final int PK_COLUMN_CANDIDATE_ID = 1;

	/** 
	 * Inserts a new row in the JOB_CANDIDATES table.
	 */
	public JobCandidatesPk insert(JobCandidates dto) throws JobCandidatesDaoException
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
			stmt.setInt( index++, dto.getCandidateId() );
			stmt.setString( index++, dto.getCandidateName() );
			stmt.setString( index++, dto.getCandidatePhone() );
			stmt.setString( index++, dto.getCandidateMobile() );
			stmt.setString( index++, dto.getCandidateAddress() );
			stmt.setTimestamp(index++, dto.getCandidateRegDate()==null ? null : new java.sql.Timestamp( dto.getCandidateRegDate().getTime() ) );
			if (dto.isCandidateInterviewDegreeNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getCandidateInterviewDegree() );
			}
		
			stmt.setInt( index++, dto.getJobTitleId() );
			// no need to bind value for LOB column
			// no need to bind value for LOB column
			if (dto.isCvDegreeNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getCvDegree() );
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
			throw new JobCandidatesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the JOB_CANDIDATES table.
	 */
	public void update(JobCandidatesPk pk, JobCandidates dto) throws JobCandidatesDaoException
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
			stmt.setInt( index++, dto.getCandidateId() );
			stmt.setString( index++, dto.getCandidateName() );
			stmt.setString( index++, dto.getCandidatePhone() );
			stmt.setString( index++, dto.getCandidateMobile() );
			stmt.setString( index++, dto.getCandidateAddress() );
			stmt.setTimestamp(index++, dto.getCandidateRegDate()==null ? null : new java.sql.Timestamp( dto.getCandidateRegDate().getTime() ) );
			if (dto.isCandidateInterviewDegreeNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getCandidateInterviewDegree() );
			}
		
			stmt.setInt( index++, dto.getJobTitleId() );
			// no need to bind value for LOB column
			// no need to bind value for LOB column
			if (dto.isCvDegreeNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getCvDegree() );
			}
		
			stmt.setInt( 10, pk.getCandidateId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new JobCandidatesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the JOB_CANDIDATES table.
	 */
	public void delete(JobCandidatesPk pk) throws JobCandidatesDaoException
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
			stmt.setInt( 1, pk.getCandidateId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new JobCandidatesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the JOB_CANDIDATES table that matches the specified primary-key value.
	 */
	public JobCandidates findByPrimaryKey(JobCandidatesPk pk) throws JobCandidatesDaoException
	{
		return findByPrimaryKey( pk.getCandidateId() );
	}

	/** 
	 * Returns all rows from the JOB_CANDIDATES table that match the criteria 'CANDIDATE_ID = :candidateId'.
	 */
	public JobCandidates findByPrimaryKey(int candidateId) throws JobCandidatesDaoException
	{
		JobCandidates ret[] = findByDynamicSelect( SQL_SELECT + " WHERE CANDIDATE_ID = ?", new Object[] {  new Integer(candidateId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the JOB_CANDIDATES table that match the criteria ''.
	 */
	public JobCandidates[] findAll() throws JobCandidatesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY CANDIDATE_ID", null );
	}

	/** 
	 * Returns all rows from the JOB_CANDIDATES table that match the criteria 'CANDIDATE_ID = :candidateId'.
	 */
	public JobCandidates[] findWhereCandidateIdEquals(int candidateId) throws JobCandidatesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CANDIDATE_ID = ? ORDER BY CANDIDATE_ID", new Object[] {  new Integer(candidateId) } );
	}

	/** 
	 * Returns all rows from the JOB_CANDIDATES table that match the criteria 'CANDIDATE_NAME = :candidateName'.
	 */
	public JobCandidates[] findWhereCandidateNameEquals(String candidateName) throws JobCandidatesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CANDIDATE_NAME = ? ORDER BY CANDIDATE_NAME", new Object[] { candidateName } );
	}

	/** 
	 * Returns all rows from the JOB_CANDIDATES table that match the criteria 'CANDIDATE_PHONE = :candidatePhone'.
	 */
	public JobCandidates[] findWhereCandidatePhoneEquals(String candidatePhone) throws JobCandidatesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CANDIDATE_PHONE = ? ORDER BY CANDIDATE_PHONE", new Object[] { candidatePhone } );
	}

	/** 
	 * Returns all rows from the JOB_CANDIDATES table that match the criteria 'CANDIDATE_MOBILE = :candidateMobile'.
	 */
	public JobCandidates[] findWhereCandidateMobileEquals(String candidateMobile) throws JobCandidatesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CANDIDATE_MOBILE = ? ORDER BY CANDIDATE_MOBILE", new Object[] { candidateMobile } );
	}

	/** 
	 * Returns all rows from the JOB_CANDIDATES table that match the criteria 'CANDIDATE_ADDRESS = :candidateAddress'.
	 */
	public JobCandidates[] findWhereCandidateAddressEquals(String candidateAddress) throws JobCandidatesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CANDIDATE_ADDRESS = ? ORDER BY CANDIDATE_ADDRESS", new Object[] { candidateAddress } );
	}

	/** 
	 * Returns all rows from the JOB_CANDIDATES table that match the criteria 'CANDIDATE_REG_DATE = :candidateRegDate'.
	 */
	public JobCandidates[] findWhereCandidateRegDateEquals(Date candidateRegDate) throws JobCandidatesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CANDIDATE_REG_DATE = ? ORDER BY CANDIDATE_REG_DATE", new Object[] { candidateRegDate==null ? null : new java.sql.Timestamp( candidateRegDate.getTime() ) } );
	}

	/** 
	 * Returns all rows from the JOB_CANDIDATES table that match the criteria 'CANDIDATE_INTERVIEW_DEGREE = :candidateInterviewDegree'.
	 */
	public JobCandidates[] findWhereCandidateInterviewDegreeEquals(int candidateInterviewDegree) throws JobCandidatesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CANDIDATE_INTERVIEW_DEGREE = ? ORDER BY CANDIDATE_INTERVIEW_DEGREE", new Object[] {  new Integer(candidateInterviewDegree) } );
	}

	/** 
	 * Returns all rows from the JOB_CANDIDATES table that match the criteria 'JOB_TITLE_ID = :jobTitleId'.
	 */
	public JobCandidates[] findWhereJobTitleIdEquals(int jobTitleId) throws JobCandidatesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE JOB_TITLE_ID = ? ORDER BY JOB_TITLE_ID", new Object[] {  new Integer(jobTitleId) } );
	}

	/** 
	 * Returns all rows from the JOB_CANDIDATES table that match the criteria 'CV_FILE = :cvFile'.
	 */
	public JobCandidates[] findWhereCvFileEquals(byte[] cvFile) throws JobCandidatesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CV_FILE = ? ORDER BY CV_FILE", new Object[] { cvFile } );
	}

	/** 
	 * Returns all rows from the JOB_CANDIDATES table that match the criteria 'CANDIDATE_IMAGE = :candidateImage'.
	 */
	public JobCandidates[] findWhereCandidateImageEquals(byte[] candidateImage) throws JobCandidatesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CANDIDATE_IMAGE = ? ORDER BY CANDIDATE_IMAGE", new Object[] { candidateImage } );
	}

	/** 
	 * Returns all rows from the JOB_CANDIDATES table that match the criteria 'CV_DEGREE = :cvDegree'.
	 */
	public JobCandidates[] findWhereCvDegreeEquals(int cvDegree) throws JobCandidatesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CV_DEGREE = ? ORDER BY CV_DEGREE", new Object[] {  new Integer(cvDegree) } );
	}

	/**
	 * Method 'JobCandidatesDaoImpl'
	 * 
	 */
	public JobCandidatesDaoImpl()
	{
	}

	/**
	 * Method 'JobCandidatesDaoImpl'
	 * 
	 * @param userConn
	 */
	public JobCandidatesDaoImpl(final java.sql.Connection userConn)
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
		return "HRMS.JOB_CANDIDATES";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected JobCandidates fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			JobCandidates dto = new JobCandidates();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected JobCandidates[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			JobCandidates dto = new JobCandidates();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		JobCandidates ret[] = new JobCandidates[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(JobCandidates dto, ResultSet rs) throws SQLException
	{
		dto.setCandidateId( rs.getInt( COLUMN_CANDIDATE_ID ) );
		dto.setCandidateName( rs.getString( COLUMN_CANDIDATE_NAME ) );
		dto.setCandidatePhone( rs.getString( COLUMN_CANDIDATE_PHONE ) );
		dto.setCandidateMobile( rs.getString( COLUMN_CANDIDATE_MOBILE ) );
		dto.setCandidateAddress( rs.getString( COLUMN_CANDIDATE_ADDRESS ) );
		dto.setCandidateRegDate( rs.getTimestamp(COLUMN_CANDIDATE_REG_DATE ) );
		dto.setCandidateInterviewDegree( rs.getInt( COLUMN_CANDIDATE_INTERVIEW_DEGREE ) );
		if (rs.wasNull()) {
			dto.setCandidateInterviewDegreeNull( true );
		}
		
		dto.setJobTitleId( rs.getInt( COLUMN_JOB_TITLE_ID ) );
		dto.setCvFile( super.getBlobColumn(rs, COLUMN_CV_FILE ) );
		dto.setCandidateImage( super.getBlobColumn(rs, COLUMN_CANDIDATE_IMAGE ) );
		dto.setCvDegree( rs.getInt( COLUMN_CV_DEGREE ) );
		if (rs.wasNull()) {
			dto.setCvDegreeNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(JobCandidates dto)
	{
	}

	/** 
	 * Returns all rows from the JOB_CANDIDATES table that match the specified arbitrary SQL statement
	 */
	public JobCandidates[] findByDynamicSelect(String sql, Object[] sqlParams) throws JobCandidatesDaoException
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
			throw new JobCandidatesDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the JOB_CANDIDATES table that match the specified arbitrary SQL statement
	 */
	public JobCandidates[] findByDynamicWhere(String sql, Object[] sqlParams) throws JobCandidatesDaoException
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
			throw new JobCandidatesDaoException( "Exception: " + _e.getMessage(), _e );
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