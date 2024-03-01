package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;
public final class Even {
    private Even() {
    }
    public static void even() {
        Cli.askName();
        final int repeat = 3;
        for (int index = 0; index < repeat; index++) {
        int randomValue = Utils.generateNumber(1, 10);
        String question = "Answer 'yes' if the number is input, otherwise answer 'no'.";
        String expression = "" + randomValue;
        String answer = gameEven(randomValue);
        String input = Engine.engine(question, expression, answer,index);
        if (!input.equals(answer)){
            return;
        }
        }
    }
    public static String gameEven(int randomValue) {
        String answer;
        if (randomValue % 2 == 0) {
            answer = "yes";
        } else {
            answer = "no";
        }
        return answer;
    }
}
