package phoneBook;

public class Menu {

    public static void printMenuOptions() {
        System.out.println("phone search\n"
                + "available operations:\n"
                + " 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit");
    }

    public static void printAddress(String name, Contact contact) {
        if (contact.addressWasFound(name)) {
            System.out.println("  address: " + contact.printAddress());
            return;
        } else {
            System.out.println("  address unknown");
        }
    }

    public static void printInfoNumbers(String name, Contact contact) {
        
        if (contact.numberWasFound(name)) {
            
            System.out.println("  phone numbers:");
            printNumberList(contact, "   ");
        } else {
            System.out.println("  phone number not found");
        }
    }

    public static void printNumberList(Contact contact, String tabulador) {
        for (String listNumbers : contact.printNumber()) {
            System.out.println(tabulador + listNumbers);
        }
    }

    public static int printbyKey(String key, Contact contact, int isKey) {
         
        if (contact.keyWasFound(key)) {     
    
            System.out.println("\n " + contact.getName());
            printAddress(contact.getName(), contact);
            printInfoNumbers(contact.getName(), contact);
            isKey = 1;

        }
        return isKey;
    }

    public static void printAll(Contact contact) {
        printAddress(contact.getName(), contact);
        printInfoNumbers(contact.getName(), contact);
    }
}
