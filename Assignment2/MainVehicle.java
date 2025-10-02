class Vehicle {
    
    static {
        System.out.println("Welcome to CDAC Vehicle Registration Portal");
    }

 
     String regNo;
     String ownerName;
 String vehicleType;


 static int vehicleCount = 0;

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
}
 class MainVehicle {
    public static void main(String[] args) {
        //  2 Vehicle objects
        Vehicle vehicle1 = new Vehicle("Alice", "Car");
        Vehicle vehicle2 = new Vehicle("Bob", "Bike");

        // Display details
        System.out.println("Vehicle 1: " + vehicle1.getRegNo() + ", " +
                           vehicle1.getOwnerName() + ", " + vehicle1.getVehicleType());

        System.out.println("Vehicle 2: " + vehicle2.getRegNo() + ", " +
                           vehicle2.getOwnerName() + ", " + vehicle2.getVehicleType());

        System.out.println("Total vehicles registered: " + Vehicle.getVehicleCount());
    }
}
