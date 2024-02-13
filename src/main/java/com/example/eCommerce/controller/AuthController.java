package com.example.eCommerce.controller;

import com.example.eCommerce.dto.AuthLogin.AuthLoginRequest;
import com.example.eCommerce.dto.AuthLogin.AuthLoginResponse;
import com.example.eCommerce.dto.Payment.PaymentDetailsRegisterRequest;
import com.example.eCommerce.service.auth.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/auth")
public class AuthController {
    private final AuthService authService;

    @PostMapping("/register")
    public void register(@RequestBody AuthLoginRequest authLoginRequest){
        authService.register(authLoginRequest);
    }

    @PostMapping("/login")
    public AuthLoginResponse login(AuthLoginRequest authLoginRequest){
        return authService.login(authLoginRequest);
    }

}
