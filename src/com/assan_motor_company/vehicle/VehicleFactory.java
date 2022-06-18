package com.assan_motor_company.vehicle;

import com.assan_motor_company.vehicle.car.Car;
import com.assan_motor_company.vehicle.car.Cheetah;
import com.assan_motor_company.vehicle.suv.Hippo;
import com.assan_motor_company.vehicle.suv.SUV;
import com.assan_motor_company.vehicle.truck.Rhino;
import com.assan_motor_company.vehicle.truck.Truck;

import java.util.Map;

public class VehicleFactory {
    private VehicleFactory() {}

    public static Vehicle createVehicle(Map<String, String> vehicleOrder) {
        // TODO create a vehicle inventory table
        if (vehicleOrder.get("type") == "car") {
            return createCar(vehicleOrder);
        } else if  (vehicleOrder.get("type") == "truck") {
            return createTruck(vehicleOrder);
        } else if  (vehicleOrder.get("type") == "suv") {
            return createSUV(vehicleOrder);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static Car createCar(Map<String, String> carOrder) {
        if (carOrder.get("model") == "cheetah") {
            // TODO access vin and price from inventory table based on vehicleOrder parameters
            return new Cheetah("C2", 2.0);
        } else {
            return new Car("C1", 1.0);
        }
    }

    public static Truck createTruck(Map<String, String> truckOrder) {
        if (truckOrder.get("model") == "rhino") {
            // TODO access vin and price from inventory table based on vehicleOrder parameters
            return new Rhino("T2", 2.0);
        } else {
            return new Truck("T1", 1.0);
        }
    }

    public static SUV createSUV(Map<String, String> suvOrder) {
        // TODO access vin and price from inventory table based on vehicleOrder parameters
        if (suvOrder.get("model") == "hippo") {
            return new Hippo("S2", 2.0);
        } else {
            return new SUV("S1", 1.0);
        }
    }
}
