// Interface for land vehicles
interface LandVehicle {
    void driveOnLand();
}

// Interface for water vehicles
interface WaterVehicle {
    void driveOnWater();
}

// Class that implements both interfaces
class AmphibiousVehicle implements LandVehicle, WaterVehicle {
    String name;

    AmphibiousVehicle(String name) {
        this.name = name;
    }

    public void driveOnLand() {
        System.out.println(name + " → Driving on Land");
    }

    public void driveOnWater() {
        System.out.println(name + " → Driving on Water");
    }
}
 class MainVehicleTypes {
    public static void main(String[] args) {
        AmphibiousVehicle av = new AmphibiousVehicle("HydroCar");
        av.driveOnLand();
        av.driveOnWater();
    }
}
