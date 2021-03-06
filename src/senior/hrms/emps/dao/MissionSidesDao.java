/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package senior.hrms.emps.dao;

import senior.hrms.emps.dto.*;
import senior.hrms.emps.exceptions.*;

public interface MissionSidesDao
{
	/** 
	 * Inserts a new row in the MISSION_SIDES table.
	 */
	public MissionSidesPk insert(MissionSides dto) throws MissionSidesDaoException;

	/** 
	 * Updates a single row in the MISSION_SIDES table.
	 */
	public void update(MissionSidesPk pk, MissionSides dto) throws MissionSidesDaoException;

	/** 
	 * Deletes a single row in the MISSION_SIDES table.
	 */
	public void delete(MissionSidesPk pk) throws MissionSidesDaoException;

	/** 
	 * Returns the rows from the MISSION_SIDES table that matches the specified primary-key value.
	 */
	public MissionSides findByPrimaryKey(MissionSidesPk pk) throws MissionSidesDaoException;

	/** 
	 * Returns all rows from the MISSION_SIDES table that match the criteria 'MISSION_SIDE_ID = :missionSideId'.
	 */
	public MissionSides findByPrimaryKey(int missionSideId) throws MissionSidesDaoException;

	/** 
	 * Returns all rows from the MISSION_SIDES table that match the criteria ''.
	 */
	public MissionSides[] findAll() throws MissionSidesDaoException;

	/** 
	 * Returns all rows from the MISSION_SIDES table that match the criteria 'MISSION_SIDE_ID = :missionSideId'.
	 */
	public MissionSides[] findWhereMissionSideIdEquals(int missionSideId) throws MissionSidesDaoException;

	/** 
	 * Returns all rows from the MISSION_SIDES table that match the criteria 'MISSION_SIDE_NAME = :missionSideName'.
	 */
	public MissionSides[] findWhereMissionSideNameEquals(String missionSideName) throws MissionSidesDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the MISSION_SIDES table that match the specified arbitrary SQL statement
	 */
	public MissionSides[] findByDynamicSelect(String sql, Object[] sqlParams) throws MissionSidesDaoException;

	/** 
	 * Returns all rows from the MISSION_SIDES table that match the specified arbitrary SQL statement
	 */
	public MissionSides[] findByDynamicWhere(String sql, Object[] sqlParams) throws MissionSidesDaoException;

}
