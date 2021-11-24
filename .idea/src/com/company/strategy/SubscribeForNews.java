package com.company.strategy;

import com.company.User;
import com.company.strategy.UserServiceStrategy;

public class SubscribeForNews implements UserServiceStrategy {
    @Override
    public String service(User user) {
        user.news.add(user);
        return user.getUsername() + " subscribed for news";
    }
}
