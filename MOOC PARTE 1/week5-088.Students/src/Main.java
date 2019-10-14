
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList< Student>();

        String name = "";
        String studentNumber = "";

        while (true) {
            System.out.print("Name: ");
            name = reader.nextLine();

            if (name.isEmpty()) {
                break;
            } else {
                System.out.print("Student Number: ");
                studentNumber = reader.nextLine();
                list.add(new Student(name, studentNumber));
            }

        }
        for (Student lists : list) {
            System.out.println(lists);
        }
        System.out.println("Give search term: ");
        String search = reader.nextLine();
        System.out.println("Result:");
        for (Student lists : list) {
            if (lists.getName().contains(search)) {
                System.out.println(lists);
            }

        }

    }
}
