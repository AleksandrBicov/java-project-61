package hexlet.code;
final class Main {
    private Main() {
    }
    public static void main(final String[] args) {
        Selection.gameSelection();
        switch (Selection.getSelection()) {
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
            default:
                break;
        }

    }
}
