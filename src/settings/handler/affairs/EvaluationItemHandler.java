/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings.handler.affairs;

import senior.hrms.emps.dto.EvaluationItem;
import senior.hrms.emps.dto.EvaluationItemPk;
import senior.hrms.emps.exceptions.EvaluationItemDaoException;

/**
 *
 * @author amal
 */
public class EvaluationItemHandler implements EvaluationItemInterface
{

    @Override
    public EvaluationItemPk addEvaluationItem(EvaluationItem dto) throws EvaluationItemDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateEvaluationItem(EvaluationItemPk pk, EvaluationItem dto) throws EvaluationItemDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteEvaluationItem(EvaluationItemPk pk) throws EvaluationItemDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EvaluationItem getEvaluationItemById(int evaluationItemId) throws EvaluationItemDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EvaluationItem[] getAllEvaluationItems() throws EvaluationItemDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EvaluationItem[] getEvaluationItemByName(String evaluationItemName) throws EvaluationItemDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EvaluationItem[] getEvaluationItemByNote(String evaluationItemNote) throws EvaluationItemDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
