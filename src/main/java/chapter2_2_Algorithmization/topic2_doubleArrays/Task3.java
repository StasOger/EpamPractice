package chapter2_2_Algorithmization.topic2_doubleArrays;
import java.util.Scanner;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы

public class Task3 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Введите номер строки массива: ");
            int k = scan.nextInt();

            System.out.print("Введите номер столбца массива");
            int p = scan.nextInt();

            int[][]array = new int[][]
                    {
                            {2,5,2,4,3,5},
                            {1,5,7,4,2,6},
                            {3,6,11,95,45,87},
                            {4,6,3,6,7,2,7},
                            {66,33,67,87,23,13}
                    };

            System.out.println("Ваш массив: ");

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 6; j++) {
                    System.out.print(" " + array[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Строка: " + k + " = ");

            for (int i = k-1; i < k; i++) {
                for (int j = 0; j < 6; j++) {
                    System.out.print(" " + array[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Столбец: " + p + " = ");

            for (int i = 0; i < 5; i++) {
                for (int j = p-1; j < p; j++) {
                    System.out.print(" " + array[i][j] + " ");
                }
                System.out.println();
            }
        }
}
