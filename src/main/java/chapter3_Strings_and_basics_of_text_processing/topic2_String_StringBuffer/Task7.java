package chapter3_Strings_and_basics_of_text_processing.topic2_String_StringBuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String s = reader.readLine();
            String t = s.replaceAll(" ", "").replaceAll("(.)(?=.*\\1)", "");
            System.out.println(t);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}