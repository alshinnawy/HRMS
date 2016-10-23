/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings.handler.affairs;

import senior.hrms.emps.dto.MissionTypes;
import senior.hrms.emps.dto.MissionTypesPk;
import senior.hrms.emps.exceptions.MissionTypesDaoException;

/**
 *
 * @author amal
 */
public class MissionTypesHandler implements MissionTypesInterface
{

    @Override
    public MissionTypesPk addMissionTypes(MissionTypes dto) throws MissionTypesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateMissionTypes(MissionTypesPk pk, MissionTypes dto) throws MissionTypesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteMissionTypes(MissionTypesPk pk) throws MissionTypesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MissionTypes getMissionTypesById(int missionTypeId) throws MissionTypesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MissionTypes[] getAllMissionTypes() throws MissionTypesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MissionTypes[] getMissionTypeByName(String missionTypeName) throws MissionTypesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
