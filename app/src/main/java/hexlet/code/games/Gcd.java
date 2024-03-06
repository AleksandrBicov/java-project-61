package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public final class Gcd {
    private Gcd() {
    }
    public static void gcd() {
        Engine.askName();
        String question =
                "Find the greatest common divisor of given numbers.";
        final int repeat = 3;
        final int finalGenerate = 100;
        String[][] game = new String[repeat][2];
        for (int index = 0; index < repeat; index++) {
            int randomValue = Utils.generateNumber(1, finalGenerate);
            int randomValue1 = Utils.generateNumber(1, finalGenerate);
            game[index][0] = randomValue + " " + randomValue1;
            game[index][1] = gameGcd(randomValue, randomValue1);
        }
            Engine.engine(question, game);
    }
    public static String gameGcd(int randomValue, int randomValue1) {
        while (randomValue != 0) {
            int tmp = randomValue1 % randomValue;
            randomValue1 = randomValue;
            randomValue = tmp;
        }
        String answer = "" + randomValue1;
        return answer;
    }
}


