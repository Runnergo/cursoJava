package phoneBook;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Contact implements Comparable<Contact> {

    private Map<String, String> byName;
    private Map<String, Phone> byPhone;
    private Map<String, Address> address;
    private String name;

    public Contact(String name, String number) {
        this.name = name;
        this.byPhone = new HashMap<String, Phone>();
        this.byName = new HashMap<String, String>();
        this.address = new HashMap<String, Address>();

        this.byPhone.put(name, new Phone());
        this.byPhone.get(name).addPhone(number);
        this.byName.put(number, name);
    }

    public Contact(String name, String street, String city) {
        this.name = name;
        this.byPhone = new HashMap<String, Phone>();
        this.byName = new HashMap<String, String>();
        this.address = new HashMap<String, Address>();

        this.address.put(name, new Address());
        this.address.get(name).setStreet(street);
        this.address.get(name).setCity(city);
    }

    public String getName() {
        return this.name;
    }

    public boolean isName(String name) {
        if (this.name.equalsIgnoreCase(name)) {
            return true;
        }
        return false;
    }

    public void addNumberToName(String number) {
        this.byName.put(number, name);
        if (byPhone.get(name) != null) {
            byPhone.get(name).addPhone(number);

        } else {
            byPhone.put(name, new Phone());
            byPhone.get(name).addPhone(number);
        }
    }

    public boolean nameWasFound(String name) {
        if (byName.containsKey(name)) {
            return true;
        }
        return false;
    }

    public boolean numberWasFound(String number) {
        if (byPhone.containsKey(number)) {
            return true;
        }
        return false;
    }

    public boolean addressWasFound(String name) {
        if (address.containsKey(name)) {
            return true;
        }
        return false;
    }
    
    public void addAddressList(String street, String city) {

        if (address.get(name) == null) {
            this.address.put(name, new Address());
        }
        address.get(name).setStreet(street);
        address.get(name).setCity(city);
    }

    public Set<String> printNumber() {
        return byPhone.get(name).getPhone();
    }

    public Address printAddress() {
        return address.get(name);
    }

    public boolean keyWasFound(String key) {
        if (address.get(name) != null) {
            if (name.contains(key) || address.get(name).addressHasKey(key)) {
                return true;
            } else {
                return false;
            }
        } else {
            if (name.contains(key)) {
                return true;
            } else {
                return false;
            }
        }
    }
    @Override
    public int compareTo(Contact contact) {
        return this.name.compareToIgnoreCase(contact.getName());
    }
}
