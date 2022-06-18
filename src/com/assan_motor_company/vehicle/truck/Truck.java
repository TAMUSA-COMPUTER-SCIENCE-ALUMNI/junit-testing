package com.assan_motor_company.vehicle.truck;

import com.assan_motor_company.vehicle.Vehicle;
import com.assan_motor_company.vehicle.car.Car;

public class Truck extends Vehicle {

    public Truck(String vin, double price) {
        super(vin, price);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof Truck)) {
            return false;
        }

        Truck truck = (Truck) object;

        return this.getVin() == truck.getVin() && this.getPrice() == truck.getPrice();
    }
}
