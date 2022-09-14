package chapter1_Basics_of_software_code_development.topic3_cycle;

public class Task4 {
        public static void main(String[] args) {
            int proizvedenie = 1;

            for (int i = 1; i <= 200; i++){
                proizvedenie = (int) (proizvedenie * Math.pow(i, 2));
            }
            System.out.println(proizvedenie);
        }
}
