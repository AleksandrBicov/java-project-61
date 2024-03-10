package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class  Calc {
    public static void calc() {
        final int finalGenerate = 10;
        String question = "What is the result of the expression?";
        String[][] game = new String[Engine.ROUNDS][2];

        for (String[] roundData : game) {
            int randomValue = Utils.generateNumber(1, finalGenerate);
            int randomValue1 = Utils.generateNumber(1, finalGenerate);
            int randomOperator = Utils.generateNumber(0, 2);
            final char[] operators = {'+', '-', '*'};

            roundData[0] = "" + randomValue + operators[randomOperator] + randomValue1;
            roundData[1] = String.valueOf(gameCalc(randomValue, randomValue1, operators[randomOperator]));
        }

        Engine.engine(question, game);
    }
    public static int gameCalc(final int randomValue, final int randomValue1,
                                  final char operator) {
        int answer = 0;
        switch (operator) {
            case ('+'):
                answer = randomValue + randomValue1;
                break;
            case ('-'):
                answer = randomValue - randomValue1;
                break;
            case ('*'):
                answer = randomValue * randomValue1;
                break;
            default:
                break;
        }
        return answer;
    }
}
