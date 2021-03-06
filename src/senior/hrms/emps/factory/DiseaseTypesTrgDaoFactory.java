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

public class DiseaseTypesTrgDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return DiseaseTypesTrgDao
	 */
	public static DiseaseTypesTrgDao create()
	{
		return new DiseaseTypesTrgDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return DiseaseTypesTrgDao
	 */
	public static DiseaseTypesTrgDao create(Connection conn)
	{
		return new DiseaseTypesTrgDaoImpl( conn );
	}

}
