package week3;
import java.util.Scanner;
public class Ex53 {
    public static void main(String[] args) {
        Scanner skanneerija = new Scanner(System.in);

        System.out.print("Type a word: ");
        String word = skanneerija.nextLine();

        System.out.print("Length of the first part: ");
        int length = Integer.parseInt(skanneerija.nextLine());

        if (length <= word.length()) {
            String result = word.substring(0, length);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid input: Length is greater than the word length.");
        }

        skanneerija.close();
    }
}
