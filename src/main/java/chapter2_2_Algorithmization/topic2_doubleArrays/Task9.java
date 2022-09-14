package chapter2_2_Algorithmization.topic2_doubleArrays;
import java.util.Random;
import java.util.Scanner;

public class Task9 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите размеры массива: ");
            int a1 = scanner.nextInt();
            int a2 = scanner.nextInt();
            int[][] array = new int[a1][a2];
            Random rnd = new Random();
            int sum = 0;

            for (int i = 0; i < a1; i++) {
                for (int j = 0; j < a2; j++) {
                    array[i][j] = rnd.nextInt(20);
                    sum = sum + array[i][j];
                }
                System.out.println("Сумма столбца " + (i+1) + " = " + sum);
                sum = 0;
            }

            System.out.println("Массив: ");

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
}
