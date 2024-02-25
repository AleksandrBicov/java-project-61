package hexlet.code;

public class Engine {
    public static void hello(String Question, String expression) {
        System.out.println(Question);
        System.out.println("Question : " + expression);
        System.out.println("Your answer: ");

    }
    public static void loose(String even, String answer , String name) {
        System.out.println("'" + even + "' is wrong answer ;"
                + "(. Correct answer was" + " '" + answer + " '.\n"
                + "Let's try again," + name + "!");
    }
}
