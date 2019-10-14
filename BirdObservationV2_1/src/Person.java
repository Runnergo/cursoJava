
public class Person {

    private String namePerson;
    private String nameBird;

    public Person(String namePerson, String nameBird) {

        this.namePerson = Character.toUpperCase(namePerson.charAt(0)) + namePerson.substring(1, namePerson.length());;
        this.nameBird = Character.toUpperCase(nameBird.charAt(0)) + nameBird.substring(1, nameBird.length());
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public String getNameBird() {
        return nameBird;
    }

    public void setNameBird(String nameBird) {
        this.nameBird = nameBird;
    }

    @Override
    public String toString(){    
        return "The Ornithologist " + namePerson + " has seen a " + nameBird;
    }
}
