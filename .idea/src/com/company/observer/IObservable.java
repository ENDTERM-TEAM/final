package com.company.observer;

import com.company.User;

public interface IObservable {
    public void add(User user);
    public void remove(User user);
    public void notifyOb();
}
