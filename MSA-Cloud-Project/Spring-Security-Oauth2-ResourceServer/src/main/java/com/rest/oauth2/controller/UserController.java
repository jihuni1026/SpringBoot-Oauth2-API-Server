package com.rest.oauth2.controller;

import com.rest.oauth2.entity.User;
import com.rest.oauth2.repo.UserJpaRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Oauth2 Resource Controller 파일 입니다.
 */
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/v1")
public class UserController {

    private final UserJpaRepo userJpaRepo;

    // users
    @GetMapping(value = "/users")
    public List<User> findAllUser() {
        return userJpaRepo.findAll();
    }
}
