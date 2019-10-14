/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mati
 */
import java.util.Scanner;

public class Menu {

    private Scanner input;
    private CashRegister unicafeExactum;
    

    public Menu(Scanner input, CashRegister unicafeExactum) {
        this.input = input;
        this.unicafeExactum = unicafeExactum;
                    
    }
    
     public Menu(Scanner input) {
        this.input = input;
        
      
               
    }

    public static int ask(Scanner input) {
        int ask = input.nextInt();
        return ask;
    }

    public static String dishSelectionn(Scanner input) {
        System.out.println("==================");
        System.out.println("Seleccion de plato");
        System.out.println("------------------");
        System.out.println("1- Económico");
        System.out.println("2- Gourmet");
        System.out.println("3- Salir");
        String dish = "";

        switch (ask(input)) {
            case 1:
                dish = "economical";
                break;
            case 2:
                dish = "gourmet";
                break;
            case 3:
                exit();
                break;
            default:
                errorOption();

        }
        return dish;
    }

    public static String payMode(Scanner input) {
        System.out.println("===================");
        System.out.println("1- Pago efectivo");
        System.out.println("2- Pago con tarjeta");

        String pay = "";
        switch (ask(input)) {
            case 1:
                pay = "cash";
                break;
            case 2:
                pay = "card";
                break;
            default:
                errorOption();
        }
        return pay;
    }

    public static void errorOption() {
        System.out.println("Opcion no valida");
    }

    public static void exit() {
        System.out.println("\ngracias pos su visita");

    }

    public static double cashGivenMenu(Scanner input) {
        System.out.println("Importe en efectivo: ");
        double cashGiven = ask(input);
        return cashGiven;
    }

    public static void selctedOption(Scanner input, CashRegister unicafeExactum,LyyraCard cardOfJim) {
        String payMode = payMode(input);
        String dish = dishSelectionn(input);
        
        System.out.println(payMode+dish);
       

        if (payMode.equals("cash") && dish.equals("economical")) {      
            unicafeExactum.payEconomical(cashGivenMenu(input));
        }
        if (payMode.equals("cash") && dish.equals("gourmet")) {
            unicafeExactum.payGourmet(cashGivenMenu(input));
        }
        if (payMode.equals("card") && dish.equals("economical")) {
            unicafeExactum.payEconomical(cardOfJim);
        }
        if (payMode.equals("card") && dish.equals("gourmet")) {
            unicafeExactum.payGourmet(cardOfJim);
        }
    }

   

   

}
