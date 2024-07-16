package Tasca2.n2exercici1.payment;

public class PaymentPaypal implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("A charge of " + amount + "€ with Paypal has been processed.");
    }
}
