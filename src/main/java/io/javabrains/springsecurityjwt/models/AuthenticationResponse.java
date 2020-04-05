package io.javabrains.springsecurityjwt.models;

import java.io.Serializable;

public class AuthenticationResponse implements Serializable {

    private final String jwt;
    
    private Usert myuser;

    public AuthenticationResponse(String jwt, Usert user) {
        this.jwt = jwt;
        this.myuser = user;
    }

    public String getJwt() {
        return jwt;
    }
    
    public Usert getMyuser() {
    return myuser;	
    }
}
