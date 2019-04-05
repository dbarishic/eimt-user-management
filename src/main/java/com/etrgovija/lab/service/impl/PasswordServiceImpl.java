package com.etrgovija.lab.service.impl;

import com.etrgovija.lab.service.PasswordService;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordServiceImpl implements PasswordService {

    PasswordEncoder passwordEncoder;

    @Autowired
    public PasswordServiceImpl(PasswordEncoder passwordEncoder) {
            this.passwordEncoder = passwordEncoder;
    }

    @Override
    public String generateNewPassword() {
        int lenght = 10;
        Boolean useLetters = true;
        Boolean useNumbers = true;

        return RandomStringUtils.random(lenght, useLetters, useNumbers);
    }

    @Override
    public String encodePassword(String password) {
        return this.passwordEncoder.encode(password);
    }
}
