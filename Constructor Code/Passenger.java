 class Passenger {

    String name;
    int age;
    String seatType;

    static int totalPassengersBooked = 0;

    Passenger(String name, int age) {
        this.name = name;
        this.age = age;
        this.seatType = "General";
        totalPassengersBooked++;
    }


    Passenger(String name, int age, String seatType) {
        this.name = name;
        this.age = age;
        this.seatType = seatType;
        totalPassengersBooked++;
    }

    void showDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Seat: " + seatType);
    }


    public static void display() {
        System.out.println("Total passengers booked: " + totalPassengersBooked);
    }


    public static void main(String[] args) {
        Passenger p1 = new Passenger("Manish", 22);
        Passenger p2 = new Passenger("Rohan", 30, "AC Sleeper");
        Passenger p3 = new Passenger("Darshan", 28);

        System.out.print("Passenger1: ");
        p1.showDetails();

        System.out.print("Passenger2: ");
        p2.showDetails();

        System.out.print("Passenger3: ");
        p3.showDetails();

       
        display();
    }
}





