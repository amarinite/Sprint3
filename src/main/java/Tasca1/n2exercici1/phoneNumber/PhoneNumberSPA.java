package Tasca1.n1exercici2.phoneNumber;

public class PhoneNumberSPA implements PhoneNumber {
    private final String PREFIX = "+34";
    private String phoneNumber;

    public PhoneNumberSPA(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getPhoneNumber() {
        return PREFIX + " " + phoneNumber;
    }
}
