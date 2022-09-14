package chapter1_Basics_of_software_code_development.topic3_cycle;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        //   rus: Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
        //        m и n вводятся с клавиатуры.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start of line numbers m ");
        int m = scanner.nextInt();
        System.out.println("Enter end of line numbers n ");
        int n = scanner.nextInt();

        while (m <= n) {
            System.out.print("\n number: " + m);
            System.out.print(" its dividers: ");
            for (int i = 2; i <= m - 1; i++) {
                if (m % i == 0) {
                    System.out.print(i + ",");
                }
            }
            m = m + 1;
        }
    }
}