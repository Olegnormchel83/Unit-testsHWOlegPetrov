package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    int targetStopSpeed = 0;
    int targetCarNumWheels = 4;
    int targetMotorcycleNumWheels = 2;
    int targetCarSpeedInDrive = 60;
    int targetMotorcycleSpeedInDrive = 75;

    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Dodge", "Ram", 2010);
        assertInstanceOf(Vehicle.class, car);
    }

    @Test
    public void testCarIsHaveFourWheels() {
        Car car = new Car("Mazda", "CX-5", 2021);
        assertEquals(car.getNumWheels(), targetCarNumWheels);
    }

    @Test
    public void testIsMotorcycleHaveTwoWheels() {
        Motorcycle moped = new Motorcycle("Yamaha", "1337", 2020);
        assertEquals(moped.getNumWheels(), targetMotorcycleNumWheels);
    }

    @Test
    public void testCarSpeed() {
        Car car = new Car("LADA", "2105", 1999);
        car.testDrive();
        assertEquals(car.getSpeed(), targetCarSpeedInDrive);
        car.park();
    }

    @Test
    public void testMotorcycleSpeed() {
        Motorcycle motorcycle = new Motorcycle("Moped", "Deda", 1978);
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(), targetMotorcycleSpeedInDrive);
        motorcycle.park();
    }

    @Test
    public void testCarDriveAndParking() {
        Car car = new Car("Opel", "Astra", 2012);
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), targetStopSpeed);
    }

    @Test
    public void testMotorcycleDriveAndPark() {
        Motorcycle motorcycle = new Motorcycle("Moped", "Deda", 1900);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(), targetStopSpeed);
    }
}