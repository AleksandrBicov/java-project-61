package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public final class Even {
    private Even() {
    }
    public static void even() {
        Engine.askName();
        String question = "Answer 'yes' if the number is input, otherwise answer 'no'.";
        String[][] game = new String[Engine.ROUNDS][2];
        for (int index = 0; index < Engine.ROUNDS; index++) {
            int randomValue = Utils.generateNumber(1, 10);
            game[index][0] = "" + randomValue;
            game[index][1] = gameEven(randomValue);
        }
        Engine.engine(question, game);
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
