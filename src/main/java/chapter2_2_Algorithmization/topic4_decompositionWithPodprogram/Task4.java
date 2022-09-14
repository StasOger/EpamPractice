package chapter2_2_Algorithmization.topic4_decompositionWithPodprogram;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.print("Введите кол-во точек: ");
            int n = scan.nextInt();

            int[][] mas = new int[n][2];
            Random rnd = new Random();
            System.out.println();
            System.out.println("Ваш массив: ");
            System.out.println("Point i : [ x y ] ");

            for (int i = 0; i < n; i++) {
                System.out.println();
                System.out.print("Point " + (i+1) +" : [ ");
                for (int j = 0; j < 2; j++) {
                    mas[i][j] = rnd.nextInt(10);
                    System.out.print(mas[i][j] + " ");
                }
                System.out.print("] ");
            }

            System.out.println();

            double maxLength = 0;
            int[] startPoint = {} ;
            int[] endPoint = {} ;
            double[] lengths = new double[n];

            for (int i = 0; i < n-1; i++) {
                for (int j = i+1; j < n; j++) {
                    double length = Math.pow((Math.pow((mas[i][0]-mas[j][0]), 2) + (Math.pow((mas[i][1]-mas[j][1]), 2))), 0.5);
                    lengths[j] = length;
                    System.out.println("length between points: " + (i+1) + " adn " + (j+1) + " = " + length);
                }
            }

            int maxI = 0;
            int maxJ = 0;

            for (int i = 0; i < n-1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (lengths[j] >= maxLength) {
                        maxLength = lengths[j];
                        startPoint = mas[i];
                        endPoint = mas[j];
                        maxI = i;
                        maxJ = j;
                    }
                }
            }
            System.out.println("length between points is the largest: " + (maxI+1) + " adn " + (maxJ+1) + " = " + maxLength);
        }
}
