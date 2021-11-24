package com.company.decorator;

public class DeliveryDecorator extends Order{
    public DeliveryDecorator(CreateOrder createOrder) {
        super(createOrder);
    }

    public String getDesc() {
        return super.getDesc() + "with delivery";
    }

    public Double getPrice() {
        return super.getPrice() + 500.0;
    }
}
