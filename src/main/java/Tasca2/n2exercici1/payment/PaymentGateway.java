package Tasca2.n2exercici1.payment;

public class PaymentGateway {
    public void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
}
