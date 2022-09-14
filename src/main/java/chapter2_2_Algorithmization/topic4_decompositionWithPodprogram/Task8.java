package chapter2_2_Algorithmization.topic4_decompositionWithPodprogram;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {
        public static void main(String[] args) {


            try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {

                int[] array = {1,3,5,6,10,-10,-20,0,31,69,-69,96};

                System.out.println("\nResult after calculating: ");
                System.out.print("D[1]+D[2]+D[3] = ");
                calculate(array, 1);
                System.out.print("D[3]+D[4]+D[5] = ");
                calculate(array, 3);
                System.out.print("D[4]+D[5]+D[6] = ");
                calculate(array, 4);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        private static void calculate(int[] array, int k) {
            int sum = 0;
            for (int i = k - 1; i < k + 2; i++) {
                sum += array[i];
            }
            System.out.println(sum);
        }
}
