public class Company extends TelephoneEntry {
    private String name;
    private Address address;

    public Company(String name) {
        this.name = name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address newAddress) {
        address = newAddress;
    }

    @Override
    public String description() {
        return "Name:  " + name + "|Address: |" + address.description();
    }
}
