
import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write test code here
        CashRegister unicafeExactum = new CashRegister();
        LyyraCard cardOfJim=new LyyraCard(200);
        Scanner input=new Scanner(System.in);
        Menu inputMenu = new Menu(input);
        MyDateCard dateCard =new MyDateCard(12,2000);
        ArrayList<Person> user=new ArrayList<Person>();
      
        LocalDate date=LocalDate.now();
        MyDateCard currentDate=new MyDateCard(date);
        
        //dateCard.setDate(6, 1999);
   
      
    
     Menu.selctedOption(input, unicafeExactum, cardOfJim);
      System.out.println(Menu.payMode(input));
       System.out.println(Menu.dishSelectionn(input));
 
      /*  System.out.println("the card balance " + cardOfJim.balance() + " euros");

        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);
         System.out.println("Recarga: 100");
        unicafeExactum.loadMoneyToCard(cardOfJim, 100);

        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        System.out.println( unicafeExactum );
        */
    }

   
}