package Tasca2.n2exercici1.payment;

import Tasca2.n2exercici1.exceptions.ProcessPaymentException;

public class PaymentGateway {
    public void processPayment(PaymentMethod paymentMethod, double amount) {

        boolean paymentSuccessful = Math.random() > 0.1;

        try {
            if (paymentSuccessful) {
                paymentMethod.pay(amount);
            } else {
                throw new ProcessPaymentException("Could not process your payment. Please try again.");
            }
        } catch (ProcessPaymentException e) {
            System.out.println(e.getMessage());
        }
    }
}
