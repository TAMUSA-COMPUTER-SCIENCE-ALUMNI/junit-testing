package com.assan_motor_company.vehicle;

import java.util.Map;

public class VehicleFactory {

    private VehicleFactory() {}

    public static Vehicle createVehicle(Map<String, String> vehicleOrder) {
        return new Vehicle();
    }