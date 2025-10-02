 class Ticket {
    // Instance variables
    private String passengerName;
    private int ticketNo;

    // Static counter for generating ticket numbers
    private static int ticketCounter = 5000;

    // Constructor
    public Ticket(String passengerName) {
        this.passengerName = passengerName;
        ticketCounter++;
        this.ticketNo = ticketCounter;
    }

    // Method to display ticket details
    public void displayTicket() {
        System.out.println("Ticket No: " + ticketNo + ", Passenger: " + passengerName);
    }
}
 class MainTicket {
    public static void main(String[] args) {
        // Creating 3 ticket objects
        Ticket t1 = new Ticket("Rahul");
        Ticket t2 = new Ticket("Priya");
        Ticket t3 = new Ticket("Amit");

        // Display ticket details
        t1.displayTicket();
        t2.displayTicket();
        t3.displayTicket();
    }
}
