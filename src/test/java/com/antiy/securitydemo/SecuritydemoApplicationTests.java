package com.antiy.securitydemo;

import com.antiy.securitydemo.dao.UserRepository;
import com.antiy.securitydemo.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SecuritydemoApplicationTests {
    @Autowired
    private UserRepository userDao;

    @Resource
    private RedisTemplate<String , String> redisTemplate;

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

    @Test
    public void testRedis() {
        System.out.println(redisTemplate.opsForValue().get("foo"));
    }
}
