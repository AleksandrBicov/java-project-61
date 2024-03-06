package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Arrays;
final public class Progression {
    private Progression() {
    }
    public static void progression() {
        Engine.askName();

        final int newArr = 10;
        String question = "What number is missing in the progression?";
        String[][] game = new String[Engine.ROUNDS][2];
        for (int index = 0; index < Engine.ROUNDS; index++) {
            int[] array = new int[newArr];
            int randomValue = Utils.generateNumber(1, 10);
            int randomValue1 = Utils.generateNumber(1, 10);
            int randomValue2 = Utils.generateNumber(1, 10);
            array[0] = randomValue1;
            for (int i = 1; i < newArr; i++) {
                array[i] = randomValue + array[i - 1];
            }
            array[randomValue2] = 0;
            String arr = Arrays.toString(array);
            String arr2 = arr.substring(1, arr.length() - 1);
            String arr3 = arr2.replace(",", "");
            game[index][0] = arr3.replace(" 0", " ..");
            game[index][1] = randomValue * randomValue2 + randomValue1 + "";
        }

        Engine.engine(question, game);
    }
}
