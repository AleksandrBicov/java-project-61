package hexlet.code;

import java.util.Scanner;

final class Even {
    private Even() {
    }
    public static void even() {
        Cli.askName();
        for (int i = 0; i < 3; i++) {
            int minValue = 1;
            int maxValue = 100;
            int randomValue =
                    minValue + (int) (Math.random() * (maxValue - minValue + 1));
            System.out.println(
                    "Answer 'yes' if the number is even, otherwise answer 'no'.");
            System.out.println("qestion : " + randomValue);
            System.out.println("Your answer: ");
            Scanner scan = new Scanner(System.in);
            String even;
            even = scan.nextLine();
            String ansver;
            if (randomValue % 2 == 0) {
                ansver = "yes";
            } else {
                ansver = "no";
            }
            if (!even.equals(ansver)) {
                System.out.println("'"+ even+ "' is wrong answer ;" +
                        "(. Correct answer was" + " '"+ ansver +" '.\n" +
                        "Let's try again," + Cli.name + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations," + Cli.name + "!");
    }

}
