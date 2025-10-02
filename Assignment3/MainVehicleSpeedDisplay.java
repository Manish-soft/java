// Base class
class Vehicle {
    void displaySpeed() {
        System.out.println("Vehicle speed unknown");
    }
}

// Car subclass
class Car extends Vehicle {
    @Override
    void displaySpeed() {
        System.out.println("Car speed 120 km/h");
    }
}

// Bike subclass
class Bike extends Vehicle {
    @Override
    void displaySpeed() {
        System.out.println("Bike speed 80 km/h");
    }
}

 class MainVehicleSpeedDisplay {
    public static void main(String[] args) {
        Vehicle c1 = new Car();
        Vehicle b1 = new Bike();

        c1.displaySpeed();
        b1.displaySpeed();
    }
}
