package chapter2_2_Algorithmization.topic2_doubleArrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Введите кол-во строк массива: ");
            int n = scan.nextInt();
            System.out.print("Введите кол-во столбцов");
            int m = scan.nextInt();
            int[][] mas = new int[n][m];
            Random rnd = new Random();
            int a = 0;
            int b = 0;
            System.out.println("Ваш массив: ");

            for (int i = 0; i < n; i++) {
                System.out.println();
                for (int j = 0; j< m; j++) {
                    mas[i][j] = rnd.nextInt(10);
                    System.out.print(mas[i][j] + " ");}
            }
            System.out.println("");

            System.out.println("Выводим столбцы массива: ");

            for (int i = 0; i < n; i++) {
                System.out.println();

                for (int j = 0; j< m; j++) {
                    if (mas[1][0] > mas[i][m-1]){
                        mas[i][j] = rnd.nextInt(10);
                        System.out.print(mas[i][j] + " ");
                    }
                }
            }
            System.out.println("");

            System.out.println("Выводим последнюю строку массива: ");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(mas[i][j] + " ");
                }
                System.out.println("");
                System.out.println("Выводим последнего элемента строки: "+mas[n-1][m-1]);
            }
        }
}
