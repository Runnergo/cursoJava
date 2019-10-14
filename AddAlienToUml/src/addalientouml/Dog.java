package addalientouml;

public class Dog extends Animal {

    public Dog(String name) {
        super.name = name;
    }

    @Override
    public void sleep() {
        System.out.println("El " + super.name + " dueme despues de dar cuatro vueltas al su alrededor");
    }

    @Override
    public void eat() {
        System.out.println("El " + super.name + " come bolas nutricionales");
    }
}
