package Tasca2.n2exercici1.shoeStore;

import Tasca2.n2exercici1.payment.PaymentGateway;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoeStore {

    private final Scanner scanner = new Scanner(System.in);
    private PaymentGateway paymentGateway = new PaymentGateway();
    public void makePurchase(ArrayList<Shoe> shoes) {
        int option = choosePayment();

        if (option == 1) {
            payWithCreditCard(shoes);
        } else if (option == 2) {
            payWithPaypal(shoes);
        } else {
            System.out.println("Please choose a valid number.");
            makePurchase(shoes);
        }
    }

    // FIX
    private void payWithCreditCard(ArrayList<Shoe> shoes) {
        paymentGateway.processPayment(null, calculateAmount(shoes));
    }

    private void payWithPaypal(ArrayList<Shoe> shoes) {
        paymentGateway.processPayment(null, calculateAmount(shoes));
    }

    private int choosePayment() {
        System.out.println("""
                Choose a payment method:
                1. Credit Card.
                2. Paypal.
                """);
        return scanner.nextInt();
    }

    private double calculateAmount(ArrayList<Shoe> shoes) {
        // double totalAmount = shoes.stream().reduce(0, Double::sum);     map
        double totalAmount = 0d;

        for (Shoe shoe : shoes) {
            totalAmount += shoe.getPrice();
        }

        return totalAmount;
    }

}
