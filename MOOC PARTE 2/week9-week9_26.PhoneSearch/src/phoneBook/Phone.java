package phoneBook;

import java.util.HashSet;
import java.util.Set;

public class Phone {

    private Set<String> phone;

    public Phone() {
        this.phone = new HashSet<String>();
    }

    public void addPhone(String number) {
        phone.add(number);
    }

    public Set<String> getPhone() {
        return phone;
    }
}
