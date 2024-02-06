package com.appbanking.javaappbanking.utils;

import java.time.Year;

public class AccountUtils {
    /** 2024 + random six digits**/

    Year currentYear = Year.now();
    int min = 100000;
    int max = 999999;

    /**generate a random number between min and max**/

    int randNumber = (int) Math.floor(Math.random() * (max-min + 1) + min);


    /** convert the current and randomNumber to string concatenate**/

}
