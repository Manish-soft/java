import java.util.*;

class TicketBooking {

    public static void main(String[] args) {

        Queue<String> booking = new LinkedList<>();

        booking.add("Rohan");
        booking.add("Isha");
        booking.add("Manish");

     
        String servedCustomer = booking.poll();

      
        System.out.println("Serving: " + servedCustomer);

      
        System.out.println("Queue: " + booking);
    }
}
