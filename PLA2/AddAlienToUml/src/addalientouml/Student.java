package addalientouml;

public class Student extends Person {

    public Student(String name) {
        super.name = name;
    }

    @Override
    public void listen() {
        System.out.println(super.name + " escucha en clase");
    }

    @Override
    public void eat() {
        System.out.println(super.name + " comme comida basura");
    }

    @Override
    public void play() {
        System.out.println(super.name + " juega al ordenador");
    }

    @Override
    public void sleep() {
        System.out.println(super.name + " duerme pocas horas de tanto que estudia");

    }
}
