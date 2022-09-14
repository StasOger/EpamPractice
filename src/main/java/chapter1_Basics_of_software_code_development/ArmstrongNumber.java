package chapter1_Basics_of_software_code_development;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Найти все числа Амстронга от 1 до: (введите число) ");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        findArmstrongNumber(k);
    }

    private static void findArmstrongNumber (int k){
        int kk = k;
        int d = 0;
        System.out.print("Числа Армстронга: ");
        for (int i=1; i<kk; i++){
//  Количество цифр в числе i
//            System.out.println(i);
            int length = String.valueOf(i).length();
            int sum = 0;
            k = i;
            while(k != 0){
//  Суммирование цифр числа
                d = (k % 10);
                k/=10;
                sum += Math.pow(d, length);
            }
//  Вывод числа Армстронга
            if (i == sum){
                System.out.print(i + ", ");
            }
        }
    }
}
