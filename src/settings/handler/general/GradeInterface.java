/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */
package settings.handler.general;

import senior.hrms.emps.dao.*;
import senior.hrms.emps.dto.*;
import senior.hrms.emps.exceptions.*;

public interface GradeInterface
{

    public GradePk addGrade(Grade dto) throws GradeDaoException;

    public void updateGrade(GradePk pk, Grade dto) throws GradeDaoException;

    public void deleteGrade(GradePk pk) throws GradeDaoException;

    public Grade getGradeById(int gradeId) throws GradeDaoException;

    public Grade[] getAllGrade() throws GradeDaoException;

    public Grade[] getGradeByName(String gradeName) throws GradeDaoException;

}