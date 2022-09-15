package chapter3_Strings_and_basics_of_text_processing.topic2_String_StringBuffer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
        public static void main(String[] args) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                String strings = reader.readLine();
                System.out.println("New string: "+newSSttrriinngg(strings));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        private static String newSSttrriinngg(String strings) {
            StringBuilder stringBuilder = new StringBuilder();
            char newString;
            for (int i = 0; i < strings.length(); i++) {
                newString = strings.charAt(i);
                stringBuilder.append(newString).append(newString);
            }
            return stringBuilder.toString();
        }
}
