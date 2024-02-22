package hexlet.code;

import java.util.Scanner;

final class Selection {
    public static int selection;;
    private Selection() {
    }
    public static int gameSelection() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet ");
        System.out.println("2 - Even ");
        System.out.println("0 - Exit ");
        selection = scanner.nextInt();
        System.out.println("Your choice: " + selection);
        return selection;
    }
}
