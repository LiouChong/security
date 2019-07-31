package com.antiy.securitydemo;

import com.antiy.securitydemo.dao.UserRepository;
import com.antiy.securitydemo.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SecuritydemoApplicationTests {
    @Autowired
    private UserRepository userDao;

    @Test
    public void contextLoads() {
    }


    @Test
    public void testgetOne() {
        String login = "user1";
        User byLogin = userDao.findByLogin(login);
        System.out.println(
                byLogin
        );
    }
}
