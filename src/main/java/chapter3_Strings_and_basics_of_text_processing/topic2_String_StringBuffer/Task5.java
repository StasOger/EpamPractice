package chapter3_Strings_and_basics_of_text_processing.topic2_String_StringBuffer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
        public static void main(String[] args) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                String strings = reader.readLine();
                System.out.println("Number of 'a': "+amountA(strings));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        private static int amountA(String strings) {
            int sum = 0;
            char a = 'a';
            for (int i = 0; i < strings.length(); i++) {
                if (strings.charAt(i) == a){
                    sum++;
                }
            }
            return sum;
        }
}
