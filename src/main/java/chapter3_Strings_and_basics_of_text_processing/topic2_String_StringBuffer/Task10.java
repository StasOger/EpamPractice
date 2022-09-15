package chapter3_Strings_and_basics_of_text_processing.topic2_String_StringBuffer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task10 {
        public static void main(String[] args) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                String strings = reader.readLine();
                numberAmount(strings);
                System.out.println(strings);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        private static void numberAmount(String string) {
            int sum = 0;
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == '!' || string.charAt(i) == '.' || string.charAt(i) == '?') {
                    sum++;
                }
            }
            System.out.println("sum " + sum);
        }
}
