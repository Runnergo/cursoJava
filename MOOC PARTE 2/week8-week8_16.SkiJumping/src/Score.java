
import java.util.ArrayList;
import java.util.Collections;

public class Score {

    private ArrayList<Integer> votos;
    private int sumaVotos;
    private int length;

    public Score() {
        this.votos = new ArrayList<Integer>();
        this.sumaVotos=0;
        this.length=0;
    }

    public int getLength() {
        length= Utiles.azar(120, 60);
        return length;
    }

    public ArrayList<Integer> getVotos() {
        return votos;
    }

    public int getSumaVotos() {
        return sumaVotos;
    }

    public void crearVotos(int numVotos) {
       
        for (int i = 0; i < numVotos; i++) {
            int voto=Utiles.azar(20, 10);
            votos.add(voto);   
        }
       
    }
    public int sumaVotos() {
       sumaVotos=0;
       
        Collections.sort(votos);
        for (int i=1; i<votos.size()-1;i++){
         sumaVotos += votos.get(i);
        }
        return sumaVotos;
    }

    public ArrayList printVotos() {
        return votos;
    }





}
