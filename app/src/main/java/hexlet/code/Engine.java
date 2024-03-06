package hexlet.code;

import java.util.Scanner;

public final class Engine {
    private Engine() {
    }
    public static void engine(final String question, final String game[][]) {
        String name = Engine.name;
        final int repeat = 3;
        for (int index = 0; index < repeat; index++) {
        hello(question, game[index][0]);
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        inputString = inputString.toLowerCase();
        if (!inputString.equals(game[index][1]))  {
            Engine.loose(inputString, game[index][1], name);
            return;
        }
        System.out.println("Correct!");
       }
        System.out.println("Congratulations," + name + "!");
    }
    private static String name;
    public static void askName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

    }
    public static void hello(final String question, final String expression) {
        System.out.println(question);
        System.out.println("question : " + expression);
        System.out.println("Your answer: ");

    }
    public static void loose(final String even, final String answer, final String name) {
        System.out.println("'" + even + "' is wrong answer ;"
                + "(. Correct answer was" + " '" + answer + " '.\n"
                + "Let's try again," + name + "!");
    }

}
