package chapter2_2_Algorithmization.topic3_arraysSort;

import java.util.Arrays;
//
//          Сортировка обменами. Дана последовательность чисел a1<=a2<=   <=aN .Требуется переставить числа в
//        порядке возрастания. Для этого сравниваются два соседних числа a i и a i + 1 . Если a i > a i + 1 , то делается
//        перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//        Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

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
