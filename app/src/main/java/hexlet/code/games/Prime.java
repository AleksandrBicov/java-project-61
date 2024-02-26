package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public final class Prime {
    private Prime() {
    }
    public static void prime() {
        Cli.askName();
        String name = Cli.getName();
        final int minValue = 1;
        final int maxValue = 500;
        final int repeat = 3;
        for (int i = 0; i < repeat; i++) {
            int randomValue =
                minValue + (int) (Math.random() * (maxValue - minValue + 1));
            String question =
               "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
            String expression = "" + randomValue;

            Engine.hello(question, expression);

            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();

            input = input.toLowerCase();
            String answer;

            if (isSimple(randomValue)) {
                answer = "yes";
            } else {
                answer = "no";
            }

            if (!input.equals(answer)) {
                Engine.loose(input, answer, name);
                return;
            }

            System.out.println("Correct!");
        }
        System.out.println("Congratulations," + name + "!");
    }
    public static boolean isSimple(final int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
