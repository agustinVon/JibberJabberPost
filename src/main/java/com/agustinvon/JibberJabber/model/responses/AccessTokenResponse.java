package com.agustinvon.JibberJabber.model.responses;

public class AccessTokenResponse {
    private String access_token;

    public AccessTokenResponse(String access_token) {
        this.access_token = access_token;
    }

    public AccessTokenResponse() {
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }
}
