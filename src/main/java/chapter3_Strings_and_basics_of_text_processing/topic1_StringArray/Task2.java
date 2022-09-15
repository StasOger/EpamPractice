package chapter3_Strings_and_basics_of_text_processing.topic1_StringArray;

public class Task2 {
        public static void main(String[] args) {
            String string = "word word hello world force it word. ";
            System.out.println(string.replace("word", "letter"));

            String word = "They system outlined word and word is a prefected and amazing word 's";
            String letter = wordChanger(word);
            System.out.println(word);
            System.out.println(letter);
        }
        private static String wordChanger(String word) {
            StringBuilder strBuilder = new StringBuilder();
            String letter;
            for (int i = 0; i < word.length(); i++) {
                if (i + 3 < word.length() && word.charAt(i) == 'w'
                        && word.charAt(i + 1) == 'o'
                        && word.charAt(i + 2) == 'r'
                        && word.charAt(i + 3) == 'd') {
                    strBuilder.append("letter");
                    i += 3;
                } else {
                    strBuilder.append(word.charAt(i));
                }
            }
            letter = strBuilder.toString();
            return letter;
        }
}
