/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings.handler.general;

import senior.hrms.emps.dao.AccidentReasonsDao;
import senior.hrms.emps.dto.AccidentReasons;
import senior.hrms.emps.dto.AccidentReasonsPk;
import senior.hrms.emps.exceptions.AccidentReasonsDaoException;
import senior.hrms.emps.factory.AccidentReasonsDaoFactory;

/**
 *
 * @author amal
 */
public class AccidentReasonsHandler implements AccidentReasonsInterface
{

    @Override
    public AccidentReasonsPk AddAccidentReasons(senior.hrms.emps.dto.AccidentReasons dto) throws AccidentReasonsDaoException
    {
        AccidentReasonsDao atd = AccidentReasonsDaoFactory.create();
        atd.insert(dto) ;
        return null;     }

    @Override
    public void updateAccidentReasons(AccidentReasonsPk pk, senior.hrms.emps.dto.AccidentReasons dto) throws AccidentReasonsDaoException
    {
      AccidentReasonsDao atd = AccidentReasonsDaoFactory.create();  
      atd.update(pk, dto);    }

    @Override
    public void deleteAccidentReasons(AccidentReasonsPk pk) throws AccidentReasonsDaoException
    {
     AccidentReasonsDao atd = AccidentReasonsDaoFactory.create();
    atd.delete(pk);    }

    @Override
    public senior.hrms.emps.dto.AccidentReasons getAccidentReasonsById(int accidentReasonId) throws AccidentReasonsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public senior.hrms.emps.dto.AccidentReasons[] getAllAccidentReasons() throws AccidentReasonsDaoException
    {
  AccidentReasonsDao atd = AccidentReasonsDaoFactory.create();
       AccidentReasons[] list = atd.findAll();
        return list;
        }

    @Override
    public senior.hrms.emps.dto.AccidentReasons[] getAccidentReasonByName(String accidentReason) throws AccidentReasonsDaoException
    {
        AccidentReasonsDao atd = AccidentReasonsDaoFactory.create();
        AccidentReasons[] list = atd.findWhereAccidentReasonEquals(accidentReason);
        return list;  
    
    }

}
