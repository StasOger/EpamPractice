package chapter2_2_Algorithmization.topic1_arrays;
import java.util.Scanner;

public class Task3 {
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
            int polozhit = 0;
            int otricat = 0;
            int nullev = 0;

            for (int i = 0; i < size; i++) {
                if (0 < array[i]) {
                    polozhit = polozhit + 1; // Считаем количество положительных элементов
                    System.out.println("Положительных: " + polozhit); // Выводим на экран, полученный массив
                } else if (0 > array[i]) {
                    otricat = otricat + 1; // Считаем количество положительных элементов
                    System.out.println("отриц: " + otricat); // Выводим на экран, полученный массив
                } else {
                    nullev = nullev + 1; // Считаем количество положительных элементов
                    System.out.println("нулевых: " + nullev); // Выводим на экран, полученный массив
                }
            }
        }
}
