package com.antiy.securitydemo.config;
/**
 *
 */

import com.antiy.securitydemo.dao.UserRepository;
import com.antiy.securitydemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author: LiuChong
 * description:
 * date: 2019/7/29 15:46
 */
@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        // 查询用户
        User userFromDatabase = userRepository.findByLogin(login);
        if (userFromDatabase == null) {
            throw new UsernameNotFoundException("User " + login + " was not found in db");
        }
        // 设置角色信息
        Collection<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(userFromDatabase.getRole());
        grantedAuthorities.add(grantedAuthority);

        return new org.springframework.security.core.userdetails.User(login, userFromDatabase.getPassword(), grantedAuthorities);
    }
}
