package com.antiy.securitydemo.dao;

import com.antiy.securitydemo.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByLogin(String Login);

}
