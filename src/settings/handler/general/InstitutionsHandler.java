/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings.handler.general;

import senior.hrms.emps.dao.InstitutionsDao;
import senior.hrms.emps.dto.Institutions;
import senior.hrms.emps.dto.InstitutionsPk;
import senior.hrms.emps.exceptions.InstitutionsDaoException;
import senior.hrms.emps.factory.InstitutionsDaoFactory;

/**
 *
 * @author amal
 */
public class InstitutionsHandler implements InstitutionsInterface
{

    @Override
    public InstitutionsPk addInstitutions(Institutions dto) throws InstitutionsDaoException
    {
      InstitutionsDao id=InstitutionsDaoFactory.create();
      InstitutionsPk ipk=id.insert(dto);
      return ipk;
    }

    @Override
    public void updateInstitutions(InstitutionsPk pk, Institutions dto) throws InstitutionsDaoException
    {
        InstitutionsDao id=InstitutionsDaoFactory.create();
        id.update(pk, dto);
    }

    @Override
    public void deleteInstitutions(InstitutionsPk pk) throws InstitutionsDaoException
    {
          InstitutionsDao id=InstitutionsDaoFactory.create();
          id.delete(pk);
    }

    @Override
    public Institutions getInstitutionsById(int instituteId) throws InstitutionsDaoException
    {
        InstitutionsDao id=InstitutionsDaoFactory.create(); 
        //id.findWhereInstituteIdEquals(instituteId);
        Institutions[] list=id.findWhereInstituteIdEquals(instituteId);
         Institutions inst=new Institutions();
          inst.setInstituteAddress(list[0].getInstituteAddress());
          inst.setInstituteName(list[0].getInstituteName());
          inst.setInstituteWebSite(list[0].getInstituteWebSite());
          inst.setInstituteCityId(list[0].getInstituteCityId());
        return inst;
    }

    @Override
    public Institutions[] getAllInstitutions() throws InstitutionsDaoException
    {
        InstitutionsDao id=InstitutionsDaoFactory.create();
        Institutions[] inst=id.findAll();
        
        
        return inst;   
    }

    @Override
    public Institutions[] getInstituteByName(String instituteName) throws InstitutionsDaoException
    {
        InstitutionsDao id=InstitutionsDaoFactory.create();
        Institutions[] inst=id.findWhereInstituteNameEquals(instituteName);
        
        
        return inst; 
        
    }

    @Override
    public Institutions[] getInstituteByCityId(int instituteCityId) throws InstitutionsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Institutions[] getInstituteByAddress(String instituteAddress) throws InstitutionsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Institutions[] getInstituteByWebSite(String instituteWebSite) throws InstitutionsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
