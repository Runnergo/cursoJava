package addalientouml;

public class Invaders extends Alien {

    public Invaders(String name) {
        super.name = name;
    }

    @Override
    public void listen() {
        System.out.println(super.name + " ha perdido oido por efecto de las guerras");
    }

    @Override
    public void eat() {
        System.out.println(super.name + " come 8 veces al dia");
    }

    @Override
    public void play() {
        System.out.println(super.name + " no juegan nunca");
    }

    public void sleep() {
        System.out.println(super.name + " duerme por turnos");
    }

    public void talk() {
        System.out.println(super.name + " habla de batallitas");
    }

    public void createPrograms() {
        System.out.println(super.name + " no sabe programar");
    }

    public void study() {
        System.out.println(super.name + " tiene conocimientos muy basicos");
    }

    public void playViolin() {
        System.out.println(super.name + " odia a la gente que toca el violin");
    }
}
