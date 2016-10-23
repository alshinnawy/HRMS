/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings.handler.general;

import senior.hrms.emps.dao.BloodCategoriesDao;
import senior.hrms.emps.dto.BloodCategories;
import senior.hrms.emps.dto.BloodCategoriesPk;
import senior.hrms.emps.exceptions.BloodCategoriesDaoException;
import senior.hrms.emps.factory.BloodCategoriesDaoFactory;

/**
 *
 * @author amal
 */
public class BloodCategoriesHandler implements BloodCategoriesInterface
{

    @Override
    public BloodCategoriesPk addBloodCategories(senior.hrms.emps.dto.BloodCategories dto) throws BloodCategoriesDaoException
    {
        BloodCategoriesDao od = BloodCategoriesDaoFactory.create();
        od.insert(dto);
        return null;
    }

    @Override
    public void updateBloodCategories(BloodCategoriesPk pk, senior.hrms.emps.dto.BloodCategories dto) throws BloodCategoriesDaoException
    {
         BloodCategoriesDao od = BloodCategoriesDaoFactory.create();
       od.update(pk, dto);    }

    @Override
    public void delete(BloodCategoriesPk pk) throws BloodCategoriesDaoException
    {
      BloodCategoriesDao od = BloodCategoriesDaoFactory.create();
        od.delete(pk);  
    }

    @Override
    public senior.hrms.emps.dto.BloodCategories getBloodCategoriesById(int bloodCategoryId) throws BloodCategoriesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public senior.hrms.emps.dto.BloodCategories[] getAllBloodCategories() throws BloodCategoriesDaoException
    {
  BloodCategoriesDao od = BloodCategoriesDaoFactory.create();
        BloodCategories[] list = od.findAll();
        return list;    }

    @Override
    public senior.hrms.emps.dto.BloodCategories[] getBloodCategoriesByName(String bloodCategoriesName) throws BloodCategoriesDaoException
    {
        BloodCategoriesDao od = BloodCategoriesDaoFactory.create();
        BloodCategories[] list = od.findWhereBloodCategoriesNameEquals(bloodCategoriesName);
        return list;    }

}
