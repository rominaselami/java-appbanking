package com.appbanking.javaappbanking.service.impl;

import com.appbanking.javaappbanking.dto.BankResponse;
import com.appbanking.javaappbanking.dto.UserRequest;
import com.appbanking.javaappbanking.entity.User;
import com.appbanking.javaappbanking.repository.UserRepository;
import com.appbanking.javaappbanking.utils.AccountUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public BankResponse createAccount(UserRequest userRequest) {
        /** Creating an account - saving new user in DB
         * check if user already have an account
         * **/
        if (userRepository.existsByEmail(userRequest.getEmail())){


        }
        User newUser = User.builder()
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .otherName(userRequest.getOtherName())
                .gender(userRequest.getGender())
                .address(userRequest.getAddress())
                .stateOfOrigin(userRequest.getStateOfOrigin())
                .accountNumber(AccountUtils.generateAccountNumber())
                .accountBalance(BigDecimal.ZERO)
                .email(userRequest.getEmail())
                .phoneNumber(userRequest.getPhoneNumber())
                .alternativePhoneNumber(userRequest.getAlternativePhoneNumber())
                .status("ACTIVE")

                .build();

    }

}

