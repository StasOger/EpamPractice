package chapter2_2_Algorithmization.topic4_decompositionWithPodprogram;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
        public static void main(String[] args) {
//
//            Дано натуральное число N. Написать метод(методы) для формирования массива,
//            элементами которого являются цифры числа N

            try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {

                System.out.println("Введите N: ");
                Scanner sc = new Scanner(System.in);
                int x = Integer.valueOf(sc.nextLine());
                System.out.println("Number: " + x);
                int length = String.valueOf(x).length();
                System.out.println(length);
                System.out.println("Massive: ");
                makeMassive(length, x);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        private static void makeMassive(int length, int x) {

            int[] array = new int[length];
            for (int i = length-1; i >= 0; i--) {
                int arrayy = x%10;
                x /= 10;
                array[i] = arrayy;
                System.out.println(array[i]);
            }
            System.out.println(Arrays.toString(array));
        }
}
