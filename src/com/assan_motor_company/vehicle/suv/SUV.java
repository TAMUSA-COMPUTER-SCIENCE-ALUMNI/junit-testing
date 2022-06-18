package com.assan_motor_company.vehicle.suv;

import com.assan_motor_company.vehicle.Vehicle;
import com.assan_motor_company.vehicle.car.Car;

public class SUV extends Vehicle {

    public SUV(String vin, double price) {
        super(vin, price);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof SUV)) {
            return false;
        }

        SUV suv = (SUV) object;

        return this.getVin() == suv.getVin() && this.getPrice() == suv.getPrice();
    }
}
