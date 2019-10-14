package addalientouml;

public abstract class Alien implements AlienAction, HumanAction, Action {

    protected String name;

    @Override
    public abstract void listen();

    @Override
    public abstract void eat();

    @Override
    public abstract void play();

    @Override
    public abstract void sleep();

    @Override
    public abstract void talk();

    @Override
    public abstract void createPrograms();

    @Override
    public abstract void study();

    @Override
    public abstract void playViolin();

    public void telequinesia() {
        System.out.println(name + " levita objetos");
    }

    public void curarHeridas() {
        System.out.println(name + " cura heridas tocando al enfermo");
    }

    public void fluorescencia() {
        System.out.println(name + " brilla a voluntad");
    }
}
