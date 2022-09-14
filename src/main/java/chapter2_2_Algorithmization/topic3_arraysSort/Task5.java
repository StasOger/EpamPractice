package chapter2_2_Algorithmization.topic3_arraysSort;

import java.util.Arrays;

public class Task5 {
        public static void main(String[] args) {
            int [] array = {11, 3, 14, 16, 7, 1, -1, 0, -127, 128, 89};

            for (int i = 1; i < array.length; i++) {
                int current = array[i];
                int j = i - 1;
                while(j >= 0 && current < array[j]) {
                    array[j+1] = array[j];
                    j--;
                }
                // в этой точке мы вышли, так что j так же -1
                // или в первом элементе, где текущий >= a[j]
                array[j+1] = current;
            }
            System.out.println(Arrays.toString(array));
        }
}
