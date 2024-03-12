package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class  Calc {
    public static void calc() {
        final var min = 1;
        final var max = 10;
        final var minChar = 0;
        final var maxChar = 2;
        String question = "What is the result of the expression?";
        String[][] game = new String[Engine.ROUNDS][2];

        for (String[] roundData : game) {
            int randomValue = Utils.generateNumber(min, max);
            int randomValue1 = Utils.generateNumber(min, max);
            int randomOperator = Utils.generateNumber(minChar, maxChar);
            final char[] operators = {'+', '-', '*'};

            roundData[0] =randomValue + " " + operators[randomOperator] + " " + randomValue1;
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
                System.out.println("Unknown operator: " + operator);
        }
        return answer;
    }
}
