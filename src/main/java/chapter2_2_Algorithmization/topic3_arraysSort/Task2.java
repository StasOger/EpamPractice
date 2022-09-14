package chapter2_2_Algorithmization.topic3_arraysSort;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
        public static void main(String[] args) {
            try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {

                int[] firstArray = {1,2,6,9,10,20,120,122};

                System.out.println("\n\nEnter quantity the elements of second sequence: ");
                int m = Integer.parseInt(read.readLine());
                int[] secondArray = new int[m + 1];

                for (int i = 1; i < secondArray.length; i++) {
                    secondArray[i] = secondArray[i - 1] + 2;
                    System.out.print(secondArray[i] + ", ");
                }

                int[] joinArray = new int[firstArray.length + secondArray.length];

                for (int i = 0; i < joinArray.length; i++) {
                    if (i < firstArray.length) {
                        joinArray[i] = firstArray[i];
                    } else {
                        joinArray[i] = secondArray[i - firstArray.length];
                    }
                }

                for (int i = joinArray.length - 1; i > 0 ; i--) {
                    for (int j = 0; j < i; j++) {
                        if (joinArray[j] > joinArray[j + 1]) {
                            int temp = joinArray[j];
                            joinArray[j] = joinArray[j + 1];
                            joinArray[j + 1] = temp;
                        }
                    }
                }
                System.out.println("\n\nNew sequence: ");
                for(int value : joinArray){
                    System.out.print(value+ ", ");
                }

            } catch(IOException e){
                e.printStackTrace();
            }
        }

}
