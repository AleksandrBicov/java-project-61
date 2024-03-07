package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class  Calc {
    private Calc() {
    }
    public static void calc() {
        final int finalGenerate = 10;
        String question = "What is the result of the expression?";
        String[][] game = new String[Engine.ROUNDS][2];
        for (int index = 0; index < Engine.ROUNDS; index++) {
            int randomValue = Utils.generateNumber(1, finalGenerate);
            int randomValue1 = Utils.generateNumber(1, finalGenerate);
            int randomOperator = Utils.generateNumber(1, Engine.ROUNDS);
            char operator = " +-*".charAt(randomOperator);
            game[index][0] = "" + randomValue + operator + randomValue1;
            game[index][1] = gameCalc(randomValue, randomValue1, operator);
        }
        Engine.engine(question, game);

    }
    public static String gameCalc(final int randomValue, final int randomValue1,
                                  final char operator) {
        int answer = 0;
        String answerToString;
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
        answerToString = "" + answer;
        return answerToString;
    }
}
