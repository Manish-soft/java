
abstract class Payment {
    abstract void pay();
}

// CreditCardPayment subclass
class CreditCardPayment extends Payment {
    private String cardNumber;
    private double amount;

    public CreditCardPayment(String cardNumber, double amount) {
        this.cardNumber = cardNumber;
        this.amount = amount;
    }

    @Override
    public void pay() {
        System.out.println("Payment via Credit Card " + cardNumber + " → Rs. " + (int)amount + " Paid");
    }
}

// UPIPayment subclass
class UPIPayment extends Payment {
    private String upiId;
    private double amount;

    public UPIPayment(String upiId, double amount) {
        this.upiId = upiId;
        this.amount = amount;
    }

    @Override
    public void pay() {
        System.out.println("Payment via UPI " + upiId + " → Rs. " + (int)amount + " Paid");
    }
}

// Main class to test the functionality
 class MainPaymentSystem {
    public static void main(String[] args) {
        Payment creditPayment = new CreditCardPayment("1234567890123456", 5000);
        Payment upiPayment = new UPIPayment("rahul@upi", 2000);

        creditPayment.pay();
        upiPayment.pay();
    }
}
