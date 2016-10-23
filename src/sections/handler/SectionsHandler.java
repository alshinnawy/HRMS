/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sections.handler;

import senior.hrms.emps.dto.Sections;
import senior.hrms.emps.dto.SectionsPk;
import senior.hrms.emps.exceptions.SectionsDaoException;

/**
 *
 * @author amal
 */
public class SectionsHandler implements SectionsInterface
{

    @Override
    public SectionsPk addSections(Sections dto) throws SectionsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateSections(SectionsPk pk, Sections dto) throws SectionsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteSections(SectionsPk pk) throws SectionsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sections getSectionsById(int sectionId) throws SectionsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sections[] getAllSections() throws SectionsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sections[] getSectionsByDepartmentId(int departmentId) throws SectionsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sections[] getSectionsByParentId(int sectionParentId) throws SectionsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sections[] getSectionByName(String sectionName) throws SectionsDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
