
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        String userPass;
        
        while (true) {
            // entrada password
            System.out.print("Type the password: ");
            userPass = reader.nextLine();

            // password correcto
            if (userPass.equals(password)) {
                System.out.println("Right!");
                System.out.println("The secret is: Hi!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
    }
}