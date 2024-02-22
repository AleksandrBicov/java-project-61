package hexlet.code;

import java.util.Scanner;

final class Selection {
    private Selection() {
    }
    public static void gameSelection() {
        Scanner scanner = new Scanner(System.in);
        int selection;
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet ");
        System.out.println("0 - Exit ");
        selection = scanner.nextInt();
        System.out.println("Your choice: " + selection);
    }
}
