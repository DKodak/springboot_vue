package com.kd.springboot_vue.model;

import lombok.Data;

@Data
public class UserInfo {
    private Integer id;

    private String username;

    private String password;



    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
