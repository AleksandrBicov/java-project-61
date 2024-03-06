package hexlet.code;

import hexlet.code.games.*;
import java.util.Scanner;

final class App {
    private App() {
    }
    public static void main(final String[] args) {
        gameSelection();
    }
    private static int selection;
    public static void gameSelection() {
        final int three = 3;
        final int four = 4;
        final int five = 5;
        final int six = 6;
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
                Engine.askName();
                break;
            case  (2):
                Even.even();
                break;
            case  (three):
                Calc.calc();
                break;
            case  (four):
                Gcd.gcd();
                break;
            case  (five):
                Progression.progression();
                break;
            case  (six):
                Prime.prime();
                break;
            default:
                throw new RuntimeException("Unknown input: " + selection);
        }
    }
}
