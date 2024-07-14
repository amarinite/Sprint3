package Tasca1.n1exercici2.contact;

import Tasca1.n1exercici2.address.Address;
import Tasca1.n1exercici2.address.AddressUSA;
import Tasca1.n1exercici2.phoneNumber.PhoneNumber;
import Tasca1.n1exercici2.phoneNumber.PhoneNumberUSA;

public class ContactUSAFactory implements ContactFactory {
    @Override
    public Address createAddress(String address) {
        return new AddressUSA(address);
    }

    @Override
    public PhoneNumber createPhone(String phoneNumber) {
        return new PhoneNumberUSA(phoneNumber);
    }
}
