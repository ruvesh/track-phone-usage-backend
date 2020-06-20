package com.ruv.phoneusagemonitor.model;

import org.springframework.stereotype.Component;

@Component
public class AuthToken {

    private String username;
    private String authMessage;

    public AuthToken() {
    }

    public AuthToken(String username, String authMessage) {
        this.username = username;
        this.authMessage = authMessage;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuthMessage() {
        return authMessage;
    }

    public void setAuthMessage(String authMessage) {
        this.authMessage = authMessage;
    }

}
