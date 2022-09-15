package chapter2_2_Algorithmization.topic4_decompositionWithPodprogram;

public class Task17 {
    /*
       Из заданного числа вычТи сумму его цифр. Из результата вновь вычТи сумму его
       цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль?
       Для решения задачи использовать декомпозицию
     */
        private static int countSubtraction(int number) {
            int count = 0;
            System.out.println("number = " + number);
            while (number > 0) {
                number -= countSumOfDigits(number);
                System.out.println("number = number - sum = " + number);
                count++;
            }

            return count;
        }

        private static int countSumOfDigits(int number) {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;

            }
            System.out.println("sum = "+sum );
            return sum;
        }

        public static void main(String[] args) {
            int n = countSubtraction(21);
            System.out.println("\nThe quantity of the substractions: " + n);
        }
    }