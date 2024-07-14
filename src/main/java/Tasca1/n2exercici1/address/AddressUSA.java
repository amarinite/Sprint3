package Tasca1.n1exercici2.address;

public class AddressUSA implements Address {
    private String address;
    private final String COUNTRY = "USA";

    public AddressUSA(String address) {
        this.address = address;
    }

    @Override
    public String getAddress() {
        return address + ", " + COUNTRY;
    }
}
