package chapter2_2_Algorithmization.topic2_doubleArrays;
import java.util.Arrays;
import java.util.Comparator;

public class Task12 {
        public static void main(String[] args) {
            Integer[][] arr = new Integer[][] {
                    {10, 12, 10},
                    {53, 98, 75},
                    {44,98,16}
            };

            System.out.println("Исходный массив: ");

            for(int i=0;i<arr.length;i++)
                System.out.println(Arrays.toString(arr[i]));


            for(Integer[] i : arr)  Arrays.sort(i);// по возрастанию

            System.out.println("Строки массива отсортированы по возрастанию: ");

            for(int i=0;i<arr.length;i++)
                System.out.println(Arrays.toString(arr[i]));


            for(Integer[] j : arr) // по убыванию
            {
                Arrays.sort(j, new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {

                        if(o1<o2) return 1;
                        if(o1>o2) return -1;
                        return 0;
                    }
                });
            }

            System.out.println("Строки массива отсортированы по убыванию: ");

            for(int i=0;i<arr.length;i++)
                System.out.println(Arrays.toString(arr[i]));
        }
}
