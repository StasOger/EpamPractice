package chapter2_2_Algorithmization.topic4_decompositionWithPodprogram;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
//
//Найти все натуральные n-значные числа, цифры в которых образуют строго
//        возрастающую последовательность (например, 1234, 5789). Для решения задачи
//        использовать декомпозицию.

public class Task15 {
        public static void main(String[] args) {
            try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {

                System.out.println("Введите количество разрядов n числа: ");
                Scanner sc = new Scanner(System.in);
                int n = Integer.valueOf(sc.nextLine());
                System.out.println("n: " + n);

                for (int i = (int) (1 * Math.pow(10, n - 1)); i < 10 * Math.pow(10, n - 1); i++) {
                    mass(i, n);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private static void mass(int i, int n) {
//  создаем массив состоящий из цифр числа
            int[] array = new int[n];
            int j;
            for (j = n - 1; j >= 0; j--) {
                int arrayy = i % 10;
                i /= 10;
                array[j] = arrayy;
            }
            proverka(array);
        }

        private static void proverka(int[] array) {
//  проверяем является ли массив возрастающим
            boolean flag = true;
            for (int k = 1; k < array.length; k++) {
                if (array[k] <= array[k - 1]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(Arrays.toString(array));
            }
        }
}
