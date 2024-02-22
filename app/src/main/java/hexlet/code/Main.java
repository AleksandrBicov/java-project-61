package hexlet.code;
final class Main {
    private Main() {
    }
    public static void main(final String[] args) {
        Selection.gameSelection();
        switch (Selection.selection) {
            case  (1):
                Cli.askName();
                break;
            case  (2):
                Even.even();
                break;
            default:
                break;
        }

    }
}
