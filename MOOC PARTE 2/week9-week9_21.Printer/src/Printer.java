
import java.io.File;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Runnergo
 */
public class Printer {

    private File fileName;

    public Printer(String fileName) throws Exception {
        this.fileName = new File(fileName);
    }

    public void printLinesWhichContain(String word)throws Exception {

        Scanner reader = new Scanner(fileName, "UTF-8");

        while (reader.hasNext()) {
            String line = reader.nextLine();

            if (line.contains(word)) {
               System.out.println(line);
            }
        }
    }
}
