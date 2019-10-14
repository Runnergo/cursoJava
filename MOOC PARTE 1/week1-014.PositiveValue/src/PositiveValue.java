
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int userNum;
       
        System.out.print("Type a number: ");
        userNum = Integer.parseInt(reader.nextLine());
        if (userNum > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
    }
}
