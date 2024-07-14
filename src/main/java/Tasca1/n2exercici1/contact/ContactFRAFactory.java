package Tasca1.n1exercici2.contact;

import Tasca1.n1exercici2.address.Address;
import Tasca1.n1exercici2.address.AddressFRA;
import Tasca1.n1exercici2.phoneNumber.PhoneNumber;
import Tasca1.n1exercici2.phoneNumber.PhoneNumberFRA;

public class ContactFRAFactory implements ContactFactory {
    @Override
    public Address createAddress(String address) {
        return new AddressFRA(address);
    }

    @Override
    public PhoneNumber createPhone(String phoneNumber) {
        return new PhoneNumberFRA(phoneNumber);
    }
}
