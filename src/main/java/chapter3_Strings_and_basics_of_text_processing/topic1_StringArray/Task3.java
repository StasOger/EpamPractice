package chapter3_Strings_and_basics_of_text_processing.topic1_StringArray;

public class Task3 {

        public static void main(String[] args) {

            String string = "Cruisin' down the street in my '64";
            numberAmount(string);
            System.out.println(string);

        }
        private static void numberAmount(String string) {
            int sum = 0;
            char [] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
            for (int i = 0; i < string.length(); i++) {
                for (int j = 0; j < digits.length; j++) {
                    if (string.charAt(i) == digits[j]) {
                        sum++;
                    }
                }
            }
            System.out.println("sum "+sum);
        }
}
