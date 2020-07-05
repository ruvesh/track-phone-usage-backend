package com.ruv.phoneusagemonitor.model;

import org.springframework.stereotype.Component;

@Component
public class AuthToken {

    private String username;
    private String authMessage;
    private int authCode;

    public AuthToken() {
    }

    public AuthToken(String username, String authMessage, int authCode) {
        this.username = username;
        this.authMessage = authMessage;
        this.authCode = authCode;
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

    public int getAuthCode() {
        return authCode;
    }

    public void setAuthCode(int authCode) {
        this.authCode = authCode;
    }
}
