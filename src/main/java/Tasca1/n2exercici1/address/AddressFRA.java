package Tasca1.n1exercici2.address;

public class AddressFRA implements Address {

    private String address;
    private final String COUNTRY = "France";

    public AddressFRA(String address) {
        this.address = address;
    }

    @Override
    public String getAddress() {
        return address + ", " + COUNTRY;
    }
}
