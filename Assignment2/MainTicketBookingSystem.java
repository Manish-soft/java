class Passenger {
    String name;
    int age;
    String seatType;

    static int passengerCount = 0; 

    // Constructor 1
    Passenger(String name, int age) {
        this.name = name;
        this.age = age;
        this.seatType = "General"; // Default seat
        passengerCount++;
    }

    // Constructor 2
    Passenger(String name, int age, String seatType) {
        this.name = name;
        this.age = age;
        this.seatType = seatType;
        passengerCount++;
    }

    void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Seat: " + seatType);
    }
}

public class MainTicketBookingSystem {
    public static void main(String[] args) {
 
        Passenger p1 = new Passenger("Ravi", 25);
        Passenger p2 = new Passenger("Anita", 30, "AC Sleeper");
        Passenger p3 = new Passenger("Suresh", 40);

        System.out.print("Passenger1: ");
        p1.printDetails();

        System.out.print("Passenger2: ");
        p2.printDetails();

        System.out.print("Passenger3: ");
        p3.printDetails();

        // Total passengers
        System.out.println("Total Passengers Booked: " + Passenger.passengerCount);
    }
}
