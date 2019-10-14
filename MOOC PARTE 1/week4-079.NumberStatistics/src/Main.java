
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.
        // The tests does not work if you do not create the objects in the correct order
        NumberStatistics suma = new NumberStatistics();
        NumberStatistics par = new NumberStatistics();
        NumberStatistics impar = new NumberStatistics();
        
        System.out.println("type numbers:");
        
        while(true){
        
        int numberUser = Integer.parseInt(reader.nextLine());
        if (numberUser==-1){
            break;
        }
        if (numberUser%2==0){
            par.addNumber(numberUser);
            
        }else{
            impar.addNumber(numberUser);
        }
       suma.addNumber(numberUser);
        }
      
        System.out.println("Sum: " + suma.sum());
         System.out.println("sum of even" + par.sum());
          System.out.println("sum of odd" + impar.sum());
        
    }

    
}
