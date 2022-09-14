package chapter1_Basics_of_software_code_development.topic2_branching;
import java.util.Scanner;

public class Task4 {
        public static void main(String[] args) {

            System.out.println("Введите размер А прямоуг отверстия");
            Scanner in1 = new Scanner(System.in);
            int A = in1.nextInt();
            System.out.println("Введите размер B прямоуг отверстия");
            Scanner in2 = new Scanner(System.in);
            int B = in2.nextInt();

            System.out.println("Введите размер x кирпича");
            Scanner in3 = new Scanner(System.in);
            int x = in3.nextInt();
            System.out.println("Введите размер y кирпича");
            Scanner in4 = new Scanner(System.in);
            int y = in4.nextInt();
            System.out.println("Введите размер z кирпича");
            Scanner in5 = new Scanner(System.in);
            int z = in5.nextInt();

            if ((A>=x | A>=y | A>=z) & (B>=x | B>=y | B>=z)){
                System.out.println("кирпич проходит в отвествие");
            } else {
                System.out.println("кирпич НЕ проходит в отвествие");
            }
        }
}
