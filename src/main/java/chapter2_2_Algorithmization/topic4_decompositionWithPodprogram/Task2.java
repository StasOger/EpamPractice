package chapter2_2_Algorithmization.topic4_decompositionWithPodprogram;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

    /*
     * Написать метод(методы) для нахождения наибольшего общего делителя четырех
     * натуральных чисел.
     */

        public static void main(String[] args) throws IOException {
            int gcd;
            System.out.println("Enter natural number:");
            int [] number = fillArray(4);
            gcd = findGcd(number);
            System.out.println("\nLargest Common Factor: " + gcd);

        }
        private static int [] fillArray (int n) throws IOException{
            BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
            int [] array = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter number a" + (i + 1) + ":");
                array[i] = Integer.parseInt(rd.readLine());
            }
            return array;
        }

        private static int findGcd(int [] number) {
            int a = Math.abs(number[0]);
            for (int element : number) {
                int b = Math.abs(element);
                while (a != 0 && b != 0) {
                    if (a > b) {
                        a %= b;
                    } else {
                        b %= a;
                    }
                }
                a += b;
            }
            return a;
        }
}
