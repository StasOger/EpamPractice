package chapter3_Strings_and_basics_of_text_processing.topic1_StringArray;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

        public static void main(String[] args) {
            String[] strings = {"SomeString", "CamelCase", "SnakeCase"};
            Pattern p = Pattern.compile("\\B([A-Z])");
            for (int i = 0; i < strings.length; i++) {
                Matcher m = p.matcher(strings[i]);
                StringBuffer strb = new StringBuffer();
                while (m.find()) {
                    m.appendReplacement(strb, "_$0");
                }
                m.appendTail(strb);
                strings[i] = strb.toString().toLowerCase();
            }
            System.out.println(Arrays.toString(strings));
        }
}
