package com.company;

import com.company.observer.News;

public class SubscribeForNews implements UserServiceStrategy{
    @Override
    public String service(User user) {
        user.news.add(user);
        return user.getUsername() + " subscribed for news";
    }
}
