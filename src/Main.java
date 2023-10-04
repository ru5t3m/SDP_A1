import Manager.PaymentManager;
import Payment.BitcoinPayment;
import Payment.PayPalPayment;

public class Main {
    public static void main(String[] args) {
        PaymentManager paymentManager = PaymentManager.getInstance();
        int cash = paymentManager.needToPay();

        paymentManager.processPayment(cash);

        paymentManager.setPaymentStrategy(new PayPalPayment());
        paymentManager.processPayment(cash);

        paymentManager.setPaymentStrategy(new BitcoinPayment());
        paymentManager.processPayment(cash);
    }
}