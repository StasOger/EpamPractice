package chapter2_2_Algorithmization.topic4_decompositionWithPodprogram;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task13 {
        public static void main(String[] args) {
            try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {

                System.out.println("Введите n: ");
                Scanner sc = new Scanner(System.in);
                int n = Integer.valueOf(sc.nextLine());

                makeTwins(n);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private static void makeTwins(int n) {
            for (int i = n; i<=2*n; i++){
                System.out.println("близнецы: "+i+", "+(i+2));
            }
        }
}
