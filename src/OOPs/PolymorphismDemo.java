package OOPs;

// Base class
class Payment {
    // ---------- Method Overloading (Compile-time Polymorphism) ----------
    void pay(double amount) {
        System.out.println("Paying " + amount + " using default method");
    }

    void pay(double amount, String currency) {
        System.out.println("Paying " + amount + " in " + currency);
    }

    // ---------- Method to be overridden ----------
    void process() {
        System.out.println("Processing generic payment");
    }

    // Method for covariant return type demo
    Payment receipt() {
        System.out.println("Generic receipt generated");
        return this;
    }
}

// Subclass for Credit Card Payment
class CreditCardPayment extends Payment {
    @Override
    void process() {
        System.out.println("Processing payment via Credit Card");
    }

    @Override
    CreditCardPayment receipt() {  // Covariant return type
        System.out.println("Credit Card receipt generated");
        return this;
    }
}

// Subclass for UPI Payment
class UpiPayment extends Payment {
    @Override
    void process() {
        System.out.println("Processing payment via UPI");
    }

    @Override
    UpiPayment receipt() {  // Covariant return type
        System.out.println("UPI receipt generated");
        return this;
    }
}

// Interface example
interface Refundable {
    void refund(double amount);
}

// Class implementing interface
class WalletPayment extends Payment implements Refundable {
    @Override
    void process() {
        System.out.println("Processing payment via Wallet");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding " + amount + " back to Wallet");
    }

    @Override
    WalletPayment receipt() {
        System.out.println("Wallet receipt generated");
        return this;
    }
}

// Demonstrating super and this usage
class NetBankingPayment extends Payment {
    @Override
    void process() {
        super.process(); // call parent method
        System.out.println("Processing payment via Net Banking (extra security checks)");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        // ---------- Compile-time Polymorphism ----------
        Payment basePay = new Payment();
        basePay.pay(1000);              // Overloaded method 1
        basePay.pay(500, "USD");        // Overloaded method 2

        // ---------- Runtime Polymorphism (Dynamic Method Dispatch) ----------
        Payment p1 = new CreditCardPayment(); // Upcasting
        p1.process(); // Calls CreditCardPayment's process()

        Payment p2 = new UpiPayment();  // Upcasting
        p2.process(); // Calls UpiPayment's process()

        // ---------- Covariant return types ----------
        CreditCardPayment cc = new CreditCardPayment();
        cc.receipt(); // returns CreditCardPayment

        UpiPayment upi = new UpiPayment();
        upi.receipt(); // returns UpiPayment

        // ---------- Interface Polymorphism ----------
        Refundable wallet = new WalletPayment(); // Interface reference
        wallet.refund(300); // Calls WalletPayment's refund()

        // ---------- super and this ----------
        Payment nb = new NetBankingPayment();
        nb.process(); // Calls super.process() + subclass process()
    }
}
