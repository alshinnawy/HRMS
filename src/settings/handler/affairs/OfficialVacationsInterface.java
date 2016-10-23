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

public interface OfficialVacationsInterface
{

    public OfficialVacationsPk addOfficialVacations(OfficialVacations dto) throws OfficialVacationsDaoException;

    public void updateOfficialVacations(OfficialVacationsPk pk, OfficialVacations dto) throws OfficialVacationsDaoException;

    public void deleteOfficialVacations(OfficialVacationsPk pk) throws OfficialVacationsDaoException;

    public OfficialVacations getOfficialVacationsById(int officialVacationId) throws OfficialVacationsDaoException;

    public OfficialVacations[] getAllOfficialVacations() throws OfficialVacationsDaoException;

    public OfficialVacations[] getOfficialVacationByName(String officialVacationName) throws OfficialVacationsDaoException;

    public OfficialVacations[] getOfficialVacationsByDescription(String description) throws OfficialVacationsDaoException;

}