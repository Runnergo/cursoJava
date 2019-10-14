package addalientouml;

public class Cat extends Animal {

    public Cat(String name) {

        super.name = name;
    }

    @Override
    public void sleep() {
        System.out.println("El " + super.name + " dueme en cualquier rincon");
    }

    @Override
    public void eat() {
        System.out.println("El " + super.name + " come comida enlatada");
    }
}
