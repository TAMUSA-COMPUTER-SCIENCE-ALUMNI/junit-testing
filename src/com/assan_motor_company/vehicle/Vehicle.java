package com.assan_motor_company.vehicle;

public abstract class Vehicle {
    private String vin;
    private double price;

    public Vehicle() {}

    public Vehicle(String vin, double price) {
        this.vin = vin;
        this.price = price;
    }

    public String getVin() {
        return vin;
    }

    public double getPrice() {
        return price;
    }

    abstract public boolean equals(Object object);
}
