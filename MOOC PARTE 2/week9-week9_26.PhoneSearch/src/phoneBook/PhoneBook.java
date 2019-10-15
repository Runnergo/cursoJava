package phoneBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import static phoneBook.Menu.printMenuOptions;

public class PhoneBook {

    private Scanner reader;
    private ArrayList<Contact> phoneBook;

    public PhoneBook() {
        String input = "1\n" + "pekka\n" + "040-123456\n" + "2\n" + "jukka\n" + "2\n"
                + "pekka\n" + "1\n" + "pekka\n" + "09-222333\n" + "2\n" + "pekka\n"
                + "3\n" + "02-444123\n" + "3\n" + "09-222333\n" + "5\n" + "pekka\n" + "4\n"
                + "pekka\n" + "ida ekmanintie\n" + "helsinki\n" + "5\n" + "pekka\n"
                + "4\n" + "jukka\n" + "korsontie\n" + "vantaa\n" + "5\n" + "jukka\n"
                + "7\n" + "kk\n" + "7\n" + "vantaa\n" + "7\n" + "seppo\n" + "6\n" + "jukka\n"
                + "5\n" + "jukka\n" + "x\n";
        this.reader = new Scanner(System.in);
        this.phoneBook = new ArrayList<Contact>();
    }

    public void menuOptions() {
        printMenuOptions();

        while (true) {

            System.out.print("\ncommand: ");
            String ask = reader.nextLine();

            if (ask.equalsIgnoreCase("x")) {
                break;

            } else if (ask.equals("1")) {
                addNumber();

            } else if (ask.equals("2")) {
                searchByName();

            } else if (ask.equals("3")) {
                searchByNumber();

            } else if (ask.equals("4")) {
                addAddress();

            } else if (ask.equals("5")) {
                searchPersonalInformation();

            } else if (ask.equals("6")) {
                deletePersonalInformation();

            } else if (ask.equals("7")) {
                filteredListing();
            }

        }
    }

    public void addNumber() {
        System.out.print("whose number: ");
        String name = reader.nextLine();
        System.out.print("number: ");
        String number = reader.nextLine();

        for (Contact contact : phoneBook) {
            if (contact.isName(name)) {
                contact.addNumberToName(number);
                return;
            }
        }
        phoneBook.add(new Contact(name, number));
    }

    public void searchByName() {
        System.out.print("whose number: ");
        String name = reader.nextLine();

        for (Contact contact : phoneBook) {
            if (contact.numberWasFound(name)) {
                Menu.printNumberList(contact, " ");
                return;
            }
        }
        System.out.println("  not found");
    }

    public void searchByNumber() {

        System.out.print("number: ");
        String number = reader.nextLine();

        for (Contact contact : phoneBook) {
            if (contact.nameWasFound(number)) {
                System.out.println(" " + contact.getName());
                return;
            }
        }
        System.out.println(" not found");
    }

    public void addAddress() {
        System.out.print("whose address: ");
        String name = reader.nextLine();

        System.out.print("street: ");
        String street = reader.nextLine();

        System.out.print("city: ");
        String city = reader.nextLine();

        for (Contact contact : phoneBook) {
            if (contact.isName(name)) {
                contact.addAddressList(street, city);
                return;
            }
        }
        phoneBook.add(new Contact(name, street, city));
    }

    public void searchPersonalInformation() {
        System.out.print("whose information: ");
        String name = reader.nextLine();
        for (Contact contact : phoneBook) {
            if (contact.isName(name)) {
                Menu.printAddress(name, contact);
                Menu.printInfoNumbers(name, contact);
                return;
            }
        }
        System.out.println("  not found");
    }

    public void deletePersonalInformation() {
        System.out.print("whose information: ");
        String name = reader.nextLine();

        for (Contact contact : phoneBook) {
            if (contact.isName(name)) {
                phoneBook.remove(contact);
                break;
            }
        }
    }

    public void filteredListing() {
        System.out.print("keyword (if empty, all listed): ");
        String key = reader.nextLine();

        Collections.sort(this.phoneBook);

        if (key != "") {
            int isKey = 0;

            for (Contact contact : phoneBook) {
                isKey = Menu.printbyKey(key, contact, isKey);
            }
            if (isKey == 0) {
                System.out.println("  not found");
            }

        } else {
            for (Contact contact : phoneBook) {
                Menu.printAll(contact);
            }
        }
    }
}
