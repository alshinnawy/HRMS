/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings.handler.general;

import senior.hrms.emps.dto.Issuers;
import senior.hrms.emps.dto.IssuersPk;
import senior.hrms.emps.exceptions.IssuersDaoException;

/**
 *
 * @author amal
 */
public class IssuersHandler implements IssuersInterface
{

    @Override
    public IssuersPk addIssuers(Issuers dto) throws IssuersDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateIssuers(IssuersPk pk, Issuers dto) throws IssuersDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteIssuers(IssuersPk pk) throws IssuersDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Issuers getIssuersById(int issuerId) throws IssuersDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Issuers[] getAllIssuers() throws IssuersDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Issuers[] getIssuerByName(String issuerName) throws IssuersDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
