package com.etrgovija.lab.service;

import com.etrgovija.lab.model.User;
import com.etrgovija.lab.model.exceptions.UserDoesNotExistException;

public interface UserManagementService {

    public User createNewUser();

    public void confirmUser(Long userId) throws UserDoesNotExistException;

    public void deleteUser(User user);

    public void changePassword(Long userId, String oldPassword, String newPassword) throws UserDoesNotExistException;

    public void changeForgottenPassword(Long userId) throws UserDoesNotExistException;

    public User updateUser(Long userId, User user);
}
