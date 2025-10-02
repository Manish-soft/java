public class PaymentProcessing {
    public static void main(String[] args) {
        processPayment();
    }

    static void processPayment() {
        try {
           
            throw new Exception("Payment failed");
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Cleanup done");
        }
    }
}
