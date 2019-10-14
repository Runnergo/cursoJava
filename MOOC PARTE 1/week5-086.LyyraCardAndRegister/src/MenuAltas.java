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
import java.util.ArrayList;

public class MenuAltas {

    private Scanner input;
   // private CashRegister unicafeExactum;
    private Clientes clientes;
    private Person person;
    private String name;
    private double balanceCash;
    private double balanceCard;

    //public Menu(Scanner input, CashRegister unicafeExactum) {
    //   this.input = input;
    //   this.unicafeExactum = unicafeExactum;
    //}
    public MenuAltas(Scanner input, Clientes clientes) {
        this.input = input;
        this.clientes = clientes;

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

    public void errorOption() {
        System.out.println("Opcion no valida");
    }



    public static void  crearCliente(Scanner input,Clientes clientes) {

        while (true) {

            printMenuAltas();
            System.out.print("Elige opcion: ");
            int ask = askInt(input);
            System.out.print("---------------\n");

            if (ask == 1) {//---------OPCION 1 MENU ALTAS----------

                System.out.print("Nombre Cliente: ");
                askText(input);
                String name = askText(input);

                System.out.print("Balance en card: ");
                double balanceCard = askDouble(input);
                clientes.addClient(name, 200, balanceCard);
                name = "";
                System.out.println("-------------------");
                System.out.println("Registro completado\n");

            }
            if (ask == 2) {//---------OPCION 3 MENU ALTAS----------
                System.out.print("Nombre Cliente: ");
                askText(input);
                String name = askText(input);
                int j = clientes.search(name);
                int k = j + 1;
                System.out.print("Cliente Nº " + k + " " + clientes.getClient(j) + "\nBORRADO REGISTRO\n\n");
                clientes.deleteClient(j);
                
            }

            if (ask == 3) {//---------OPCION 2 MENU ALTAS----------

                System.out.print("Nombre Cliente: ");
                askText(input);
                String name = askText(input);
                int j = clientes.search(name);
                System.out.print("Cliente Nº " + (j+1));
           
               
                MenuDish clienteActual=new MenuDish(input,clientes,j);
                System.out.println(clientes.getClient(j).getName());
               return ;
            }
            if (ask == 4) {//---------OPCION 3 MENU ALTAS----------

                System.out.println("\n" + clientes.getClientes());
            }

            if (ask == 5) {//---------OPCION 5 MENU ALTAS----------

                System.out.println(clientes.getClientAll());
            }
       
        }
        
    }

    public static void printMenuAltas() {
        System.out.println("=============");
        System.out.println("   Cliente");
        System.out.println("=============");
        System.out.println("\n1- Añadir cliente");
        System.out.println("2- Borrar cliente");
        System.out.println("3- Compra cliente");
        System.out.println("4- Listado clientes completo");
        System.out.println("5- Lista nombres de clientes");
      

    }

}
