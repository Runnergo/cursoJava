
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String username, password;
       
        // entrada user
        
        System.out.print("Type your username: ");
        username = reader.nextLine();
        System.out.print("Type your password: ");
        password = reader.nextLine();
        
        // username/password
        if ((username.equals("alex") && password.equals("mightyducks"))
            || (username.equals("emily") && password.equals("cat"))) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }
    }
}