package hexlet.code;

public final class Engine {
    private Engine() {
    }
    public static void hello(final String question, final String expression) {
        System.out.println(question);
        System.out.println("question : " + expression);
        System.out.println("Your answer: ");

    }
    public static void loose(final String even, final String answer, final String name) {
        System.out.println("'" + even + "' is wrong answer ;"
                + "(. Correct answer was" + " '" + answer + " '.\n"
                + "Let's try again," + name + "!");
    }
}
