package chapter2_2_Algorithmization.topic3_arraysSort;

import java.util.Arrays;

public class Task4 {
        public static void main(String[] args) {
            int [] mas = {11, 3, 14, 16, 7, 1, -1, 0, -127, 128, 89};

            boolean isSorted = false;
            int buf;
            while(!isSorted) {
                isSorted = true;
                for (int i = 0; i < mas.length-1; i++) {
                    if(mas[i] > mas[i+1]){
                        isSorted = false;

                        buf = mas[i];
                        mas[i] = mas[i+1];
                        mas[i+1] = buf;
                    }
                }
            }
            System.out.println(Arrays.toString(mas));
        }
}
