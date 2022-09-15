package chapter2_2_Algorithmization.topic2_doubleArrays;
import java.util.Random;

//Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
//        причем в каждом столбце число единиц равно номеру столбца.

public class Task14 {
        public static void main(String[] args) {
            Random rnd = new Random();
            int m = rnd.nextInt(127);
            int n = rnd.nextInt(127);
            System.out.println("m = "+m+", n= "+n);
            int[][] array = new int[m][n];

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = 1;
                    int k = j;
                    for (k = 0; k < array[i].length; k++) {
                        System.out.print(array[i][j] + " ");
                    }

                }
                System.out.println();
            }
        }
}
