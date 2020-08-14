package com.rest.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Oauth2 인증/인가 Application 입니다.
 * [설명]
 * 1. ID/Password 로그인
 * 2. 로그인 성공시 authorization_code 반환
 * 3. authorization_code로 access_token 요청
 * 4. access_token 반환
 */
@SpringBootApplication
public class Oauth2Application {
    public static void main(String[] args) {
        SpringApplication.run(Oauth2Application.class, args);
    }
}
