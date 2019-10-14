package addalientouml;

public class Explorers extends Alien {

    public Explorers(String name) {
        super.name = name;
    }

    @Override
    public void listen() {
        System.out.println(super.name + " escucha frecuencias altas");
    }

    @Override
    public void eat() {
        System.out.println(super.name + " come 5 veces al dia");
    }

    @Override
    public void play() {
        System.out.println(super.name + " juega de noche");
    }

    @Override
    public void sleep() {
        System.out.println(super.name + " duerme de dia");
    }

    @Override
    public void talk() {
        System.out.println(super.name + " habla por la nariz");
    }

    @Override
    public void createPrograms() {
        System.out.println(super.name + " crea programas para sistemas cuanticos");
    }

    @Override
    public void study() {
        System.out.println(super.name + " tiene conocimientos de alto nivel");
    }

    @Override
    public void playViolin() {
        System.out.println(super.name + " toca el violin con los pies");
    }
}
