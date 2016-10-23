/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings.handler.general;

import senior.hrms.emps.dao.HospitalsDao;
import senior.hrms.emps.dto.Hospitals;
import senior.hrms.emps.dto.HospitalsPk;
import senior.hrms.emps.exceptions.HospitalsDaoException;
import senior.hrms.emps.factory.HospitalsDaoFactory;

/**
 *
 * @author amal
 */
public class HospitalsHandler implements HospitalsInterface
{

    @Override
    public HospitalsPk addHospitals(Hospitals dto) throws HospitalsDaoException
    {
        HospitalsDao atd = HospitalsDaoFactory.create();
        atd.insert(dto) ;
        return null; 
    }

    @Override
    public void updateHospitals(HospitalsPk pk, Hospitals dto) throws HospitalsDaoException
    {
           HospitalsDao atd = HospitalsDaoFactory.create();  
           atd.update(pk, dto);
    }

    @Override
    public void deleteHospitals(HospitalsPk pk) throws HospitalsDaoException
    {
         HospitalsDao atd = HospitalsDaoFactory.create();
        atd.delete(pk);
    }

    @Override
    public Hospitals getHospitalsById(int hospitalId) throws HospitalsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Hospitals[] getAllHospitals() throws HospitalsDaoException
    {
         HospitalsDao od = HospitalsDaoFactory.create();
        Hospitals[] list = od.findAll();
        return list;    }

    @Override
    public Hospitals[] getHospitalByName(String hospitalName) throws HospitalsDaoException
    {
         HospitalsDao atd = HospitalsDaoFactory.create();
        Hospitals[] list = atd.findWhereHospitalNameEquals(hospitalName);
        return list;    }

    @Override
    public Hospitals[] getHospitalByAddress(String hospitalAddress) throws HospitalsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Hospitals[] getHospitalsByPhone1(String phone1) throws HospitalsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Hospitals[] getHospitalsByPhone2(String phone2) throws HospitalsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Hospitals[] getHospitalsByResponsible(String responsible) throws HospitalsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
