package chapter3_Strings_and_basics_of_text_processing.topic2_String_StringBuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String strings = reader.readLine();
            System.out.println(probelAmount(strings));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int probelAmount(String strings) {
        int maxCount = 0;
        int counter = 0;
        for (int i = 0; i < strings.length(); i++) {
            if (strings.charAt(i) == ' ') {
                counter++;
            } else {
                if (maxCount < counter) {
                    maxCount = counter;
                }
                counter = 0;
            }
        }
        return maxCount;
    }
}