/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package senior.hrms.emps.factory;

import java.sql.Connection;
import senior.hrms.emps.dao.*;
import senior.hrms.emps.jdbc.*;

public class HospitalsDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return HospitalsDao
	 */
	public static HospitalsDao create()
	{
		return new HospitalsDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return HospitalsDao
	 */
	public static HospitalsDao create(Connection conn)
	{
		return new HospitalsDaoImpl( conn );
	}

}