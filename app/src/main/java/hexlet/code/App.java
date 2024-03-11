package hexlet.code;

import hexlet.code.games.*;
import java.util.Scanner;

final class App {
    public static void main(final String[] args) {
        gameSelection();
    }
    public static void gameSelection() {
        int selection;
        final int even = 2;
        final int calc = 3;
        final int gcd = 4;
        final int progression = 5;
        final int prime = 6;
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet ");
        System.out.println("2 - Even ");
        System.out.println("3 - Calc ");
        System.out.println("4 - GCD ");
        System.out.println("5 - Progression ");
        System.out.println("6 - Prime ");
        System.out.println("0 - Exit ");
        Scanner scanner = new Scanner(System.in);
        selection = scanner.nextInt();
        System.out.println("Your choice: " + selection);
        switch (selection) {
            case  (0):
                System.out.println("Game exit");
                break;
            case  (1):
                Cli.askName();
                break;
            case  (even):
                Even.even();
                break;
            case  (calc):
                Calc.calc();
                break;
            case  (gcd):
                Gcd.gcd();
                break;
            case  (progression):
                Progression.progression();
                break;
            case  (prime):
                Prime.prime();
                break;
            default:
                throw new RuntimeException("Unknown input: " + selection);
        }
    }
}
