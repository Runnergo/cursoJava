package addalientouml;

public class Main {

    public static void main(String[] args) {

        Animal perro = new Dog("Perro");
        Animal gato = new Cat("Gato");

        Person student = new Student("Juan");
        Person teacher = new Teacher("Albert");

        Alien explores = new Explorers("ET");
        Alien invaders = new Invaders("Predator");

        explores.eat();
        invaders.fluorescencia();

        teacher.createPrograms();
        gato.listen();
    }
}
