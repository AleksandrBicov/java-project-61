package hexlet.code;
import java.util.Scanner;
final class Cli {
    private Cli() {
    }
    public static void askName() {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }

}
