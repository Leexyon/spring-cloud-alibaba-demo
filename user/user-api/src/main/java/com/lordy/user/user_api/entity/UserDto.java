package com.lordy.user.user_api.entity;

import java.io.Serializable;
import java.util.List;

public class UserDto implements Serializable {

    private User user;

    private String[] authorities;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String[] getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String[] authorities) {
        this.authorities = authorities;
    }
}
