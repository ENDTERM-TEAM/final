package com.company;

import com.company.observer.IObserver;
import com.company.observer.News;
import com.company.singleton.Authorization;

public class User implements IObserver {
    private String username;
    private String password;
    public News news;
    public Authorization auth;
    public UserServiceStrategy serviceStrategy;

    public User() {}

    public User(String username, String password, News news, UserServiceStrategy serviceStrategy) {
        this.username = username;
        this.password = password;
        this.news = news;
        this.serviceStrategy = serviceStrategy;
    }

    public String service(User user) {
        return serviceStrategy.service(user);
    }

    public void login(String username) {
        auth = Authorization.getInstance(username);
    }

    @Override
    public void update() {
        System.out.println("Hey " + username + ", announcement is " + news.getNews());
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
