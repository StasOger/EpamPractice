package chapter4_Programming_with_classes.topic2.Task1;

/*
 * Создать объект класса Текст, используя классы Предложение, Слово.
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Scanner;

//        Путь праведника труден, ибо препятствуют ему себялюбивые и тираны из злых людей.
//        Блажен тот пастырь, кто во имя милосердия и доброты ведёт слабых за собой сквозь долину тьмы.
//        Ибо именно он и есть тот, кто воистину печётся о ближнем своём и возвращает детей заблудших.
//        И совершу над ними великое мщение наказаниями яростными, над теми, кто замыслит отравить и повредить братьям моим.
//        И узнаешь ты, что имя моё Господь, когда мщение моё падёт на тебя...
public class Task1 {
    private static SimpleDateFormat startTime = new SimpleDateFormat("HH:mm");

    public static String choice = "";

    private static void makeTextOperation(Text poem) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String start = "- Enter \"1\" for completeTheText; \n" +
                "- Enter \"2\" for showHeading;\n" +
                "- Enter \"3\" for showText \n" +
                "for end enter \"exit\"\n";

        System.out.println(start);
        while (!choice.equalsIgnoreCase("exit")) {
            System.out.print("Enter command: ");
            choice = reader.readLine();
            switch (choice) {
                case "1":
                    completeTheText(poem);
                    break;
                case "2":
                    showHeading(poem);
                    break;
                case "3":
                    showText(poem);
                    break;
                case "exit":
                    System.out.println("\nOver.");
                    break;
                default:
                    System.out.println("Incorrect. Please repeat one more time.\n");
            }
        }
    }

    private static void showText(Text poem) {
        System.out.println(poem.getContent());
    }

    private static void showHeading(Text poem) {
        System.out.println(poem.getHeading().toString());
    }

    private static void completeTheText(Text poem) {
        System.out.println(poem.getContent());
        Scanner in = new Scanner(System.in);
        System.out.println("Complete the text: ");
        String completedText = in.nextLine();
        poem.completeTheText(new Sentence(completedText));
        System.out.println(poem.getContent());
    }

    public static void main(String[] args) throws Exception {
        Word heading = new Word("Пророчество Иезыкиль, глава 25 стих 17");
        String line1 = "Путь праведника труден, ибо препятствуют ему себялюбивые и тираны из злых людей.\n"+
                "Блажен тот пастырь, кто во имя милосердия и доброты ведёт слабых за собой сквозь долину тьмы.\n" +
                "Ибо именно он и есть тот, кто воистину печётся о ближнем своём и возвращает детей заблудших.\n" +
                "И совершу над ними великое мщение наказаниями яростными, над теми, кто замыслит отравить и повредить братьям моим.\n" +
                "И узнаешь ты, что имя моё Господь, когда мщение моё падёт на тебя...";
        Sentence sentence = new Sentence(line1);
        Text poem = new Text(heading, sentence);


        makeTextOperation(poem);
    }
}
