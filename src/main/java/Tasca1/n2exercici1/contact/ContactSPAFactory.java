package Tasca1.n1exercici2.contact;

import Tasca1.n1exercici2.address.Address;
import Tasca1.n1exercici2.address.AddressSPA;
import Tasca1.n1exercici2.phoneNumber.PhoneNumber;
import Tasca1.n1exercici2.phoneNumber.PhoneNumberSPA;

public class ContactSPAFactory implements ContactFactory{
    @Override
    public Address createAddress(String address) {
        return new AddressSPA(address);
    }

    @Override
    public PhoneNumber createPhone(String phoneNumber) {
        return new PhoneNumberSPA(phoneNumber);
    }
}
