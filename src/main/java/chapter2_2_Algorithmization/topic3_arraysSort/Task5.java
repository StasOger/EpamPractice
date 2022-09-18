package chapter2_2_Algorithmization.topic3_arraysSort;

import java.util.Arrays;
//
//          Сортировка вставками. Дана последовательность чисел a1,a2,a3,a4...aN.
//        Требуется переставить числа в порядке возрастания. Делается это следующим образом.
//        Пусть a1, a2, a3 .. aN упорядоченная последовательность, т.е. a1<=a2<=...<=aN.
//        Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
//        последовательность была тоже возрастающей.
//        Процесс производится до тех пор, пока все элементы от i+1 до n не будут перебраны.
//        Примечание. Место помещения очередного элемента в отсортированную часть производить
//        с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

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