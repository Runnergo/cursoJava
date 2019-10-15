
public class RegistrationPlate {

    private final String regCode;// codigo matricula
    private final String country;// Pais de la matricula

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    // Devuelve el codigo de registro de la matricula
    public String getRegCode() {
        return this.regCode;
    }

    // Devuelve el pais de la matricula
    public String getCountry() {
        return this.country;
    }

    // Sobrescribe cadena de texto a printar
    @Override
    public String toString() {
        return country + " " + regCode;
    }

    // sobrescribe metodo equals de la clase Object predefinida,
    // compara  y se asegura de que estamos tratando con un objeto único
    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        
        //  averigua el tipo de objeto con el método getClass()
        // (que se denota en la ojectclase)
        if (getClass() != object.getClass()) {
            return false;
        }
        RegistrationPlate compared = (RegistrationPlate) object;
        if (this.country != compared.getCountry()) {
            return false;
        }
        if (this.regCode == null || !this.regCode.equals(compared.regCode)) {
            return false;
        }
        return true;
    }

    // sobrescribe metodo hascode de la clase Object predefinida
    // que crea un índice basado en la referencia, es necesario editarlo para
    // encontrar diferentes objetos con el mismo resultado
    @Override
    public int hashCode() {
        if (this.regCode == null) {
            return 7;
        }
        return this.country.hashCode() + this.regCode.hashCode();
    }
}
