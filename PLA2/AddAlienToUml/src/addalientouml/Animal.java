package addalientouml;

public abstract class Animal implements Action {

    protected String name;

    @Override
    public void listen() {
        System.out.println("El " + name + " tiene el oido muy fino");
    }

    @Override
    public abstract void eat();

    @Override
    public void play() {
        System.out.println("El " + name + " es muy jugueton");
    }

    @Override
    public abstract void sleep();

}
