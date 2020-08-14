package com.rest.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Oauth2 Resource Application 입니다.
 * [설명]
 * 1. access_token으로 리소스 요청
 * 2. access_token 검증
 * 3. 리소스 제공
 */
@SpringBootApplication
public class Oauth2Application {
    public static void main(String[] args) {
        SpringApplication.run(Oauth2Application.class, args);
    }
}
