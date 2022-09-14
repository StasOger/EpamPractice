package chapter2_2_Algorithmization.topic1_arrays;

public class Task4 {

        public static void main(String[] args) {
            int a[] = { 1, 23, 3, 4, 5, 6, 54, 87, 12, 45 };
            int max = a[0];
            int imax = 0;
            int min = a[0];
            int imin = 0;
            for (int i = 1; i < a.length; i++) {
                if (a[i] > max) {
                    max = a[i];
                    imax = i;
                }
                if (a[i] < min) {
                    min = a[i];
                    imin = i;
                }
            }
            a[imin] = max;
            a[imax] = min;
            for (int i = 0; i < a.length; i++) {
                System.out.println(" a[" + i + "]=" + a[i]);
            }
        }
}
