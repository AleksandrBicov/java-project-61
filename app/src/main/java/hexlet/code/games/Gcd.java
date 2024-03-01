package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;
import java.util.Scanner;

public final class Gcd {
    private Gcd() {
    }
    public static void gcd() {
        Cli.askName();
        String name = Cli.getName();
        final int repeat = 3;
        for (int index = 0; index < repeat; index++) {
            int randomValue = Utils.generateNumber(1, 100);
            int randomValue1 = Utils.generateNumber(1, 100);
            String question =
                "Find the greatest common divisor of given numbers.";
            String expression =  randomValue + " " + randomValue1;
            int answer = gameGcd(randomValue, randomValue1);
            int input = Engine.engine(question, expression, answer,index);
            if (input != answer) {
                return;
            }
        }
    }
    public static int gameGcd(int randomValue, int randomValue1){
        while (randomValue != 0) {
            int tmp = randomValue1 % randomValue;
            randomValue1 = randomValue;
            randomValue = tmp;
        }
        return randomValue1;
    }
}


