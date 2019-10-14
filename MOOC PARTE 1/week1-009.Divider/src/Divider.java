
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
   int a, b;
   double quotient;
        System.out.print("Type a number: ");
        a = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        b = Integer.parseInt(reader.nextLine());
           
        quotient = (double)a / b;       
         System.out.println("Division: " + a + " / " + b + " = " + quotient);

    }
}

