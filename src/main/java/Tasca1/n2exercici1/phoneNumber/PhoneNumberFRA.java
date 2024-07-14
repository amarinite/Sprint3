package Tasca1.n1exercici2.phoneNumber;

public class PhoneNumberFRA implements PhoneNumber{
    private final String PREFIX = "+33";
    private String phoneNumber;

    public PhoneNumberFRA(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getPhoneNumber() {
        return PREFIX + " " + phoneNumber;
    }
}
