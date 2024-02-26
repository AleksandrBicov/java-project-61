package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;
public final class Even {
    private Even() {
    }
    public static void even() {
        Cli.askName();
        String name = Cli.getName();
        final int repeat = 3;
        for (int index = 0; index < repeat; index++) {
            int minValue = 1;
            final int maxValue = 10;
            int randomValue =
                    minValue
                            + (int) (Math.random() * (maxValue - minValue + 1));
            String question =
               "Answer 'yes' if the number is input, otherwise answer 'no'.";
            String expression = "" + randomValue;
            Engine.hello(question, expression);
            Scanner scan = new Scanner(System.in);
            String input;
            input = scan.nextLine();
            input = input.toLowerCase();
            String answer;
            if (randomValue % 2 == 0) {
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

}
