package hexlet.code;

import java.util.Scanner;

public final class Engine {
    private Engine() {
    }
    public static String engine(String question,String expression,String answer,int index) {
        String name = Cli.getName();
        hello(question,expression);
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        inputString = inputString.toLowerCase();
        if (!inputString.equals(answer))  {
            Engine.loose(inputString, answer, name);
            return inputString;
        }
        System.out.println("Correct!");
        Congratulations(index);
        return inputString;
    }
    public static int engine(String question,String expression,int answer,int index) {
        String name = Cli.getName();
        hello(question,expression);
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        String inputString = "" + input ;
        String answerToString = "" + answer;
        if (input != answer) {
            Engine.loose(inputString, answerToString, name);
            return input;
        }
        System.out.println("Correct!");
        Congratulations(index);
        return input;
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
    public static void Congratulations(int index) {
        String name = Cli.getName();
        final int repeat = 2;
        if (index == repeat) {
            System.out.println("Congratulations," + name + "!");
        }
    }
}
