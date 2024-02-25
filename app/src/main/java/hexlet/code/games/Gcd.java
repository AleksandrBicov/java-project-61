package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Scanner;

public final class Gcd {
    private Gcd() {
    }
    public static void gcd() {
        Cli.askName();
        String name = Cli.getName();
        final int minValue = 1;
        final int maxValue = 100;
        final int repeat = 3;
        for (int i = 0; i < repeat; i++) {
            int randomValue =
                minValue + (int) (Math.random() * (maxValue - minValue + 1));
            int randomValue1 =
                minValue + (int) (Math.random() * (maxValue - minValue + 1));
            String question =
                "Find the greatest common divisor of given numbers.";
            String expression =  randomValue + " " + randomValue1;
            Engine.hello(question, expression);
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            while (randomValue != 0) {
                int tmp = randomValue1 % randomValue;
                randomValue1 = randomValue;
                randomValue = tmp;
            }
            String inputToString = "" + input;
            String answerToString = "" + randomValue1;
            if (input != randomValue1) {
                Engine.loose(inputToString, answerToString, name);
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations," + name + "!");
    }

    public static class Progression {
        public static void progression() {
            final int minValue = 1;
            final int maxValue = 9;
            int[] array = new int[10];
            int randomValue =
                    minValue + (int) (Math.random() * (maxValue - minValue + 1));
            int randomValue1 =
                    minValue + (int) (Math.random() * (maxValue - minValue + 1));
            int randomValue2 =
                    minValue + (int) (Math.random() * (maxValue - minValue + 1));
            array[0] = randomValue1;
            for(int i = 1; i < 10; i++){
                array[i] = randomValue + array[i -1];
            }
            array[randomValue2] = 0;
            String arr = Arrays.toString(array);
            String arr2 = arr.substring(1, arr.length()-1);
            String arr3 = arr2.replace(",", "");
            String arr4 = arr3.replace(" 0", " ..");
            System.out.println(arr4);

        }
    }
}


