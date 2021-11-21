package com.company.factory;

public class MedicineFactory {
    public IMedicine createMedicine(String medicine, String name, Double price) {
        if (medicine.equalsIgnoreCase("General")) {
            return new General(name, price);
        }else if (medicine.equalsIgnoreCase("PrescriptionOnly")) {
            return new PrescriptionOnly(name, price);
        }else if (medicine.equalsIgnoreCase("Pharmacy")) {
            return new Pharmacy(name, price);
        }
        return null;
    }
}
