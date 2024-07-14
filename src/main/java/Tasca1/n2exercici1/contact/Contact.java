package Tasca1.n1exercici2.contact;

import Tasca1.n1exercici2.address.Address;
import Tasca1.n1exercici2.phoneNumber.PhoneNumber;

public class Contact {
    private String name;
    private Address address;
    private PhoneNumber phoneNumber;

    public Contact(String name, Address address, PhoneNumber phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + '\n' +
                "Address: " + address.getAddress() + '\n' +
                "Telephone: " + phoneNumber.getPhoneNumber()+ '\n';
    }

}
