package chapter1_Basics_of_software_code_development.topic2_branching;
import java.util.Scanner;

public class Task2 {
        public static void main(String[] args) {

            Scanner in1 = new Scanner(System.in);
            int a = in1.nextInt();
            Scanner in2 = new Scanner(System.in);
            int b = in2.nextInt();
            Scanner in3 = new Scanner(System.in);
            int c = in3.nextInt();
            Scanner in4 = new Scanner(System.in);
            int d = in4.nextInt();
            int M = Math.max(Math.min(a, b), Math.min(c, d));
            System.out.println(M);
        }
}
