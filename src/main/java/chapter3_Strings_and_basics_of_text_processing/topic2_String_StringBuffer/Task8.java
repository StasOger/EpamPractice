package chapter3_Strings_and_basics_of_text_processing.topic2_String_StringBuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String Str = reader.readLine();
            int max = 0;
            String word = null;
            for (String retval : Str.split(" ")) {
                if (retval.length()>max){
                    max = retval.length();
                    word = retval;
                }
            }
            System.out.println(word);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}