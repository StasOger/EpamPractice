package chapter1_Basics_of_software_code_development.topic3_cycle;
// 3. Найти сумму квадратов первых ста чисел.

public class Task3 {
        public static void main(String[] args) {

            int sum = 0;

            for (int i = 1; i <= 100; i++){
                sum = (int) (sum + Math.pow(i, 2));
            }
            System.out.println(sum);
        }
}
