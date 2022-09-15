package chapter2_2_Algorithmization.topic1_arrays;
import java.util.Scanner;
public class Task5 {
    //5. Даны целые числа а 1 ,а 2 ,..., а n . Вывести на печать только те числа, для которых а i > i.

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in); // Объявляем Scanner
            System.out.println("Enter array length: ");
            int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size

            int array[] = new int[size]; // Создаём массив int размером в size
            System.out.println("Insert array elements:");
            /*Пройдёмся по всему массиву, заполняя его*/
            for (int i = 0; i < size; i++) {
                array[i] = input.nextInt();
            }

            for (int i = 0; i < size; i++) {
                if (array[i] > i){
                    System.out.print(array[i]);
                }

            }
        }
}
