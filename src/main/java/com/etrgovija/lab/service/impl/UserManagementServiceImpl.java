package com.etrgovija.lab.service.impl;

import com.etrgovija.lab.model.User;
import com.etrgovija.lab.model.exceptions.UserDoesNotExistException;
import com.etrgovija.lab.repository.jpa.UserRepository;
import com.etrgovija.lab.service.EmailService;
import com.etrgovija.lab.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserManagementServiceImpl implements UserManagementService {

    UserRepository userRepository;
    EmailService emailService;

    @Autowired
    public UserManagementServiceImpl(UserRepository userRepository, EmailService emailService) {
        this.userRepository = userRepository;
        this.emailService = emailService;
    }

    @Override
    public User createNewUser() {
        return null;
    }

    @Override
    public void confirmUser(Long userId) throws UserDoesNotExistException {
        User user = userRepository.findById(userId).orElse(null);

        if (user != null) {
            user.markAsConfirmed();
        } else {
            throw new UserDoesNotExistException();
        }
    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public void changePassword(Long userId, String oldPassword, String newPassword) throws UserDoesNotExistException {
        User user = userRepository.findById(userId).orElse(null);

        if (user != null) {
            user.changePassword(oldPassword, newPassword);
        } else {
            throw new UserDoesNotExistException();
        }
    }

    @Override
    public void changeForgottenPassword(Long userId) throws UserDoesNotExistException {
        User user = userRepository.findById(userId).orElse(null);

        if (user != null) {
            emailService.sendForgottenPasswordEmail(user.getEmail());
        } else {
            throw new UserDoesNotExistException();
        }
    }

    @Override
    public User updateUser(Long userId, User user) {
        return null;
    }
}
