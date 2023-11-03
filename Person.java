public class Person extends TelephoneEntry {
    private String name;
    private String lastName;
    private Address address;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address newAddress) {
        address = newAddress;
    }

    @Override
    public String description() {
        return "Name:  " + name + "|Last Name: " + lastName + "|Address: |" + address.description();
    }
}
