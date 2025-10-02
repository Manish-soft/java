// Superclass
class Vehicle {
    String brand;
    int speed;

    // Constructor
    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
}

// Subclass: Car
class Car extends Vehicle {
    String modelType;

    Car(String brand, int speed, String modelType) {
        super(brand, speed);  // Call parent constructor
        this.modelType = modelType;
    }

    void display() {
        System.out.println("Car → " + brand + " " + modelType + ", Speed=" + speed);
    }
}

// Subclass: Bike
class Bike extends Vehicle {
    String modelType;

    Bike(String brand, int speed, String modelType) {
        super(brand, speed);  // Call parent constructor
        this.modelType = modelType;
    }

    void display() {
        System.out.println("Bike → " + brand + " " + modelType + ", Speed=" + speed);
    }
}

// Main class
public class VehicleTypes {
    public static void main(String[] args) {
        // Sample Input
        Car car = new Car("Honda", 180, "Civic");
        Bike bike = new Bike("Yamaha", 120, "R15");

        // Display Output
        car.display();
        bike.display();
    }
}
