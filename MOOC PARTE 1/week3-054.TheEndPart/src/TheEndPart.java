import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
         System.out.print("Type a word: ");
		String word=reader.nextLine();
		
		System.out.print("Length of the first part: ");
		int firstLetter=Integer.parseInt(reader.nextLine());
		String result=word.substring(word.length()-firstLetter);
		System.out.print("Result: "+result);
	}
}
