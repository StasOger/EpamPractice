package chapter2_2_Algorithmization.topic3_arraysSort;

public class Task7 {

        /*
         * Пусть даны две неубывающие последовательности действительных чисел
         * a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm. Требуется указать те места, на
         * которые нужно вставлять элементы последовательности b1 <= b2 <= ... <= bm в
         * первую последовательность так, чтобы новая последовательность оставалась
         * возрастающей.
         */

        public static void main(String[] args) {

            int[] firstArray = {1, 3, 7, 9, 12, 50, 120};

            int[] secondArray = {-127, -3, 0, 2, 11, 99, 122};

            int[] newArray = new int[firstArray.length + secondArray.length];

            int firstIndex = 0;
            int secondIndex = 0;

            for (int i = 0; i < newArray.length; i++) {
                if (firstIndex == firstArray.length) {
                    newArray[i] = secondArray[secondIndex];
                    System.out.println("эл-т" + secondArray[secondIndex] +" нужно вставлять в конец первой последовательности");

                    secondIndex +=1;
                }else if(secondIndex == secondArray.length){
                    newArray[i] = firstArray[firstIndex];
                    firstIndex += 1;
                }else if( firstArray[firstIndex]<secondArray[secondIndex]) {
                    newArray[i] = firstArray[firstIndex];

                    firstIndex += 1;
                }else if( firstIndex == 0){
                    newArray[i] = secondArray[secondIndex];
                    System.out.println("эл-т " + secondArray[secondIndex] +" нужно вставлять в начало первой последовательности");
                    secondIndex += 1;
                }else{
                    newArray[i] = secondArray[secondIndex];
                    System.out.println("эл-т " + secondArray[secondIndex] +" нужно вставлять между числами" + firstArray[firstIndex-1] +" и "+ firstArray[firstIndex]+  " первой последовательности");
                    secondIndex += 1;
                }
            }
            System.out.println("Новый массив:");
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + "  ");
            }

        }
    }

//        эл-т -127 нужно вставлять в начало первой последовательности
//        эл-т -3 нужно вставлять в начало первой последовательности
//        эл-т 0 нужно вставлять в начало первой последовательности
//        эл-т 2 нужно вставлять между числами1 и 3 первой последовательности
//        эл-т 11 нужно вставлять между числами9 и 12 первой последовательности
//        эл-т 99 нужно вставлять между числами50 и 120 первой последовательности
//        эл-т122 нужно вставлять в конец первой последовательности
//        Новый массив:
//        -127  -3  0  1  2  3  7  9  11  12  50  99  120  122
