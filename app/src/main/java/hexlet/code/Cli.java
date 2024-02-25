
package hexlet.code;
import java.util.Scanner;
public final class Cli {
    private static String name;
    public static String getName() {
        return name;
    }
    private Cli() {
    }
    public static void askName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
