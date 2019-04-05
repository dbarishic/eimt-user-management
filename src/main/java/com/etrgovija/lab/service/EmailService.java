package com.etrgovija.lab.service;


public interface EmailService {

    public void sendConfirmationEmail(String to, String subject, String text);

    public void sendForgottenPasswordEmail(String to);

}
