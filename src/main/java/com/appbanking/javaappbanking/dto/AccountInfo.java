package com.appbanking.javaappbanking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.security.auth.login.AccountException;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountInfo extends AccountException {

    private String accountName;
    private BigDecimal accountBalance;
    private String accountNumber;
}
