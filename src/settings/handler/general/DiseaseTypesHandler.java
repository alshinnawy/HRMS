/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings.handler.general;

import senior.hrms.emps.dao.DiseaseTypesDao;
import senior.hrms.emps.dto.DiseaseTypes;
import senior.hrms.emps.dto.DiseaseTypesPk;
import senior.hrms.emps.exceptions.DiseaseTypesDaoException;
import senior.hrms.emps.factory.DiseaseTypesDaoFactory;

/**
 *
 * @author amal
 */
public class DiseaseTypesHandler implements DiseaseTypesInterface
{

    @Override
    public DiseaseTypesPk addDiseaseTypes(DiseaseTypes dto) throws DiseaseTypesDaoException
    {
     DiseaseTypesDao od = DiseaseTypesDaoFactory.create();
        od.insert(dto);
        return null;    }

    @Override
    public void updateDiseaseTypes(DiseaseTypesPk pk, DiseaseTypes dto) throws DiseaseTypesDaoException
    {
       DiseaseTypesDao od =  DiseaseTypesDaoFactory.create();
       od.update(pk, dto);    }

    @Override
    public void deleteDiseaseTypes(DiseaseTypesPk pk) throws DiseaseTypesDaoException
    {
           DiseaseTypesDao od =  DiseaseTypesDaoFactory.create();
           od.delete(pk);   
    }

    @Override
    public DiseaseTypes[] getDiseaseTypesById(int diseaseTypeId) throws DiseaseTypesDaoException
    {
        DiseaseTypesDao od =  DiseaseTypesDaoFactory.create();
        DiseaseTypes[] list =   od.findWhereDiseaseTypeIdEquals(diseaseTypeId);
       return list;
    }

    @Override
    public DiseaseTypes[] getAllDiseaseTypes() throws DiseaseTypesDaoException
    {
       DiseaseTypesDao od =  DiseaseTypesDaoFactory.create();
         DiseaseTypes[] list = od.findAll();
        return list;    }

    @Override
    public DiseaseTypes[] getDiseaseTypeByName(String diseaseTypeName) throws DiseaseTypesDaoException
    {
          DiseaseTypesDao od =  DiseaseTypesDaoFactory.create();
         DiseaseTypes[] list = od.findWhereDiseaseTypeNameEquals(diseaseTypeName);
         return list;   
    
    }

}
