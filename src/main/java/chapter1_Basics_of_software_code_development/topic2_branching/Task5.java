package chapter1_Basics_of_software_code_development.topic2_branching;
import java.util.Scanner;

public class Task5 {
        public static void main(String[] args) {

            System.out.println("Введите значение Х");
            Scanner in1 = new Scanner(System.in);

            double x = in1.nextInt();

            if (x <= 3){
                double y = Math.pow(x, 2) - 3*x + 9;
                System.out.println(y);
            } else {
                double y = 1 / (Math.pow(x, 3) + 6);
                System.out.println(y);
            }
        }
}
