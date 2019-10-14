import java.util.ArrayList;
import java.util.Random;
 
public class LotteryNumbers {
 
    private ArrayList<Integer> numbers;
    private Random random;
 
    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.random = new Random();
        this.drawNumbers();
        
    }
 
    public ArrayList<Integer> numbers() {
        return this.numbers;
    }
 
    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        int i = 0;
        
        
        
        
        
        while (i < 7) {
            int numberRandom = this.random.nextInt(39)+1;
            if (containsNumber(numberRandom)==false) {
                numbers.add(numberRandom);
                i++;
            }
        }
        return;
    }
 
    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        for (int numberList : numbers) {
 
            if (numberList == number) {
                return true;
            }
        }
        return false;
    }
}
