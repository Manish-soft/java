 class Vehicle1 {
     String regNo;
     String ownerName;
     String vehicleType;
     static int vehicleCount = 0;

    // Static block
    static {
        System.out.println("Welcome to CDAC Vehicle Registration Portal");
    }

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        vehicleCount++;
        this.regNo = "MH-2025-" + vehicleCount;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Getter methods
     String getRegNo() {
        return regNo;
    }

     String getOwnerName() {
        return ownerName;
    }

     String getVehicleType() {
        return vehicleType;
    }

     static int getVehicleCount() {
        return vehicleCount;
    }

    // Display method
     void displayDetails() {
        System.out.println("Registration Details:");
        System.out.println("  Registration No: " + getRegNo());
        System.out.println("  Owner Name     : " + getOwnerName());
        System.out.println("  Vehicle Type   : " + getVehicleType());
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Bike");
        Vehicle v3 = new Vehicle("Charlie", "Truck");

        v1.displayDetails();
        v2.displayDetails();
        v3.displayDetails();

        System.out.println("Total Vehicles Registered: " + Vehicle.getVehicleCount());
    }
}
