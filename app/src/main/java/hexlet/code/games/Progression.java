package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import java.util.Arrays;
import java.util.Scanner;

final public class Progression {
    private Progression() {
  }
    public static void progression() {
        Cli.askName();
        String name = Cli.getName();
        final int minValue = 1;
        final int maxValue = 9;
        final int repeat = 3;

        for (int i = 0; i < repeat; i++) {
            int[] array = new int[10];
            int randomValue =
              minValue + (int) (Math.random() * (maxValue - minValue + 1));
            int randomValue1 =
              minValue + (int) (Math.random() * (maxValue - minValue + 1));
            int randomValue2 =
              minValue + (int) (Math.random() * (maxValue - minValue + 1));

            array[0] = randomValue1;
            for (int j = 1; j < 10; j++) {
                array[j] = randomValue + array[j - 1];
            }
            array[randomValue2] = 0;

            String arr = Arrays.toString(array);
            String arr2 = arr.substring(1, arr.length() - 1);
            String arr3 = arr2.replace(",", "");

            String question = "What number is missing in the progression?";
            String expression = arr3.replace(" 0", " ..");

            Engine.hello(question, expression);

            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            int answer = randomValue * randomValue2 + randomValue1;

            String inputToString = "" + input;
            String answerToString = "" + answer;

            if (input != answer) {
                Engine.loose(inputToString, answerToString, name);
                return;
            }
            System.out.println("Correct!");
    }
        System.out.println("Congratulations," + name + "!");

  }
}
