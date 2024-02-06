package com.appbanking.javaappbanking.service.impl;

import com.appbanking.javaappbanking.dto.BankResponse;
import com.appbanking.javaappbanking.dto.UserRequest;
import com.appbanking.javaappbanking.entity.User;

public class UserServiceImpl implements UserService{
    @Override
    public BankResponse createAccount(UserRequest userRequest) {
        /** Creating an account - saving new user in DB **/

        User newUser = User.builder()
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .otherName(userRequest.getOtherName())
                .gender(userRequest.getGender())
                .address(userRequest.getAddress())
                .stateOfOrigin(userRequest.getStateOfOrigin())
                .accountNumber()

                .build();
    }
}
