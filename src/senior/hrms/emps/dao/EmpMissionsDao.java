/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package senior.hrms.emps.dao;

import java.util.Date;
import senior.hrms.emps.dto.*;
import senior.hrms.emps.exceptions.*;

public interface EmpMissionsDao
{
	/** 
	 * Inserts a new row in the EMP_MISSIONS table.
	 */
	public EmpMissionsPk insert(EmpMissions dto) throws EmpMissionsDaoException;

	/** 
	 * Updates a single row in the EMP_MISSIONS table.
	 */
	public void update(EmpMissionsPk pk, EmpMissions dto) throws EmpMissionsDaoException;

	/** 
	 * Deletes a single row in the EMP_MISSIONS table.
	 */
	public void delete(EmpMissionsPk pk) throws EmpMissionsDaoException;

	/** 
	 * Returns the rows from the EMP_MISSIONS table that matches the specified primary-key value.
	 */
	public EmpMissions findByPrimaryKey(EmpMissionsPk pk) throws EmpMissionsDaoException;

	/** 
	 * Returns all rows from the EMP_MISSIONS table that match the criteria 'EMP_MISSION_ID = :empMissionId'.
	 */
	public EmpMissions findByPrimaryKey(int empMissionId) throws EmpMissionsDaoException;

	/** 
	 * Returns all rows from the EMP_MISSIONS table that match the criteria ''.
	 */
	public EmpMissions[] findAll() throws EmpMissionsDaoException;

	/** 
	 * Returns all rows from the EMP_MISSIONS table that match the criteria 'EMPLOYEE_ID = :employeeId'.
	 */
	public EmpMissions[] findByEmployees(int employeeId) throws EmpMissionsDaoException;

	/** 
	 * Returns all rows from the EMP_MISSIONS table that match the criteria 'MISSION_SIDE_ID = :missionSideId'.
	 */
	public EmpMissions[] findByMissionSides(int missionSideId) throws EmpMissionsDaoException;

	/** 
	 * Returns all rows from the EMP_MISSIONS table that match the criteria 'MISSION_TYPE_ID = :missionTypeId'.
	 */
	public EmpMissions[] findByMissionTypes(int missionTypeId) throws EmpMissionsDaoException;

	/** 
	 * Returns all rows from the EMP_MISSIONS table that match the criteria 'EMP_MISSION_ID = :empMissionId'.
	 */
	public EmpMissions[] findWhereEmpMissionIdEquals(int empMissionId) throws EmpMissionsDaoException;

	/** 
	 * Returns all rows from the EMP_MISSIONS table that match the criteria 'EMPLOYEE_ID = :employeeId'.
	 */
	public EmpMissions[] findWhereEmployeeIdEquals(int employeeId) throws EmpMissionsDaoException;

	/** 
	 * Returns all rows from the EMP_MISSIONS table that match the criteria 'MISSION_TYPE_ID = :missionTypeId'.
	 */
	public EmpMissions[] findWhereMissionTypeIdEquals(int missionTypeId) throws EmpMissionsDaoException;

	/** 
	 * Returns all rows from the EMP_MISSIONS table that match the criteria 'MISSION_SIDE_ID = :missionSideId'.
	 */
	public EmpMissions[] findWhereMissionSideIdEquals(int missionSideId) throws EmpMissionsDaoException;

	/** 
	 * Returns all rows from the EMP_MISSIONS table that match the criteria 'DATE_FROM = :dateFrom'.
	 */
	public EmpMissions[] findWhereDateFromEquals(Date dateFrom) throws EmpMissionsDaoException;

	/** 
	 * Returns all rows from the EMP_MISSIONS table that match the criteria 'DATE_TO = :dateTo'.
	 */
	public EmpMissions[] findWhereDateToEquals(Date dateTo) throws EmpMissionsDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the EMP_MISSIONS table that match the specified arbitrary SQL statement
	 */
	public EmpMissions[] findByDynamicSelect(String sql, Object[] sqlParams) throws EmpMissionsDaoException;

	/** 
	 * Returns all rows from the EMP_MISSIONS table that match the specified arbitrary SQL statement
	 */
	public EmpMissions[] findByDynamicWhere(String sql, Object[] sqlParams) throws EmpMissionsDaoException;

}
