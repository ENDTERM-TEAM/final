package com.company.observer;

import com.company.User;
import com.company.observer.IObservable;

import java.util.ArrayList;
import java.util.List;

public class News implements IObservable {
    private List<User> users = new ArrayList<>();
    private String news;

    @Override
    public void add(User user) {
        users.add(user);
    }

    @Override
    public void remove(User user) {
        users.remove(user);
    }

    @Override
    public void notifyOb() {
        for(User user:users){
            user.update();
        }
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
        notifyOb();
    }
}
