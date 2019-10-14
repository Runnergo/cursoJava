import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a, b;
        
        // entrada de datos
        System.out.print("Type the first number: ");
        a = Integer.parseInt(reader.nextLine());
        System.out.print("Type the second number: ");
        b = Integer.parseInt(reader.nextLine());
        
        // compara si son mayores o iguales
        if (a > b) {
            System.out.println("Greater number: " + a);
        } else if (b > a) {
            System.out.println("Greater number: " + b);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}