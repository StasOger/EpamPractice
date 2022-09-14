package chapter2_2_Algorithmization.topic4_decompositionWithPodprogram;
import java.util.Scanner;

public class Task11 {

        private static double numberOfDigits(long x, long y) {

            int lengthX = (int) Math.log10(Math.pow(x, 2)) + 1;
            int lengthY = (int) Math.log10(Math.pow(y, 2)) + 1;
            int lengthxx = String.valueOf(x).length();
            int lengthyy = String.valueOf(y).length();
            if (lengthxx > lengthyy){
                System.out.println("Количество цифр числа " + x +" > количества цифр числа "+ y);
            } else if (lengthxx < lengthyy){
                System.out.println("Количество цифр числа " + x +" < количества цифр числа "+ y);
            } else {
                System.out.println("Количество цифр числа " + x +" = количеству цифр числа "+ y);
            }
            return 0;
        }

        public static void main(String[] args) {

            System.out.println("Введите два числа: ");
            Scanner sc = new Scanner(System.in);
            long x = sc.nextLong();
            long y = sc.nextLong();
            numberOfDigits(x,y);
        }
}
