
public class Person {

    private String namePerson;
    private String nameBird;

    public Person(String namePerson, String nameBird) {

        this.namePerson = namePerson;
        this.nameBird = nameBird;
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
    public String toString() {
        return "The Ornithologist: " + getNamePerson() + " has seen a " + getNameBird();
    }
}
