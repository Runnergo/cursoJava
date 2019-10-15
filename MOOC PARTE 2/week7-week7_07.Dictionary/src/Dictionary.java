
import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> translator;
    
    public Dictionary(){
        this.translator=new HashMap<String, String>();
    }
    
   public String translate(String word){
       if (translator.containsKey(word)){
        return this.translator.get(word);
       }
       return "Unknown word!";
       
    }
    public void add(String word, String translation){
        this.translator.put(word, translation);
    }
     public int amountOfWords(){
        return this.translator.size();
     }
      public ArrayList<String> translationList(){
        
        ArrayList<String> listWord= new ArrayList<String>();
        for (String lista:translator.keySet()){
        listWord.add(lista +" = "+ translator.get(lista));
        }
        return listWord;
      }
}
