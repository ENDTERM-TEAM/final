package com.company.factory;

public class General implements IMedicine {
    private String name;
    private Double price;

    public General(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String getDesc() {
        return "This " + name + " is available to everyone";
    }
}
