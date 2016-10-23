/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.handler;

import java.util.Date;
import senior.hrms.emps.dto.Users;
import senior.hrms.emps.dto.UsersPk;
import senior.hrms.emps.exceptions.UsersDaoException;

/**
 *
 * @author amal
 */
public interface UserHandlerInterface
{

    public void addUser(Users dto) throws UsersDaoException;

    public void updateUser(Users dto) throws UsersDaoException;

    public void deleteUser(UsersPk pk) throws UsersDaoException;

    public Users[] getAllUsers() throws UsersDaoException;

    public Users getUserByUserId(int userId) throws UsersDaoException;

    public Users[] getUserByEmployeeId(int employeeId) throws UsersDaoException;

    public Users[] getUserByName(String userName) throws UsersDaoException;

    public Users[] getUserByPassword(String userPassword) throws UsersDaoException;

    public Users[] getUserByCreatedDate(Date userCreatedDate) throws UsersDaoException;
}
