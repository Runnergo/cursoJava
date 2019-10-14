import java.util.Random;
 
public class PasswordRandomizer {
 
    // Define the variables
    private Random random;
    private int lengthPass;
    private String passWord;
 
    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.random = new Random();
        this.lengthPass = length;
        this.passWord = null;
    }
 
    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        passWord="";
        while (i < lengthPass) {
            int number = this.random.nextInt(25);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
            passWord += symbol;
            i++;
        }
 
        return this.passWord;
    }
}