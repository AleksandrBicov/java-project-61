package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public final class  Calc {
    private Calc() {
    }
    public static void calc() {
        Cli.askName();
        String name = Cli.getName();
        final int minValue = 1;
        final int maxValue = 10;
        final int maxOperator = 3;
        final int repeat = 3;
        for (int i = 0; i < repeat; i++) {
        int randomValue =
            minValue + (int) (Math.random() * (maxValue - minValue + 1));
        int randomValue1 =
            minValue + (int) (Math.random() * (maxValue - minValue + 1));
        int randomOperator =
            minValue + (int) (Math.random() * (maxOperator - minValue + 1));
        char operator = " +-*".charAt(randomOperator);
            String question = "What is the result of the expression?";
            String expression = ""+ randomValue + operator + randomValue1;
            Engine.hello(question,expression);
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int answer = 0;
            switch (operator) {
                case ('+'):
                    answer = randomValue + randomValue1;
                    break;
                case ('-'):
                    answer = randomValue - randomValue1;
                    break;
                case ('*'):
                    answer = randomValue * randomValue1;
                    break;
                default:
                    break;
            }
            String Input = "" + input;
            String Answer = "" + answer;
        if (input != answer) {
            Engine.loose(Input, Answer, name);
            return;
        }
        System.out.println("Correct!");
        }
        System.out.println("Congratulations," + name + "!");
    }
}
