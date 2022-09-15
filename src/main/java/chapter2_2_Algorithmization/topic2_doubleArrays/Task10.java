package chapter2_2_Algorithmization.topic2_doubleArrays;
import java.util.Random;

/*
        Задана матрица неотрицательных чисел.
        Посчитать сумму элементов в каждом столбце.
        Определить, какой столбец содержит максимальную сумму.
*/

public class Task10 {
        public static void main(String[] args) {
            int[][] array = new int[10][10];
            Random rnd = new Random();
            int sum = 0;

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    array[i][j] = rnd.nextInt(15);
                }
            }

            System.out.println("матрица");

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }

            System.out.print("Сумма элемментов диагонали: ");

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < 10; j++) {
                    if (i == j){
                        sum = sum + array[i][j];
                        System.out.print(array[i][j] + "+");
                    }
                }
            } System.out.println(" = "+ sum);
            System.out.print(" = "+ sum);
        }
}
