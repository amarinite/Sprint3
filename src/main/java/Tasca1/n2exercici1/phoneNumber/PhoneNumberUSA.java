package Tasca1.n1exercici2.phoneNumber;

public class PhoneNumberUSA implements PhoneNumber {
    private final String PREFIX = "+1";
    private String phoneNumber;

    public PhoneNumberUSA(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getPhoneNumber() {
        return PREFIX + " " + phoneNumber;
    }
}
