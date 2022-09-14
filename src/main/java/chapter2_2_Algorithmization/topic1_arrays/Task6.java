package chapter2_2_Algorithmization.topic1_arrays;
import java.util.Arrays;

public class Task6 {

        public static void main(String[] args) {
            int[] intArray = {1, 2, 3, 4, 5, 7, 10, 21, 25, 26, 26, 37, 37, 48, 57};


            System.out.print("| ");
            int sum = 0;
            for (int i = 0; i < intArray.length; i++) {
                int j;
                boolean isComposite = false;
                for (j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isComposite = true;
                        break;
                    }
                }
                if (isComposite) {
                    System.out.print("  ");
                } else {
                    sum = sum + intArray[i];
                    System.out.print(intArray[i] + " ");

                }
            }
            System.out.print("|");
            System.out.println("сумма:" + sum);
        }
}
