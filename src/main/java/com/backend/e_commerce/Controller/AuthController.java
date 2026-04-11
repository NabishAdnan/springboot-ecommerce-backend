package com.backend.e_commerce.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.e_commerce.DTO.SignupRequest;
import com.backend.e_commerce.Repository.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService service;

    @PostMapping("/signup")
    public String signup(@RequestBody SignupRequest req) {
        return service.signup(req);
    }
}