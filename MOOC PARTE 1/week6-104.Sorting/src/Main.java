
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        // write testcode here
int[] values = {8, 3, 7, 9, 1, 2, 4};
sort(values);
    }

    public static int smallest(int[] values) {
        int numeroMenor = values[0];
        for (int i = 0; i < values.length; i++) {
            if (numeroMenor > values[i]) {
                numeroMenor = values[i];
            }
        }
        return numeroMenor;
    }

    public static int indexOfTheSmallest(int[] values) {

        int indice = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[indice] > values[i]) {
                indice = i;
            }
        }
        return indice;
    }

    public static int indexOfTheSmallestStartingFrom(int[] values, int index) {
     
        for (int i = index; i < values.length; i++) {
            if (values[index] > values[i]) {
                index = i;
            }
        }
        return index;
    }
    public static void swap(int[] values, int index1, int index2) {
        int valor1=values[index1];
        int valor2=values[index2];
        values[index1]=valor2;
        values[index2]=valor1;
    }
   public static void sort(int[] values) {
      // System.out.println(Arrays.toString(values));
        for (int i=0;i<values.length;i++){
            System.out.println(Arrays.toString(values));  
            swap(values,i,indexOfTheSmallestStartingFrom(values, i));
         
                
        }
    }
}
