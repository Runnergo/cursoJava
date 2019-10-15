
    
import java.util.ArrayList;
import java.util.Collections;


public class Hand implements Comparable<Hand>{
   private ArrayList<Card> cards;
   
    public Hand(){
        
     this.cards=new ArrayList<Card>();   
    }
    public void add(Card card){
        cards.add(card);
    }
    public void print(){
        for (Card list:cards){
        System.out.println(list);   
        }
    }
    public void sort(){
        Collections.sort(cards); 
    }
    public int compareTo(Hand hand){
        int localScore=0;
        int visitorScore=0;
        for (Card list: cards){
            localScore += list.getValue();
        }
        for (Card list: hand.cards){
            visitorScore += list.getValue();
        }
        return   localScore - visitorScore;
    }
    public void sortAgainstSuit(){
      Collections.sort(this.cards, new SortAgainstSuitAndValue());
  
    }
}


