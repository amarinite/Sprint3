package Tasca1.n1exercici2.contact;

import Tasca1.n1exercici2.address.Address;
import Tasca1.n1exercici2.phoneNumber.PhoneNumber;

public interface ContactFactory {
    Address createAddress(String address);
    PhoneNumber createPhone(String phoneNumber);
}
