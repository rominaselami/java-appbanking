package com.appbanking.javaappbanking.controller;

import com.appbanking.javaappbanking.dto.BankResponse;
import com.appbanking.javaappbanking.dto.UserRequest;
import com.appbanking.javaappbanking.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public BankResponse createAccont(@RequestBody UserRequest userRequest){

        return userService.createAccount(userRequest);
    }

}
