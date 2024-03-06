package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Prime {
    private Prime() {
    }
    public static void prime() {
//        Cli.askName();
//        final int repeat = 3;
//        for (int index = 0; index < repeat; index++) {
//            int randomValue = Utils.generateNumber(1, 500);
//            String question =
//               "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
//            String expression = "" + randomValue;
//            String answer = gamePrime(randomValue);
////            String input = Engine.engine(question, expression, answer);
////            input = input.toLowerCase();
////            if (!input.equals(answer)) {
////                return;
////            }
//        }
    }
    public static String gamePrime(int randomValue) {
        String answer;
        if (isSimple(randomValue)) {
            answer = "yes";
        } else {
            answer = "no";
        }
        return answer;
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
