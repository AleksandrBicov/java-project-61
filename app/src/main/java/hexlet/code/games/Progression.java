package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Arrays;
final public class Progression {

    private Progression() {
    }
    public static void progression() {
        final int PROGRESSION_LENGTH = 10;
        String question = "What number is missing in the progression?";
        String[][] game = new String[Engine.ROUNDS][2];
        for (int index = 0; index < Engine.ROUNDS; index++) {
            int hiddenMemberIndex = Utils.generateNumber(1, 10);
            int first = Utils.generateNumber(1, 10);
            int step = Utils.generateNumber(1, 10);
            String[] progression = makeProgression(first, step, PROGRESSION_LENGTH);
            progression[hiddenMemberIndex] = "..";
            game[index][0] = String.join(" ", progression);
            game[index][1] = hiddenMemberIndex * step + first + "";
        }

        Engine.engine(question, game);
    }
    private static String[] makeProgression(int first, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i += 1) {
            progression[i] = Integer.toString(first + i * step);
        }
        return progression;
    }
}
