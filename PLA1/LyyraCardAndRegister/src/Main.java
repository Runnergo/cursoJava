
import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Objetos scanner
        Scanner input = new Scanner(System.in);
        Clientes cliente = new Clientes();
        MenuAltas menu = new MenuAltas(input, cliente);
        // MenuDish menuDish = new MenuDish(input, cliente);
        // Objetos fecha actual
        LocalDate date = LocalDate.now();
        MyDateCard currentDate = new MyDateCard(date);

        // cajero cafeteria
        CashRegister unicafeExactum = new CashRegister();

        // Array de usuarios
        //Person user = new Person();
        //tarjeta del usuario
        MyDateCard dateCard = new MyDateCard(12, 2000);

        //menu.crearCliente(input);
        MenuAltas.crearCliente(input, cliente);
        //String plato=MenuDish.dishSelectionn(input);
        //String pay=MenuDish.payMode(input);
        MenuDish.selctedOption(input, unicafeExactum);
        System.out.println(unicafeExactum);
        //LyyraCard cardUser = new LyyraCard(cliente);
        //dateCard.setDate(6, 1999);
        // Menu.selctedOption(input, unicafeExactum, );
        //System.out.println(Menu.payMode(input));
        //System.out.println(Menu.dishSelectionn(input));

        /*System.out.println("the card balance " + cardUser.balance() + " euros");

        boolean succeeded = unicafeExactum.payGourmet(cardUser);
        System.out.println("payment success: " + succeeded);
        System.out.println("Recarga: 100");
        unicafeExactum.loadMoneyToCard(cardUser, 100);

        succeeded = unicafeExactum.payGourmet(cardUser);
        System.out.println("payment success: " + succeeded);

        System.out.println("the card balance " + cardUser.balance() + " euros");

        System.out.println(unicafeExactum);
         */
    }

}
