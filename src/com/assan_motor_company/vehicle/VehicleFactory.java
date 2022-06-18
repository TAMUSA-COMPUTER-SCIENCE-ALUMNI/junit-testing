package com.assan_motor_company.vehicle;

import com.assan_motor_company.vehicle.car.Car;
import com.assan_motor_company.vehicle.suv.SUV;
import com.assan_motor_company.vehicle.truck.Truck;

import java.util.Map;

public class VehicleFactory {
    private VehicleFactory() {}

    public static Vehicle createVehicle(Map<String, String> vehicleOrder) {
        // TODO create a vehicle inventory table
        if (vehicleOrder.get("type") == "car") {
            // TODO access vin and price from inventory table based on vehicleOrder parameters
            return new Car("C1", 1.0);
        } else if  (vehicleOrder.get("type") == "truck") {
            // TODO access vin and price from inventory table based on vehicleOrder parameters
            return new Truck("T1", 1.0);
        } else if  (vehicleOrder.get("type") == "suv") {
            // TODO access vin and price from inventory table based on vehicleOrder parameters
            return new SUV("S1", 1.0);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
