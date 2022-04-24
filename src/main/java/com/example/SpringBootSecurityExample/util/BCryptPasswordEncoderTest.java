package com.example.SpringBootSecurityExample.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/*
-- This class
-   Generate some encoded password values
-   Output: $2a$10$qnOB2PH1CqRvw8f5epvHzOlrounRkVGi.Y5ho6ENdmj/C1DmPdAsy
 */

public class BCryptPasswordEncoderTest {

    public static void main(String[] args) {
        BCryptPasswordEncoder bpe = new BCryptPasswordEncoder();
        String encodedPWD = bpe.encode("devs@A!5003");
        System.out.println(encodedPWD);
    }
}