package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public final class Even {
    private Even() {
    }
    public static void even() {
        String question = "Answer 'yes' if the number is input, otherwise answer 'no'.";
        String[][] game = new String[Engine.ROUNDS][2];
        for (int index = 0; index < Engine.ROUNDS; index++) {
            int randomValue = Utils.generateNumber(1, 10);
            game[index][0] = "" + randomValue;
            game[index][1] = isEven(randomValue) ? "yes" : "no";
        }
        Engine.engine(question, game);
    }
    public static boolean isEven(int randomValue) {
        return randomValue % 2 == 0;
    }
}
