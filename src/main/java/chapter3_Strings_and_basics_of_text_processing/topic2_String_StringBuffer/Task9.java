package chapter3_Strings_and_basics_of_text_processing.topic2_String_StringBuffer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task9 {
        public static void main(String[] args) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                String strings = reader.readLine();
                int upperCase = 0;
                int lowerCase = 0;
                for (int k = 0; k < strings.length(); k++) {
                    if (Character.isUpperCase(strings.charAt(k))) upperCase++;
                    if (Character.isLowerCase(strings.charAt(k))) lowerCase++;
                }
                System.out.printf("Всего %d заглавных букв и %d прописных.",upperCase,lowerCase);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
