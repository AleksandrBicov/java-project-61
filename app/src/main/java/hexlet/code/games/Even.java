package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public final class Even {
    public static void even() {
        final var min = 1;
        final var max = 10;
        String question = " Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] game = new String[Engine.ROUNDS][2];

        for (String[] roundData : game) {
            int randomValue = Utils.generateNumber(min, max);

            roundData[0] = "" + randomValue;
            roundData[1] = randomValue % 2 == 0 ? "yes" : "no";
        }
        Engine.engine(question, game);
    }
}
