
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess

        // if the letter has already been guessed, nothing happens
        if (!guessedLetters.contains(letter)){
                   
            if (!word.contains(letter)){
                
             numberOfFaults++; 
            }
            guessedLetters +=letter;
        }
        
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word

        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 

        // return the hidden word at the end
         String palabraChar="";
        String palabraResultado="";
                
        for (int i=0; i<word.length();i++){
            palabraChar=""+word.charAt(i);
            if (!guessedLetters.contains( palabraChar)){
                palabraResultado +="_";
            }else{
                palabraResultado +=palabraChar;
            }                 
        } 
        return palabraResultado;
    }
}
