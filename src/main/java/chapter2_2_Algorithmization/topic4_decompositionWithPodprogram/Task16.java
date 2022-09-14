package chapter2_2_Algorithmization.topic4_decompositionWithPodprogram;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task16 {

        public static void main(String[] args) {
            try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {

                System.out.println("Введите количество разрядов n числа: ");
                Scanner sc = new Scanner(System.in);
                int n = Integer.valueOf(sc.nextLine());
                System.out.println("n: " + n);
                for (int i = (int) (1 * Math.pow(10, n - 1)); i < 10 * Math.pow(10, n - 1); i++) {
                    massNumber(i, n);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private static void massNumber(int i, int n) {
//  создаем массив состоящий из цифр числа
            int[] array = new int[n];
            int j;
            for (j = n - 1; j >= 0; j--) {
                int arrayy = i % 10;
                i /= 10;
                array[j] = arrayy;
            }
            proverkaNumber(array,i);
        }

        private static void proverkaNumber(int[] array, int i) {
//  проверяем содержит ли массив нечетные цифры
            boolean flag = true;
            for (int k = 0; k < array.length; k++) {
                if (array[k] % 2 == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println();
                System.out.print("число ");
                for (int t = 0; t < array.length; t++) {
                    System.out.print(array[t]);
                }
                System.out.println();
                sumNumber(array, i);
            }
        }

        private static void sumNumber(int[] array, int i) {
//  считаем сумму цифр массива
            int sum = 0;
            for (int k = 0; k < array.length; k++) {
                sum = sum + array[k];
            }
            System.out.println("сумма цифр: "+ sum);
            massSum(sum);
        }

        private static void massSum(int sum) {
//  создаем массив состоящий из цифр суммы цифр чисел
            int length = String.valueOf(sum).length();
            int[] arraySum = new int[length];
            int j;
            for (j = length - 1; j >= 0; j--) {
                int arrayys = sum % 10;
                sum /= 10;
                arraySum[j] = arrayys;
            }
            proverkaSum(sum, arraySum);
        }

        private static void proverkaSum(int sum, int[] arraySum) {
//  проверяем содержит ли массив нечетные цифры
            int amountOfEven=0;
            for (int k = 0; k < arraySum.length; k++) {
                if (arraySum[k] % 2 == 0) {
                    amountOfEven++;
                    System.out.println("количество четных цифр в сумме цифр числа= " + amountOfEven);
                }
            }
        }
    }
