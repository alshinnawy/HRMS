/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package senior.hrms.emps.jdbc;

import senior.hrms.emps.dao.*;
import java.util.List;
import java.util.ArrayList;
import senior.hrms.emps.dto.*;
import senior.hrms.emps.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

public class EvaluationsDegreeTrgDaoImpl extends AbstractDAO implements EvaluationsDegreeTrgDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/**
	 * Method 'EvaluationsDegreeTrgDaoImpl'
	 * 
	 */
	public EvaluationsDegreeTrgDaoImpl()
	{
	}

	/**
	 * Method 'EvaluationsDegreeTrgDaoImpl'
	 * 
	 * @param userConn
	 */
	public EvaluationsDegreeTrgDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/**
	 * Method 'execute'
	 * 
	 * @param param
	 * @throws EvaluationsDegreeTrgDaoException
	 */
	public void execute(EvaluationsDegreeTrgParam param) throws EvaluationsDegreeTrgDaoException
	{
		// declare variables
		final boolean _isConnSupplied = (userConn != null);
		Connection _conn = null;
		CallableStatement _stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			_conn = _isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// create a CallableStatement
			_stmt = _conn.prepareCall( "{call HRMS.EVALUATIONS_DEGREE_TRG()}" );
		
			_stmt.execute();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new EvaluationsDegreeTrgDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(_stmt);
			if (!_isConnSupplied) {
				ResourceManager.close(_conn);
			}
		
		}
		
	}

}