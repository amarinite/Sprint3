package Tasca1.n1exercici2;

import Tasca1.n1exercici2.address.Address;
import Tasca1.n1exercici2.contact.*;
import Tasca1.n1exercici2.phoneNumber.PhoneNumber;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactApp {

    private final ArrayList<Contact> contacts = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void run() {

        int option = 0;

        System.out.println("Welcome to your Contact List App.");
        do {
            printMenu();
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    Contact contact = addContact();
                    contacts.add(contact);
                    break;
                case 2:
                    listAllContacts();
                    break;
                case 3:
                    System.out.println("Thanks for using our app.");
                    break;
                default:
                    System.out.println("Invalid option, please choose between 1 and 3.");
            }
        } while (option != 3);
    }
    private Contact addContact() {
        int country = selectCountry();

        scanner.nextLine();
        
        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Address: ");
        String addInput = scanner.nextLine();

        System.out.println("Phone Number: ");
        String phoneInput = scanner.nextLine();

        ContactFactory factory = selectContactFactory(country);
        Address address = factory.createAddress(addInput);
        PhoneNumber phoneNumber = factory.createPhone(phoneInput);

        return new Contact(name, address, phoneNumber);
    }

    private void listAllContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact.toString());
        }
    }

    private int selectCountry() {
        System.out.println("""
                Please, select a country:
                1. Spain.
                2. USA.
                3. France""");
        return scanner.nextInt();
    }

    private ContactFactory selectContactFactory(int country) {
        ContactFactory factory = null;

        switch (country) {
            case 1:
                factory = new ContactSPAFactory();
                break;
            case 2:
                factory = new ContactUSAFactory();
                break;
            case 3:
                factory = new ContactFRAFactory();
                break;
            default:
                System.out.println("Invalid country, number must be between 1 and 3.");
                break;
        }

        return factory;
    }
    
    private void printMenu() {
        System.out.println("""
                Select an option:
                1. Add a new contact.
                2. View all existing contacts.
                3. Exit""");
    }
}
