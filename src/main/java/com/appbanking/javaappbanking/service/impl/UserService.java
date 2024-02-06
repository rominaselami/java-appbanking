package com.appbanking.javaappbanking.service.impl;

import com.appbanking.javaappbanking.dto.BankResponse;
import com.appbanking.javaappbanking.dto.UserRequest;

public interface UserService {
  BankResponse createAccount(UserRequest userRequest);
}

