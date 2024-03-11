package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Gcd {
    public static void gcd() {
        String question =
                "Find the greatest common divisor of given numbers.";
        final var min = 1;
        final var max = 100;
        String[][] game = new String[Engine.ROUNDS][2];

        for (String[] roundData : game) {
            int randomValue = Utils.generateNumber(min, max);
            int randomValue1 = Utils.generateNumber(min, max);

            roundData[0] = randomValue + " " + randomValue1;
            roundData[1] = String.valueOf(gameGcd(randomValue, randomValue1));
        }

        Engine.engine(question, game);
    }
    public static int gameGcd(int randomValue, int randomValue1) {
        while (randomValue != 0) {
            int tmp = randomValue1 % randomValue;
            randomValue1 = randomValue;
            randomValue = tmp;
        }
        return randomValue1;
    }
}


