package moving.domain;

import java.util.ArrayList;

public class Box implements Thing {

    private int maximunCapacity;
    private ArrayList<Thing> things;

    public Box(int maximumCapacity) {
        this.maximunCapacity = maximumCapacity;
        this.things = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing) {
        if (this.getVolume() + thing.getVolume() > maximunCapacity) {
            return false;
        }
        things.add(thing);
        return true;
    }

    public int getVolume() {
        int boxVolume = 0;
        for (Thing list : things) {
            boxVolume += list.getVolume();
        }
        return boxVolume;
    }
}
