
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);
        int[] reverse = reverseCopy(original);

        // change the copied
        copied[0] = 99;

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("copied: " + Arrays.toString(copied));
        System.out.println("copied: " + Arrays.toString(reverse));

    }

    public static int[] copy(int[] array) {
        int[] arrayCopy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
        }
        return arrayCopy;
    }

    public static int[] reverseCopy(int[] array) {
        int[] arrayReverse = new int[array.length];
        int j = array.length;
        for (int i = 0; i < array.length; i++) {
            j--;
            arrayReverse[i] = array[j];

        }
        return arrayReverse;
    }
}
