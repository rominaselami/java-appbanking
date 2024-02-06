package com.appbanking.javaappbanking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.security.auth.login.AccountException;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankResponse {
    private String responseCode;
    private String responseMessage;
    private AccountException accountInfo;

}
