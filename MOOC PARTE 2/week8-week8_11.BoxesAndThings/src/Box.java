
import java.util.ArrayList;


public class Box implements ToBeStored{
    
    // Atributos de peso maximo de la caja 
    // y el peso de los objetos dentro de ella
    private double weightMax;
    private ArrayList<ToBeStored> weightItemsInBox;
    
    public Box(double weightMax){
        this.weightMax=weightMax;
        this.weightItemsInBox=new ArrayList<ToBeStored>();
    }
    
    // Metodo implementado el cual devuelve la suma
    // de los pesos de todos los items 
    @Override
    public double weight(){
        double weightSum=0;
        for (ToBeStored items:weightItemsInBox){
            weightSum += items.weight();
        }
        return weightSum;
    }
 
    // Añade el peso de un item a la Array,
    // si este no supera el peso maximo de la caja
    public void add(ToBeStored store){
        if (this.weight()+store.weight()<=this.weightMax){
            weightItemsInBox.add(store);
        }
    }
 
    // toString sobrescrito de la caja
    @Override
    public String toString(){
        return "Box: "+weightItemsInBox.size()+" things, total weight "+weight()+" kg";
    }
}
