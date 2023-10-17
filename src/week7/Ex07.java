package week7;

import java.util.ArrayList;
import java.util.Scanner;
public class Ex07 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Dictionary dict = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dict);
        ui.start();

        System.out.println(dict.amountOfWords());
    }
}
