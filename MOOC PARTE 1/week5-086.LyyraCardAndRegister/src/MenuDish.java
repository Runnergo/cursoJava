
import java.util.Scanner;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Runnergo
 */
public class MenuDish {

    private Scanner input;
    private CashRegister unicafeExactum;
    private Clientes cliente;
    private Person person;
    private String name;
    private double balanceCash;
    private double balanceCard;

   /* public MenuDish(Scanner input, Clientes cliente) {
        this.input = input;
        this.cliente = cliente;

    }*/
     public MenuDish(Scanner input,Clientes clientes,int j) {
       this.input = input;  
        this.name = clientes.getClient(j).getName();
        this.balanceCard=clientes.getClient(j).getbalanceCard();
        this.balanceCash=clientes.getClient(j).getbalanceCash();
     }

    public static int askInt(Scanner input) {
        int ask = input.nextInt();
        return ask;
    }

    public static double askDouble(Scanner input) {
        double ask = input.nextDouble();
        return ask;
    }

    public static String askText(Scanner input) {
        String ask = input.nextLine();
        return ask;
    }

    public static void errorOption() {
        System.out.println("Opcion no valida");
    }

    public static void exit() {
        System.out.println("\ngracias pos su visita");

    }

    public static String dishSelectionn(Scanner input) {
        System.out.println("==================");
        System.out.println("Seleccion de plato");
        System.out.println("------------------");
        System.out.println("1- Económico");
        System.out.println("2- Gourmet");
        System.out.println("3- Salir");
        String dish = "";

        switch (askInt(input)) {
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
        System.out.println("===================");
        String pay = "";
        switch (askInt(input)) {
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

    public static void selctedOption(Scanner input, CashRegister unicafeExactum) {

        String dish = dishSelectionn(input);
        String payMode = payMode(input);

        if (payMode.equals("cash") && dish.equals("economical")) {
            unicafeExactum.payEconomical(cashGivenMenu(input));
        }
        if (payMode.equals("cash") && dish.equals("gourmet")) {
            unicafeExactum.payGourmet(cashGivenMenu(input));
        }
       /* if (payMode.equals("card") && dish.equals("economical")) {
            unicafeExactum.payEconomical(balanceCard);
        }
        if (payMode.equals("card") && dish.equals("gourmet")) {
            unicafeExactum.payGourmet(user.getbalanceCard());
        }*/
    }

    public static double cashGivenMenu(Scanner input) {
        System.out.println("Importe en efectivo: ");
        double cashGiven = askDouble(input);
        return cashGiven;
    }

}
