package chapter2_2_Algorithmization.topic2_doubleArrays;
import java.util.Random;
import java.util.Scanner;

/*
        В числовой матрице поменять местами два столбца любых столбца,
        т. е. все элементы одного столбца поставить на соответствующие
        им позиции другого, а его элементы второго переместить в первый.
        Номера столбцов вводит пользователь с клавиатуры.
*/

public class Task8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите размеры массива: ");
            int a1 = scanner.nextInt();
            int a2 = scanner.nextInt();
            int[][] array = new int[a1][a2];
            Random rnd = new Random();

            for (int i = 0; i < a1; i++) {
                for (int j = 0; j < a2; j++) {
                    array[i][j] = rnd.nextInt(20);
                }
            }

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Введите номера столбцов требующие перестановки: ");
            int i1 = scanner.nextInt();
            int i2 = scanner.nextInt();

            for (int i = 0; i < a1; i++) {
                int tmp = array[i][i1-1];
                array[i][i1-1] = array[i][i2-1];
                array[i][i2-1] = tmp;
            }

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
