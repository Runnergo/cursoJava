
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        
        // crea tres objetos (matricula)
        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        // Crea una ArralyList LOCAL con las dos primeras matriculas
        ArrayList<RegistrationPlate> finnish = new ArrayList<RegistrationPlate>();
        finnish.add(reg1);
        finnish.add(reg2);

        // Crea una nueva matricula y la compara con las de la ArrayList
        // si no la contine, la añadira a la lista
        RegistrationPlate newPlate = new RegistrationPlate("FI", "ABC-123");

        if (!finnish.contains(newPlate)) {
            finnish.add(newPlate);
        }

        // Printa ArrayList 
        System.out.println("Finnish: " + finnish);
        // Si el método equals no se ha sobrescrito, 
        // la misma placa de registro se repite en la lista

        // Añade los propietarios a los vehiculos
        HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
        owners.put(reg1, "Arto");
        owners.put(reg3, "Jürgen");

        // Printa a los propietarios de la matriculas por parametro
        System.out.println("owners:");
        System.out.println(owners.get(new RegistrationPlate("FI", "ABC-123")));
        System.out.println(owners.get(new RegistrationPlate("D", "B WQ-431")));
        // Si el hashCode no se ha sobrescrito, no se encuentran los propietarios
    }
}
