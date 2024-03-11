package hexlet.code;

import java.util.Scanner;

public final class Engine {
    public static final int ROUNDS = 3;
    public static void engine(final String question, final String[][] game) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        for (String[] roundData : game) {
            System.out.println(question);
            System.out.println("Question : " + roundData[0]);
            System.out.println("Your answer: ");

            Scanner scan = new Scanner(System.in);
            String inputString = scan.nextLine();
            inputString = inputString.toLowerCase();

            if (!inputString.equals(roundData[1]))  {
                System.out.println("'" + inputString + "' is wrong answer ;"
                    + "(. Correct answer was" + " '" + roundData[1] + " '.\n"
                    + "Let's try again," + name + "!");
                return;
            }

            System.out.println("Correct!");
        }

        System.out.println("Congratulations," + name + "!");
    }
}
