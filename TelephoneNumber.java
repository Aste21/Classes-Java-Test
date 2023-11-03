public class TelephoneNumber implements Comparable<TelephoneNumber> {
    private String countryCode;
    private String localNumber;

    public TelephoneNumber(String countryCode, String localNumber) {
        this.countryCode = countryCode;
        this.localNumber = localNumber;
    }

    public void setCountryCode(String newCountryCode) {
        this.countryCode = newCountryCode;
    }

    public void setLocalNumber(String newLocalNumber) {
        this.localNumber = newLocalNumber;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getLocalNumber() {
        return this.localNumber;
    }

    public String getFormattedTelephoneNumber() {
        return countryCode + " " + localNumber;
    }

    @Override
    public int compareTo(TelephoneNumber o) {
        if (this.countryCode.equals(o.countryCode)) {
            return this.localNumber.compareTo(o.localNumber);
        }
        return this.countryCode.compareTo(o.countryCode);
    }
}
