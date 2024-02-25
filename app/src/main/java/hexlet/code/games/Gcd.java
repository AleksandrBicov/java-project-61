package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public final class Gcd {
    private Gcd() {
    }
    public static void gcd() {
        Cli.askName();
        String name = Cli.getName();
        final int minValue = 1;
        final int maxValue = 100;
        final int repeat = 3;
        for (int i = 0; i < repeat; i++) {
            int randomValue =
                minValue + (int) (Math.random() * (maxValue - minValue + 1));
            int randomValue1 =
                minValue + (int) (Math.random() * (maxValue - minValue + 1));
            String question =
                "Find the greatest common divisor of given numbers.";
            String expression =  randomValue + " " + randomValue1;
            Engine.hello(question, expression);
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            while (randomValue != 0) {
                int tmp = randomValue1 % randomValue;
                randomValue1 = randomValue;
                randomValue = tmp;
            }
            String inputToString = "" + input;
            String answerToString = "" + randomValue1;
            if (input != randomValue1) {
                Engine.loose(inputToString, answerToString, name);
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations," + name + "!");
    }

}


