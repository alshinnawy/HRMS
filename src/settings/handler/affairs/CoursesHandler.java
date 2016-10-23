/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings.handler.affairs;

import java.util.Date;
import senior.hrms.emps.dto.Courses;
import senior.hrms.emps.dto.CoursesPk;
import senior.hrms.emps.exceptions.CoursesDaoException;

/**
 *
 * @author amal
 */
public class CoursesHandler implements CoursesInterface
{

    @Override
    public CoursesPk addCourses(Courses dto) throws CoursesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateCourses(CoursesPk pk, Courses dto) throws CoursesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteCourses(CoursesPk pk) throws CoursesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Courses getCoursesById(int courseId) throws CoursesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Courses[] getAllCourses() throws CoursesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Courses[] getCourseByName(String courseName) throws CoursesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Courses[] getCourseByLocation(String courseLocation) throws CoursesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Courses[] getCoursesByDateFrom(Date dateFrom) throws CoursesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Courses[] getCoursesByDateTo(Date dateTo) throws CoursesDaoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
