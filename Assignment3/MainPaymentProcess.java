// Abstract base class
abstract class Payment {
    abstract void pay();
}

// CreditCardPayment class
class CreditCardPayment extends Payment {
    String cardNumber;
    int amount;

    CreditCardPayment(String cardNumber, int amount) {
        this.cardNumber = cardNumber;
        this.amount = amount;
    }

    @Override
    void pay() {
        System.out.println("Payment via Credit Card " + cardNumber + " → Rs. " + amount + " Paid");
    }
}

// UPIPayment class
class UPIPayment extends Payment {
    String upiId;
    int amount;

    UPIPayment(String upiId, int amount) {
        this.upiId = upiId;
        this.amount = amount;
    }

    @Override
    void pay() {
        System.out.println("Payment via UPI " + upiId + " → Rs. " + amount + " Paid");
    }
}

 class MainPaymentProcess {
    public static void main(String[] args) {
 

        Payment p;

        // Credit card payment
            p = new UPIPayment("1234567890123456", 5000);
        p.pay();

        p = new UPIPayment("rahul@upi", 2000);
        p.pay();
    }
}
