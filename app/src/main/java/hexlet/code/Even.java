package hexlet.code;
import java.util.Locale;
import java.util.Scanner;
final class Even {
    private Even() {
    }
    public static void even() {
        Cli.askName();
        String name = Cli.getName();
        for (int index = 0; index < 3; index++) {
            int minValue = 1;
            int maxValue = 100;
            int randomValue =
                    minValue
                            + (int) (Math.random() * (maxValue - minValue + 1));
            System.out.println(
                    "Answer 'yes' if the number is even, "
                            + "otherwise answer 'no'.");
            System.out.println("Question : " + randomValue);
            System.out.println("Your answer: ");
            Scanner scan = new Scanner(System.in);
            String even;
            even = scan.nextLine();
            even = even.toLowerCase();
            String answer;
            if (randomValue % 2 == 0) {
                answer = "yes";
            } else {
                answer = "no";
            }
            if (!even.equals(answer)) {
                System.out.println("'" + even + "' is wrong answer ;"
                        + "(. Correct answer was" + " '" + answer + " '.\n"
                        + "Let's try again," + name + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations," + name + "!");
    }

}
