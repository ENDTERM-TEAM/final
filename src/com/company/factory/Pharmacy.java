package com.company.factory;

public class Pharmacy implements IMedicine {
    private String name;
    private Double price;

    public Pharmacy(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String getDesc() {
        return "This " + name + " available only from a pharmacist but without a prescription";
    }
}
