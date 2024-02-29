package hexlet.code;

import hexlet.code.games.Calc;

import java.util.Scanner;

public final class Engine {
    private Engine() {
    }
    public static int engine(String question,String expression,int answer,int index) {
        final int repeat = 2;
        String name = Cli.getName();
        System.out.println(question);
        System.out.println("question : " + expression);
        System.out.println("Your answer: ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        String inputToString = "" + input;
        String answerToString = "" + answer;
        boolean result = input != answer;
        if (result) {
            Engine.loose(inputToString, answerToString, name);
            return input;
        }
        System.out.println("Correct!");
        if (index == repeat) {
        System.out.println("Congratulations," + name + "!");
        }
        return input;
    }
    public static void hello(final String question, final String expression) {
        System.out.println(question);
        System.out.println("question : " + expression);
        System.out.println("Your answer: ");

    }
    public static void loose(final String even,
                             final String answer, final String name) {
        System.out.println("'" + even + "' is wrong answer ;"
                + "(. Correct answer was" + " '" + answer + " '.\n"
                + "Let's try again," + name + "!");
    }
}
