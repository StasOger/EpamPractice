package chapter2_2_Algorithmization.topic2_doubleArrays;
import java.util.Random;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class Task15 {
        public static void main(String[] args) {
            Integer[][] array = new Integer[][] {
                    {10, 12, 10},
                    {53, 98, 75},
                    {44,98,16}
            };

            System.out.println("Массив: ");
            System.out.println();
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }

            int max = array[0][0];
            for (int i = 0; i < array.length; i++) {
                for(int j = 0; j < array[i].length; j++) {
                    if (max < array[i][j]){
                        max = array[i][j];
                    }
                }
            }

            System.out.println();
            System.out.println("Максимальный элемент: "+max);
            System.out.println("Массив заменённый: ");

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] % 2 != 0) {
                        array[i][j] = max;
                        System.out.print(array[i][j] + " ");
                    } else {
                        System.out.print(array[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
}
