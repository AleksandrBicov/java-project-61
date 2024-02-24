package hexlet.code;

import java.util.Scanner;

final class  Calc {
    private Calc() {
    }
    public static void calc() {
        Cli.askName();
        String name = Cli.getName();
        final int minValue = 1;
        final int maxValue = 10;
        final int maxOperator = 3;
        final int repeat = 3;
        for (int i = 0; i < repeat; i++) {
        int randomValue =
            minValue + (int) (Math.random() * (maxValue - minValue + 1));
        int randomValue1 =
            minValue + (int) (Math.random() * (maxValue - minValue + 1));
        int randomOperator =
            minValue + (int) (Math.random() * (maxOperator - minValue + 1));
        char operator = " +-*".charAt(randomOperator);
        System.out.println("Question : " + randomValue
                + operator + randomValue1);
        System.out.println("Your answer: ");
        Scanner scan = new Scanner(System.in);
        int calc = scan.nextInt();
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
        if (calc != answer) {
            System.out.println("'" + calc + "' is wrong answer ;"
                    + "(. Correct answer was" + " '" + answer + " '.\n"
                    + "Let's try again," + name + "!");
            return;
        }
        System.out.println("Correct!");
        }
        System.out.println("Congratulations," + name + "!");
    }
}
