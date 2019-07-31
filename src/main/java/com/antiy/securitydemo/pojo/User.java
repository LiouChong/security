package com.antiy.securitydemo.pojo;
/**
 *
 */

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author: LiuChong
 * description:
 * date: 2019/7/31 13:37
 */
@Entity
public class User implements Serializable {
    @Id
    @Column
    private Long id;
    @Column
    private String login;
    @Column
    private String password;
    @Column
    private String role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"login\":\"")
                .append(login).append('\"');
        sb.append(",\"password\":\"")
                .append(password).append('\"');
        sb.append(",\"role\":\"")
                .append(role).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
