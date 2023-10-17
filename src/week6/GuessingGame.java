package week6;

import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);

        int guess = 1;


        while (true) {
            System.out.print("Guess " + guess + ": ");
            guess++;
            if (isGreaterThan(average(lowerLimit, upperLimit))) {
                lowerLimit = average(lowerLimit, upperLimit) + 1;
            } else {
                upperLimit = average(lowerLimit, upperLimit);
            }
            if (lowerLimit == upperLimit) {
                System.out.println("The number you're thinking of is " + upperLimit);
                break;
            }

        }

    }

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    public static int howManyTimesHalvable(int number) {

        return (int) (Math.log(number) / Math.log(2)) + 1;
    }

    public boolean isGreaterThan(int value) {

        System.out.println("Is your number greater than " + value + "? (y/n)");

        if (getInput().equals("y")) {
            return true;
        }
        return false;
    }

    public String getInput() {
        return reader.nextLine();
    }

    public int average(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber) / 2;
    }
}
