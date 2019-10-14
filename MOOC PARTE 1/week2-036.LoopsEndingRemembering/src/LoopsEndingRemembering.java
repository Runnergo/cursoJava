import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        // Declare variables
        int numero = 0;
        int suma = 0;
        int count = 0;
        int oddCount = 0;
        int evenCount = 0;
        double average = 0;
        
        // Get input
        System.out.print("Type numbers: ");
        numero = Integer.parseInt(reader.nextLine());
        while (numero != -1) {
            suma += numero;
            if (numero % 2 ==0) {
                evenCount++;
            } else {
                oddCount++;
            }
            count++;
            System.out.print("Type numbers: ");
            numero = Integer.parseInt(reader.nextLine());
        }
        average = (double) suma / count;
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + suma);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}