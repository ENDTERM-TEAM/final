package com.company.singleton;

public class Authorization {
    private static Authorization instance;
    public String username;
    public String password;

    public Authorization(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Authorization getInstance(String username, String password) {
        if (instance == null) {
            instance = new Authorization(username, password);
        }
        return instance;
    }

}
