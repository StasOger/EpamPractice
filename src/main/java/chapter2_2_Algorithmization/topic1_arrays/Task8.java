package chapter2_2_Algorithmization.topic1_arrays;
import java.util.Arrays;

/*
        Дана последовательность целых чисел a 1 , a 2 ,  , a n . Образовать новую последовательность, выбросив из
        исходной те члены, которые равны min( a 1 , a 2 ,  , a n ) .
*/

public class Task8 {
        public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,6,7,8,9,10};
            int[] newArr = null;
            int elementToBeDeleted = 5;
            System.out.println("Original Array is: "+Arrays.toString(arr));

            int min = arr[0];
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] < min)
                    min = arr[i];
            }
            System.out.println("Min is " + min);

            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] == min){
                    newArr = new int[arr.length - 1];
                    for(int index = 0; index < i; index++){
                        newArr[index] = arr[index];
                    }
                    for(int j = i; j < arr.length - 1; j++){
                        newArr[j] = arr[j+1];
                    }
                    break;
                }
            }
            System.out.println("New Array after deleting element = "+min+" and shifting: "+ Arrays.toString(newArr));
        }
}
