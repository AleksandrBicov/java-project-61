package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void askName () {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("May I have your name?");
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }

}
