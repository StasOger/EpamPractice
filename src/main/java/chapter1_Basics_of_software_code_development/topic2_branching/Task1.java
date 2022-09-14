package chapter1_Basics_of_software_code_development.topic2_branching;
import java.util.Scanner;

public class Task1 {
        public static void main(String[] args) {

            Scanner in1 = new Scanner(System.in);
            int a = in1.nextInt();
            Scanner in2 = new Scanner(System.in);
            int b = in2.nextInt();
            int c = 180-a-b;
            if (c > 0) {
                if ((a == 90) | (b == 90) | (c == 90)){
                    System.out.println("треугольник прямоугольный");
                } else {
                    System.out.println("треугольник существует");
                }
            } else {
                System.out.println("треугольник НЕ существует");
            }
        }
}
