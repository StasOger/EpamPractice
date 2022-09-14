package chapter2_2_Algorithmization.topic3_arraysSort;

public class Task3 {
        public static void main(String[] args) {
            Integer[] array = new Integer[]{1, 2, 1, 8, 16, 10, 66, 5};
            for (int i = 0; i < array.length; i++) {
                int pos = i;
                int min = array[i];
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] > min) {
                        pos = j;
                        min = array[j];
                    }
                }
                array[pos] = array[i];
                array[i] = min;
                System.out.print(array[i] + " ");
            }
        }
}
