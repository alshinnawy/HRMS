/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings.handler.general;

import senior.hrms.emps.dao.DiseasesDao;
import senior.hrms.emps.dto.Diseases;
import senior.hrms.emps.dto.DiseasesPk;
import senior.hrms.emps.exceptions.DiseasesDaoException;
import senior.hrms.emps.factory.DiseasesDaoFactory;

/**
 *
 * @author amal
 */
public class DiseasesHandler implements DiseasesInterface
{

    @Override
    public DiseasesPk addDiseases(Diseases dto) throws DiseasesDaoException
    {
        DiseasesDao atd = DiseasesDaoFactory.create();
        atd.insert((Diseases) dto) ;
        return null; 
     }

    @Override
    public void updateDiseases(DiseasesPk pk, Diseases dto) throws DiseasesDaoException
    {
          DiseasesDao atd = DiseasesDaoFactory.create();  
          atd.update(pk,  dto);
    }

    @Override
    public void deleteDiseases(DiseasesPk pk) throws DiseasesDaoException
    {
        DiseasesDao atd = DiseasesDaoFactory.create();
        atd.delete(pk);
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Diseases getDiseasesByPId(int diseaseId) throws DiseasesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Diseases[] getAllDiseases() throws DiseasesDaoException
    {
        DiseasesDao atd = DiseasesDaoFactory.create();
       Diseases[] list = atd.findAll();
        return  list;
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Diseases[] getDiseasesByDiseaseTypes(int diseaseTypeId) throws DiseasesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Diseases[] getDiseaseByName(String diseaseName) throws DiseasesDaoException
    {
        DiseasesDao atd = DiseasesDaoFactory.create();
        Diseases[] list = atd.findWhereDiseaseNameEquals(diseaseName);
        return list;    
    }

    @Override
    public Diseases[] getDiseasesByResult(String result) throws DiseasesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
