package com.company.factory;

public class PrescriptionOnly implements IMedicine {
    private String name;
    private Double price;

    public PrescriptionOnly(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String getDesc() {
        return name + " is available only from a pharmacist if prescribed by an appropriate practitioner";
    }
}
