package com.company.strategy;

import com.company.User;
import com.company.decorator.CreateOrder;
import com.company.strategy.UserServiceStrategy;

public class Basket implements UserServiceStrategy, CreateOrder {
    private Double allPrice = 0.0;

    public void addMedicine(Double price) {
        this.allPrice += price;
    }

    @Override
    public String service(User user) {
        return "Choose your type of order";
    }

    @Override
    public String getDesc() {
        return "Basket ";
    }

    @Override
    public Double getPrice() {
        return allPrice;
    }
}
