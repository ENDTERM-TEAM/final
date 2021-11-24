package com.company.decorator;

import com.company.decorator.CreateOrder;

public abstract class Order implements CreateOrder {
    protected CreateOrder createOrder;

    public Order(CreateOrder createOrder) {
        this.createOrder = createOrder;
    }

    @Override
    public String getDesc() {
        return createOrder.getDesc();
    }

    @Override
    public Double getPrice() {
        return createOrder.getPrice();
    }
}
