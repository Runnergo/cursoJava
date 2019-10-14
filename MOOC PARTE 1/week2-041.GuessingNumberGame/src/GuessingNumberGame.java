
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int i = 0;
        // program your solution here. Do not touch the above lines!
        while (true) {
            int number = Integer.parseInt(reader.nextLine());
            if (numberDrawn > number) {
                i++;
                System.out.println("The number is greater, guesses made: "+i);
            
            }
            if (numberDrawn < number) {
                 i++;
                System.out.println("The number is lesser, guesses made: "+i);
            
            }
            if (numberDrawn == number) {
                System.out.println("Congratulations, your guess is correct!");
 break;
            }
        }

    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
