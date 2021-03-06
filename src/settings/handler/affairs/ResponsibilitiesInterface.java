/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */
package settings.handler.affairs;

import senior.hrms.emps.dto.*;
import senior.hrms.emps.exceptions.*;

public interface ResponsibilitiesInterface
{

    public ResponsibilitiesPk addResponsibilities(Responsibilities dto) throws ResponsibilitiesDaoException;

    public void updateResponsibilities(ResponsibilitiesPk pk, Responsibilities dto) throws ResponsibilitiesDaoException;

    public void deleteResponsibilities(ResponsibilitiesPk pk) throws ResponsibilitiesDaoException;

    public Responsibilities getResponsibilitiesById(int responsibilityId) throws ResponsibilitiesDaoException;

    public Responsibilities[] getAllResponsibilities() throws ResponsibilitiesDaoException;

    public Responsibilities[] getResponsibilityByName(String responsibilityName) throws ResponsibilitiesDaoException;

    public Responsibilities[] getResponsibilitiesyDescription(String description) throws ResponsibilitiesDaoException;

}
