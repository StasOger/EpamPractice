package chapter2_2_Algorithmization.topic1_arrays;
import java.util.Scanner;
// 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Task1 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in); // Объявляем Scanner
            System.out.println("Enter array length: ");
            int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
            int array[] = new int[size]; // Создаём массив int размером в size
            System.out.println("Insert array elements:");
            /*Пройдёмся по всему массиву, заполняя его*/
            for (int i = 0; i < size; i++) {
                array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
            }
            System.out.print ("Inserted array elements:");
            for (int i = 0; i < size; i++) {
                System.out.print (" " + array[i]); // Выводим на экран, полученный массив
            }

            Scanner input2 = new Scanner(System.in); // Объявляем Scanner
            System.out.println("Enter общее кратное: ");
            int kratnoe = input.nextInt();

            int sum = 0;

            for (int i = 0; i < size; i++) {
                if (array[i] % kratnoe == 0) {
                    //System.out.println (" " + array[i]); // Выводим на экран, полученный массив
                    sum = sum + array[i];
                }
            }
            System.out.println("сумма: " + sum);
        }
}
