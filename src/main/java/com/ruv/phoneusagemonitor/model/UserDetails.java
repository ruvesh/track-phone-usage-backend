package com.ruv.phoneusagemonitor.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails {

    @Id
    private String username;
    private String password;

    public UserDetails() {
        super();
    }

    public UserDetails(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String fetchPass() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
