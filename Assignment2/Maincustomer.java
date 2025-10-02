class Customer {
    String name;
    String tickettype;

    static int totalticketssold = 0; 

    // Constructor 1: only name, default ticket type
    Customer(String name) {
        this.name = name;
        this.tickettype = "tickettype";
        totalticketssold++;
    }

    // Constructor 2: name and ticket type
    Customer(String name, String tickettype) {
        this.name = name;
        this.tickettype = tickettype;
        totalticketssold++;
    }

    void printDetails() {
        System.out.println("Name: " + name + ", Ticket Type: " + tickettype);
    }
}
 class Maincustomer {
    public static void main(String[] args) {

        // Create customers correctly
        Customer c1 = new Customer("Rahul", "Normal");
        Customer c2 = new Customer("Pooja", "Premium");
        Customer c3 = new Customer("Amity", "Normal");

        // Print details
        System.out.print("Customer1: ");
        c1.printDetails();

        System.out.print("Customer2: ");
        c2.printDetails();

        System.out.print("Customer3: ");
        c3.printDetails();

        // Print total tickets sold
        System.out.println("Total Tickets Sold: " + Customer.totalticketssold);
    }
}
