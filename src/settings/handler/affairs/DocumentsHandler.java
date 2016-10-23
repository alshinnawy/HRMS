/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings.handler.affairs;

import senior.hrms.emps.dto.Documents;
import senior.hrms.emps.dto.DocumentsPk;
import senior.hrms.emps.exceptions.DocumentsDaoException;

/**
 *
 * @author amal
 */
public class DocumentsHandler implements DocumentsInterface
{

    @Override
    public DocumentsPk addDocuments(Documents dto) throws DocumentsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateDocuments(DocumentsPk pk, Documents dto) throws DocumentsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteDocuments(DocumentsPk pk) throws DocumentsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Documents getDocumentsById(int documentId) throws DocumentsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Documents[] getAllDocuments() throws DocumentsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Documents[] getDocumentsByName(String documentName) throws DocumentsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Documents[] getDocumentsByDescription(String documentDescription) throws DocumentsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
