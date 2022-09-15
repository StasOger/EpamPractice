package chapter1_Basics_of_software_code_development.topic2_branching;

import java.util.Scanner;
//  3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
//   Определить, будут ли они расположены на одной прямой.
public class Task3 {
        public static void main(String[] args) {

            Scanner in1 = new Scanner(System.in);
            int x1 = in1.nextInt();
            Scanner in2 = new Scanner(System.in);
            int y1 = in2.nextInt();
            Scanner in3 = new Scanner(System.in);
            int x2 = in3.nextInt();
            Scanner in4 = new Scanner(System.in);
            int y2 = in4.nextInt();
            Scanner in5 = new Scanner(System.in);
            int x3 = in5.nextInt();
            Scanner in6 = new Scanner(System.in);
            int y3 = in6.nextInt();

            double k1 = (y1-y2)/(x1-x2);
            double k2 = (y2-y3)/(x2-x3);


            if (k1 == k2){
                System.out.println("точки лежат на одной прямой");
            } else {
                System.out.println("точки НЕ лежат на одной прямой");
            }
        }
}
