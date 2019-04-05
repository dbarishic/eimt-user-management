package com.etrgovija.lab.service.impl;

import com.etrgovija.lab.service.TokenGenerationService;

import java.security.SecureRandom;

public class TokenGenerationServiceImpl implements TokenGenerationService {

    @Override
    public int generateToken() {
        SecureRandom random = new SecureRandom();
        int token = random.nextInt(10000);
        return token;
    }
}
