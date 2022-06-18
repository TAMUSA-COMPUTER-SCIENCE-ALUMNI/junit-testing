package com.assan_motor_company.vehicle.car;

import com.assan_motor_company.vehicle.Vehicle;

public class Car extends Vehicle {

    public Car() {}

    public Car(String vin, double price) {
        super(vin, price);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof Car)) {
            return false;
        }

        Car car = (Car) object;

        return this.getVin() == car.getVin() && this.getPrice() == car.getPrice();
    }
}
