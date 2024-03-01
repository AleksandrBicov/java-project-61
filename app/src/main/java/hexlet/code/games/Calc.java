package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;

public final class  Calc {
    private Calc() {
    }
    public static void calc() {
        Cli.askName();
        final int repeat = 3;
        for (int index = 0; index < repeat; index++) {
            int randomValue = Utils.generateNumber(1, 10);
            int randomValue1 = Utils.generateNumber(1, 10);
            int randomOperator = Utils.generateNumber(1, 3);
            char operator = " +-*".charAt(randomOperator);
            String question = "What is the result of the expression?";
            String expression = "" + randomValue + operator + randomValue1;
            int answer = gameCalc(randomValue, randomValue1, operator);
            int input = Engine.engine(question, expression, answer,index);
            if (input != answer) {
                return;
            }
        }
    }
    public static int gameCalc(int randomValue,int randomValue1,char operator ){
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
