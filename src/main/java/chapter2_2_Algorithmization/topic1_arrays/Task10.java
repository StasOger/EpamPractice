package chapter2_2_Algorithmization.topic1_arrays;
import java.util.Random;
import java.util.Scanner;

/*  10.  Дан  целочисленный  массив  с  количеством  элементов  п.
    Сжать  массив,  выбросив  из  него  каждый  второй элемент (освободившиеся элементы заполнить нулями)
    Примечание. Дополнительный массив не использовать.
*/

public class Task10 {
        public static void main(String[] args) {
            Random rand = new Random();
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите размер массива - ");
            int n = scan.nextInt();
            int []  arr = new int[n];
//выводим рандомный массив
            for (int i = 0;i< arr.length;i++) {
                arr[i] = rand.nextInt(10)+5;
                System.out.print(arr[i] + "  ");
            }
            System.out.println();
//заменяем каждый второй эл-т на 0
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 != 0) {
                    arr[i] = 0;
                }
                System.out.print(arr[i] + "  ");
            }
            System.out.println();
//сжимаем массив, убирая каждый второй эл-т
            int counter = 1;
            for (int i = 0; i < arr.length; i += 2) {
                arr[counter - 1] = arr[i];
                counter++;
                System.out.print(arr[i] + "  ");
            }
            System.out.println();
        }
}
