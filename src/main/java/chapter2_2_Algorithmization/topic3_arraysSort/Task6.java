package chapter2_2_Algorithmization.topic3_arraysSort;

import java.util.Arrays;

public class Task6 {
        public static void main(String[] args) {
            int [] mass = {11, 3, 14, 16, 7, 1, -1, 0, -127, 128, 89};
            int i, j, step;
            int tmp;
            for (step = mass.length / 2; step > 0; step /= 2)
                for (i = step; i < mass.length ; i++) {
                    tmp = mass[i];
                    for (j = i; j >= step; j -= step) {
                        if (tmp < mass[j - step])
                            mass[j] = mass[j - step];
                        else
                            break;
                    }
                    mass[j] = tmp;
                }
            System.out.println(Arrays.toString(mass));
        }
}
