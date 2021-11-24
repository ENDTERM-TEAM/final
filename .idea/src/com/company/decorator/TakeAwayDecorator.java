package com.company.decorator;

public class TakeAwayDecorator extends Order{
    public TakeAwayDecorator(CreateOrder createOrder) {
        super(createOrder);
    }

    public String getDesc() {
        return super.getDesc() + "with take away";
    }

    public Double getPrice() {
        return super.getPrice() + 50.0;
    }
}
