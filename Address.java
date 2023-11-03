public class Address extends TelephoneEntry {
    // województwo?
    private String countryName;
    private String cityName;
    private String streetName;
    private String streetNumber;
    private String apartmentNumber;
    private String postalAddress;
    private TelephoneNumber telephoneNumber;

    public Address(String countryName, String cityName, String streetName, String streetNumber, String apartmentNumber,
            String postalAddress, TelephoneNumber telephoneNumber) {
        this.countryName = countryName;
        this.cityName = cityName;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.apartmentNumber = apartmentNumber;
        this.postalAddress = postalAddress;
        this.telephoneNumber = telephoneNumber;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String newCountryName) {
        countryName = newCountryName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String newCityName) {
        cityName = newCityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String newStreetName) {
        streetName = newStreetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String newStreetNumber) {
        streetNumber = newStreetNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String newApartmentNumber) {
        apartmentNumber = newApartmentNumber;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String newPostalAddress) {
        postalAddress = newPostalAddress;
    }

    public TelephoneNumber getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(TelephoneNumber newTelephoneNumber) {
        telephoneNumber = newTelephoneNumber;
    }

    @Override
    public String description() {
        return "Country Name: " + countryName + "| City Name: " + cityName + "| Street Name: " + streetName
                + "| Street Number: " + streetNumber + "| Apartment Number: " + apartmentNumber + "| Postal Address: "
                + postalAddress + "| Telephone Number: " + telephoneNumber.getFormattedTelephoneNumber();
    }

}