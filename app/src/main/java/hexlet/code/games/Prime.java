package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Prime {
    public static void prime() {
        final var min = 1;
        final var max = 500;
        String question =
                "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] game = new String[Engine.ROUNDS][2];

        for (String[] roundData : game) {
            int randomValue = Utils.generateNumber(min, max);
            roundData[0] = "" + randomValue;
            roundData[1] = isSimple(randomValue) ? "yes" : "no";
        }

        Engine.engine(question, game);
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
