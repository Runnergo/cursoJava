package addalientouml;

public class Teacher extends Person {

    public Teacher(String name) {
        super.name = name;
    }

    @Override
    public void listen() {
        System.out.println(super.name + " escucha como duermen sus estudiantes en clase");
    }

    @Override
    public void eat() {
        System.out.println(super.name + "comen entre descansos");
    }

    @Override
    public void play() {
        System.out.println(super.name + "juega a ver que estudiante es el primero en echarse a llorar");
    }

    @Override
    public void sleep() {
        System.out.println(super.name + "no duerme en la epoca de examenes");

    }
}
