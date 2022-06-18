package com.assan_motor_company.vehicle;

import com.assan_motor_company.vehicle.car.Car;
import com.assan_motor_company.vehicle.car.Cheetah;
import com.assan_motor_company.vehicle.suv.Hippo;
import com.assan_motor_company.vehicle.suv.SUV;
import com.assan_motor_company.vehicle.truck.Rhino;
import com.assan_motor_company.vehicle.truck.Truck;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class VehicleFactoryTest {
    private Car car;
    private Cheetah cheetah;

    private Truck truck;
    private Rhino rhino;

    private SUV suv;
    private Hippo hippo;

    Map<String, String> carOrder;
    Map<String, String> cheetahOrder;

    Map<String, String> truckOrder;
    Map<String, String> rhinoOrder;

    Map<String, String> suvOrder;
    Map<String, String> hippoOrder;

    @Before
    public void init() {
        car = new Car("C1", 1.0);
        cheetah = new Cheetah("C2", 2.0);

        truck = new Truck("T1", 1.0);
        rhino = new Rhino("T2", 2.0);

        suv = new SUV("S1", 1.0);
        hippo = new Hippo("S2", 2.0);

        carOrder = new HashMap<>();
        carOrder.put("type", "car");

        cheetahOrder = new HashMap<>();
        cheetahOrder.put("type", "car");
        cheetahOrder.put("model", "cheetah");

        truckOrder = new HashMap<>();
        truckOrder.put("type", "truck");

        rhinoOrder = new HashMap<>();
        rhinoOrder.put("type", "truck");
        rhinoOrder.put("model", "rhino");

        suvOrder = new HashMap<>();
        suvOrder.put("type", "suv");

        hippoOrder = new HashMap<>();
        hippoOrder.put("type", "suv");
        hippoOrder.put("model", "hippo");
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

    @Test
    public void createCarPassCarOrderAndReturnCheetahObject() {
        assertEquals(VehicleFactory.createCar(cheetahOrder), cheetah);
    }

    @Test
    public void createCarPassTruckOrderAndReturnRhinoObject() {
        assertEquals(VehicleFactory.createTruck(rhinoOrder), rhino);
    }

    @Test
    public void createCarPassSUVOrderAndReturnHippoObject() {
        assertEquals(VehicleFactory.createSUV(hippoOrder), hippo);
    }
}