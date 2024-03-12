package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Progression {

    public static void progression() {
        final var min = 1;
        final var max = 10;
        final int progressionLength = 10;
        String question = "What number is missing in the progression?";
        String[][] game = new String[Engine.ROUNDS][2];

        for (String[] roundData : game) {
            int hiddenMemberIndex = Utils.generateNumber(min, max - 1);
            int first = Utils.generateNumber(min, max);
            int step = Utils.generateNumber(min, max);
            String[] progression = makeProgression(first, step, progressionLength);
            String answer = progression[hiddenMemberIndex];
            progression[hiddenMemberIndex] = "..";

            roundData[0] = String.join(" ", progression);
            roundData[1] = answer;
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
