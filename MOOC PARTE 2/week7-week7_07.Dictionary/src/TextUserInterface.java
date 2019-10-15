
import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary){
       this.reader=reader; 
       this.dictionary=dictionary;
    }
    public void start(){
        System.out.println("Statements:");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quits the text user interface");
      
        String ask="";
        while(true){
            System.out.print("\nStatement: ");
            ask=reader.nextLine();
            if (ask.equalsIgnoreCase("add")){
                System.out.print("In Finnish: ");
                String wordFinlandes=reader.nextLine();
                System.out.print("Translation: ");
                String wordTranslation=reader.nextLine();
                this.dictionary.add(wordFinlandes, wordTranslation);
                
            }else if (ask.equalsIgnoreCase("translate")){
                System.out.print("Give a word: ");
                String wordFinlandes=reader.nextLine();
                System.out.println("Translation: "+this.dictionary.translate(wordFinlandes));
                
            }else if (ask.equalsIgnoreCase("quit")){
                System.out.println("Cheers!");
                break;
                
            }else{
                System.out.println("Unknown statement");
            }
        }
        
    }
}
