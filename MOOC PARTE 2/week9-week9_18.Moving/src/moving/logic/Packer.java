/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;



public class Packer {
    
    private int boxesVolume;
    
    public Packer(int boxesVolume){
        this.boxesVolume=boxesVolume;
    }
    public List<Box> packThings(List<Thing> things){
        
        ArrayList<Box> boxes= new ArrayList<Box>();
        
            for (Thing list:things){
                Box box = new Box(boxesVolume);
                if (box.addThing(list)){
                    boxes.add(box);
                }
            }
       return boxes;
        
    }
}
