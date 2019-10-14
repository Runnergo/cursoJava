
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String name1, name2;
        int age1, age2, sum;
        
        System.out.print("Type your name: ");
        name1 = reader.nextLine();
        System.out.print("Type your age: ");
        age1 = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type your name: ");
        name2 = reader.nextLine();
        System.out.print("Type your age: ");
        age2 = Integer.parseInt(reader.nextLine());
        
        sum = age1 + age2;
        System.out.println(name1 + " and " + name2 + " are " + sum + " years old in total.");
    }
}
