// Payment interface
interface Payment {
    void pay(double amount);
}

// CreditCardPayment class
class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Processing Credit Card Payment of " + (int)amount);
    }
}

// PayPalPayment class
class PayPalPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Processing PayPal Payment of " + (int)amount);
    }
}


class MainPaymentGateway {
    public static void main(String[] args) {
        double creditAmount = 2500;
        double paypalAmount = 1500;

        Payment creditCardPayment = new CreditCardPayment();
        Payment payPalPayment = new PayPalPayment();

        creditCardPayment.pay(creditAmount);
        payPalPayment.pay(paypalAmount);
    }
}
