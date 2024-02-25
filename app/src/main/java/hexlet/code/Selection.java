
package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;

import java.util.Scanner;

final class Selection {
    /**
     * Menu selection game.
     */
    private static int selection;
    private Selection() {
    }
    public static void gameSelection() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet ");
        System.out.println("2 - Even ");
        System.out.println("3 - Calc ");
        System.out.println("4 - GCD "); //

        System.out.println("0 - Exit ");
        selection = scanner.nextInt();
        System.out.println("Your choice: " + selection);
        switch (selection) {
            case  (0):
                System.out.println("Game exit");
                break;
            case  (1):
                Cli.askName();
                break;
            case  (2):
                Even.even();
                break;
            case  (3):
                Calc.calc();
                break;
            case  (4):
                Gcd.gcd();
                break;
            default:
                break;
        }
    }
}
