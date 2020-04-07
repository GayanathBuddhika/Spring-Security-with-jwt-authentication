package io.javabrains.springsecurityjwt.models;

import java.io.Serializable;

public class AuthenticationResponse implements Serializable {

    private final String jwt;
    
    private User myuser;

    public AuthenticationResponse(String jwt, User user) {
        this.jwt = jwt;
        this.myuser = user;
    }

    public String getJwt() {
        return jwt;
    }
    
    public User getMyuser() {
    return myuser;	
    }
}
