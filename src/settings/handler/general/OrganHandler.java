/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings.handler.general;

import senior.hrms.emps.dao.*;
import senior.hrms.emps.dto.Organ;
import senior.hrms.emps.dto.OrganPk;
import senior.hrms.emps.exceptions.OrganDaoException;
import senior.hrms.emps.factory.OrganDaoFactory;

/**
 *
 * @author amal
 */
public class OrganHandler implements OrganInterface
{

    @Override
    public OrganPk addOrgan(Organ dto) throws OrganDaoException
    {
        OrganDao od = OrganDaoFactory.create();
        od.insert(dto);
        return null;
    }

    @Override
    public void updateOrgan(OrganPk pk, Organ dto) throws OrganDaoException
    {
       OrganDao od = OrganDaoFactory.create();
       od.update(pk, dto);
    }

    @Override
    public void deleteOrgan(OrganPk pk) throws OrganDaoException
    {
        OrganDao od = OrganDaoFactory.create();
        od.delete(pk);
        
    }

    @Override
    public Organ getOrganById(int organId) throws OrganDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Organ[] getAllOrgan() throws OrganDaoException
    {
        OrganDao od = OrganDaoFactory.create();
        Organ[] list = od.findAll();
        return list;
    }

    @Override
    public Organ[] getOrganByName(String organName) throws OrganDaoException
    {
        OrganDao od = OrganDaoFactory.create();
        Organ[] list = od.findWhereOrganNameEquals(organName);
        return list;
        
    }

}
