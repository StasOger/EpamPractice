package chapter2_2_Algorithmization.topic2_doubleArrays;
import java.util.Random;

public class Task11 {
        public static void main(String[] args) {
            int[][] array = new int[10][20];
            Random rnd = new Random();
            int sum = 0;

            System.out.print("Номер строки, в которой число 5 встречается больше 3 раз: ");
            for (int i = 0; i < 10; i++) {
                sum = 0;
                for (int j = 0; j < 20; j++) {
                    array[i][j] = rnd.nextInt(15);
                    if (array[i][j] == 5){
                        sum = sum + 1;
                        if (sum >= 3){
                            System.out.print((i+1) + " ");
                        }
                    }
                }
            }
            System.out.println();
            System.out.println("Массив: ");

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
}
