package chapter3_Strings_and_basics_of_text_processing.topic2_String_StringBuffer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
        public static void main(String[] args) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                String strings = reader.readLine();
                System.out.println(probelAmount(strings));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private static boolean probelAmount(String strings) {
            for (int i = 0; i < strings.length()/2; i++) {
                if (strings.charAt(i) != strings.charAt(strings.length()-i-1)) {
                    return false;
                }
            }
            return true;
        }
}
