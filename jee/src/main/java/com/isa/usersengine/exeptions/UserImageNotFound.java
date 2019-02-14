package com.isa.usersengine.exeptions;

public class UserImageNotFound extends Exception {
    public UserImageNotFound() {
        super();
    }

    public UserImageNotFound(String message) {
        super(message);
    }
}
