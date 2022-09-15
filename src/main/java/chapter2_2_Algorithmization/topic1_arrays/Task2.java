package chapter2_2_Algorithmization.topic1_arrays;
import java.util.Scanner;
//    2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//    числом. Подсчитать количество замен.

public class Task2 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in); // Объявляем Scanner
            System.out.println("Enter array length: ");
            int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size

            Scanner input2 = new Scanner(System.in); // Объявляем Scanner
            System.out.println("Enter Z: ");
            int Z = input.nextInt(); // Читаем с клавиатуры Z

            int array[] = new int[size]; // Создаём массив int размером в size
            System.out.println("Insert array elements:");
            /*Пройдёмся по всему массиву, заполняя его*/
            for (int i = 0; i < size; i++) {
                array[i] = input.nextInt();
            }
            for (int i = 0; i < size; i++) {
                if (Z < array[i]) {
                    array[i] = Z; // Заполняем массив элементами, введёнными с клавиатуры
                    System.out.println("change: " + array[i]); // Выводим на экран, полученный массив
                } else {
                    System.out.println("original: " + array[i]); // Выводим на экран, полученный массив
                }

                System.out.println (" " + array[i]); // Выводим на экран, полученный массив
            }
        }
}
