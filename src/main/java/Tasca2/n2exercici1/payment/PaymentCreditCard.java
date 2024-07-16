package Tasca2.n2exercici1.payment;

public class PaymentCreditCard implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("A charge of " + amount + "€ with credit card has been processed.");
    }
}
