package com.rest.oauth2.repo;

import com.rest.oauth2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * User JPA 파일 입니다.
 */
public interface UserJpaRepo extends JpaRepository<User, Long> {
    Optional<User> findByUid(String email);
}
