package file;

import java.io.File;
import java.util.Scanner;

public class Analysis {

    private File file;

    public Analysis(File file) {

        this.file = file;
    }

    public int lines() throws Exception {

        Scanner reader = new Scanner(file, "UTF-8");
        int numeroLineas = 0;
        
        while (reader.hasNext()) {
            numeroLineas++;
            reader.nextLine();
        }
        return numeroLineas;
    }

    public int characters() throws Exception{
        Scanner reader = new Scanner(file, "UTF-8");
        int numeroChar = 0;
        while (reader.hasNext()) {
            String word = reader.nextLine();
            numeroChar += word.length()+1;
        }
        return numeroChar;
    }
}

