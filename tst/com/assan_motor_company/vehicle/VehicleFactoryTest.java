package com.assan_motor_company.vehicle;

import com.assan_motor_company.vehicle.car.Car;
import com.assan_motor_company.vehicle.suv.SUV;
import com.assan_motor_company.vehicle.truck.Truck;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class VehicleFactoryTest {
    private Car car;
    private Truck truck;
    private SUV suv;

    Map<String, String> carOrder;
    Map<String, String> truckOrder;
    Map<String, String> suvOrder;

    @Before
    public void init() {
        car = new Car("C1", 1.0);
        truck = new Truck("T1", 1.0);
        suv = new SUV("S1", 1.0);

        carOrder = new HashMap<>();
        carOrder.put("type", "car");

        truckOrder = new HashMap<>();
        truckOrder.put("type", "truck");

        suvOrder = new HashMap<>();
        suvOrder.put("type", "suv");
    }

    @Test
    public void createVehiclePassCarOrderAndReturnCarObject() {
        assertEquals(VehicleFactory.createVehicle(carOrder), car);
    }

    @Test
    public void createVehiclePassTruckOrderAndReturnTruckObject() {
        assertEquals(VehicleFactory.createVehicle(truckOrder), truck);
    }

    @Test
    public void createVehiclePassSUVOrderAndReturnSUVObject() {
        assertEquals(VehicleFactory.createVehicle(suvOrder), suv);
    }

    @Test (expected = IllegalArgumentException.class)
    public void createVehicleThrowsIllegalArgumentException() {
        VehicleFactory.createVehicle(new HashMap<String, String>());
    }
}