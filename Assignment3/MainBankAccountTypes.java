// Superclass
class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void displayBalance() {
        System.out.println(accountHolder + " → Balance=" + (int)balance);
    }
}

// SavingsAccount subclass
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    void calculateInterest() {
        double interest = balance * (interestRate / 100);
        System.out.println(accountHolder + " → Balance=" + (int)balance + ", Interest=" + (int)interest);
    }
}

// CurrentAccount subclass
class CurrentAccount extends BankAccount {
    double overdraftLimit;

    CurrentAccount(int accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void checkOverdraft() {
        System.out.println(accountHolder + " → Balance=" + (int)balance + ", Overdraft Limit=" + (int)overdraftLimit);
    }
}

 class MainBankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(101, "Ramesh", 5000, 5.0);
        CurrentAccount current = new CurrentAccount(102, "Anita", 2000, 1000);

        savings.calculateInterest();
        current.checkOverdraft();
    }
}
