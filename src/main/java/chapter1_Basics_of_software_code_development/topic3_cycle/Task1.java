package chapter1_Basics_of_software_code_development.topic3_cycle;

import java.util.Scanner;
//   1. Напишите программу, где пользователь вводит любое целое положительное число.
//   А программа суммирует все числа от 1 до введенного пользователем числа.

public class Task1 {
        public static void main(String[] args) {

            System.out.println("Введите натуральное число");
            Scanner in1 = new Scanner(System.in);
            int x = in1.nextInt();
            int sum = 0;

            for (int i = 1; i <= x; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        }
}
