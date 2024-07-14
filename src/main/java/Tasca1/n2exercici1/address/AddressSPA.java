package Tasca1.n1exercici2.address;

public class AddressSPA implements Address {

    private String address;
    private final String COUNTRY = "Spain";

    public AddressSPA(String address) {
        this.address = address;
    }

    @Override
    public String getAddress() {
        return address + ", " + COUNTRY;
    }
}
