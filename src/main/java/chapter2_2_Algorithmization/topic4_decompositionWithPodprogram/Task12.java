package chapter2_2_Algorithmization.topic4_decompositionWithPodprogram;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
//
//Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
//        элементами которого являются числа, сумма цифр которых равна К и которые не большее N.

public class Task12 {
        public static void main(String[] args) {


            try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {

                System.out.println("Введите K: ");
                Scanner sc = new Scanner(System.in);
                int k = Integer.valueOf(sc.nextLine());
                System.out.println("Введите N: ");
                int n = Integer.valueOf(sc.nextLine());
                makeMassive(k,n);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        private static void makeMassive(int k, int n) {

            int[] array = new int[10];
//        for (int i = 1; i < array.length; i++) {
//            Random rnd = new Random();
//        }
            int i;
            for (i = 0; i < array.length && k > n; i++) {
                array[i] = (int) (Math.random()) + 4;
                k -= array[i];
            }
            array[i] = k;
            int [] arrayA = new int[i + 1];
            System.arraycopy(array, 0, arrayA, 0, i + 1);
//        return arrayA;
            System.out.println(Arrays.toString(arrayA));
        }
}
