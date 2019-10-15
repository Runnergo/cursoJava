package phoneBook;

public class Address {

    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public Address() {
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean addressHasKey(String key) {
        if (street.contains(key) || city.contains(key)) {
            return true;
        }
        return false;

    }

    @Override
    public String toString() {
        return this.street + " " + this.city;
    }
}
