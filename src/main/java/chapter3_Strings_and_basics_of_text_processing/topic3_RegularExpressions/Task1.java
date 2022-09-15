package chapter3_Strings_and_basics_of_text_processing.topic3_RegularExpressions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

        public static void main(String[] args) throws IOException {
            String text = "Путь праведника труден! Ибо препятствуют ему себялюбивые и тираны из злых людей.\n" +
                    "\n" +
                    "Блажен тот пастырь. Кто во имя милосердия и доброты. Ведёт слабых за собой. Cквозь долину тьмы.\n" +
                    "\n" +
                    "Ибо именно он и есть тот. Кто воистину печётся о ближнем своём. И возвращает детей заблудших.\n" +
                    "\n" +
                    "И совершу! над ними великое мщение. Наказаниями яростными. над теми. Кто замыслит отравить! и повредить братьям моим.\n" +
                    "\n" +
                    "И узнаешь ты. Что имя моё Господь. Когда мщение моё. Падёт на тебя.\n" +
                    "\n";

            makeTextOperation(text);
        }

        private static void makeTextOperation(String text) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String start = "- Enter \"1\" for sorting paragraphs by amount of sentences; \n" +
                    "- Enter \"2\" for sorting sentences by long words;\n" +
                    "- Enter \"3\" for sorting leksem by discending \n" +
                    "for end enter \"exit\"\n";
            String choice = "";
            System.out.println(start);
            while (!choice.equalsIgnoreCase("exit")) {
                System.out.print("Enter command: ");
                choice = reader.readLine();
                switch (choice) {
                    case "1":
                        sortParagraphs(text);
                        break;
                    case "2":
                        sortWords(text);
                        break;
                    case "3":
                        sortLexemes(text);
                        break;
                    case "exit":
                        System.out.println("\nOver.");
                        break;
                    default:
                        System.out.println("Incorrect. Please repeat one more time.\n");
                }
            }
        }

        private static void sortParagraphs(String text) {
            String[] texts = text.split("\n");
            List<String> lines = new ArrayList<>(Arrays.asList(texts));
            lines.sort(SENTENCE_COMPARATOR);
            lines.forEach(System.out::println);
        }

        private static final Comparator<String> SENTENCE_COMPARATOR = (str1, str2) -> {
            Pattern pattern = Pattern.compile("\\.*[.!?]\\s*");
            Matcher matcher1 = pattern.matcher(str1);

            int count1 = 0;
            while (matcher1.find()) {
                count1++;
            }

            Matcher matcher2 = pattern.matcher(str2);
            int count2 = 0;
            while (matcher2.find()) {
                count2++;
            }
            return count2 - count1;
        };

        private static void sortWords(String text) {
            String[] texts = text.split("[\\.\\!\\?]");
            List<String> lines = new ArrayList<>(Arrays.asList(texts));
            lines.forEach(line -> {
                List<String> words = new ArrayList<>(Arrays.asList(line.split("[ ,.!?]")));
                words.sort(WORD_COMPARATOR);
                System.out.println(words);
            });
            lines.forEach(System.out::println);
        }

        private static final Comparator<String> WORD_COMPARATOR = (s1, s2) -> s1.length()-s2.length();

        private static void sortLexemes(String text) {
            Scanner scan = new Scanner(System.in);
            letter = scan.nextLine();

            String[] texts = text.split("[\\.\\!\\?]");
            List<String> lines = new ArrayList<>(Arrays.asList(texts));
            lines.forEach(line -> {
                List<String> words = new ArrayList<>(Arrays.asList(line.split("[ ,.!?]")));
                words.sort(LEXEMS_COMPARATOR);
                System.out.println(words);
            });
            lines.forEach(System.out::println);
        }

        public static String letter;

        private static final Comparator<String> LEXEMS_COMPARATOR = (wrd1, wrd2) -> {
        Pattern pattern = Pattern.compile(letter);
        Matcher matcher1 = pattern.matcher(wrd1);

        int count1 = 0;
        while (matcher1.find()) {
            count1++;
        }

        Matcher matcher2 = pattern.matcher(wrd2);
        int count2 = 0;
        while (matcher2.find()) {
            count2++;
        }
        if (count1!=count2){
            return count2 - count1;
        } else {
            return wrd1.compareTo(wrd2);

        }
    };
//    private static final Comparator<String> LEXEMS_ALPHABET_COMPARATOR = (wrd1, wrd2) -> wrd1.compareTo(wrd2);
}
