
package hexlet.code;
import java.util.Scanner;
public final class Cli {
    public static String name;

    public static void askName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");


        // scanner.close();
        // Если добавляю эту строку весь проект падает с ошибкой
        // Execution failed for task ':App.main()'.
        //> Process 'command '/usr/lib/jvm/jdk-20/bin/java'' finished with non-zero exit value 1
        // не могу понять что с этим делать? или вообще с этим файлом не взаимодействовать ,
        //а для приветствия и работы с именем повотрно код писать?

    }
}
