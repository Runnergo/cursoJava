package addalientouml;

public abstract class Person implements HumanAction, Action {

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
    public void talk() {
        System.out.println(name + " habla de conceptos tecnicos");
    }

    @Override
    public void createPrograms() {
        System.out.println(name + " crea programas java en clase ");
    }

    @Override
    public void study() {
        System.out.println(name + " tiene que estudiar mucho para estar al dia");
    }

    @Override
    public void playViolin() {
        System.out.println(name + " no toca el violin pero si el trombon");
    }
}
