
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }

    // Devuelve verdadero si el automóvil no tenía dueño
    // si tenía un dueño, el método devuelve falso y no hace nada
    public boolean add(RegistrationPlate plate, String owner) {
        if (this.owners.containsKey(plate)) {
            return false;
        }
        this.owners.put(plate, owner);
        return true;
    }

    // devuelve el propietario del automóvil que corresponde
    // al número de registro del parámetro
    // Si el auto no fue registrado, regresa null
    public String get(RegistrationPlate plate) {
        if (this.owners.containsKey(plate)) {
            return owners.get(plate);
        }
        return null;
    }

    // Eliminan la información conectada a la placa de registro
    // devuelve verdadero si se eliminó la información
    // y falso si no había información
    public boolean delete(RegistrationPlate plate) {
        if (this.owners.containsKey(plate)) {
            this.owners.remove(plate);
            return true;
        }
        return false;
    }

    // Imprime todas las placas de registro almacenadas
    public void printRegistrationPlates() {
        for (RegistrationPlate plates : owners.keySet()) {
            System.out.println(plates);
        }
    }

    // Imprime todos los propietarios de automóviles almacenados
    // solo una vez
    public void printOwners() {
        ArrayList<String> ownersCar = new ArrayList<String>();

        for (String lista : owners.values()) {
            if (!ownersCar.contains(lista)) {
                ownersCar.add(lista);
                System.out.println(lista);
            }
        }
    }
}
