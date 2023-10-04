package Payment;

import Manager.PaymentStrategy;

public class BitcoinPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " via Bitcoin.");
    }
}
