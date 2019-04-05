package com.etrgovija.lab.service;

public interface PasswordService {

    public String generateNewPassword();

    public String encodePassword(String password);
}
