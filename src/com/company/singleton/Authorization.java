package com.company.singleton;

public class Authorization {
    private static Authorization instance;
    public String username;

    public Authorization(String username) {
        this.username = username;
    }

    public static Authorization getInstance(String username) {
        if (instance == null) {
            instance = new Authorization(username);
        }
        return instance;
    }

}
