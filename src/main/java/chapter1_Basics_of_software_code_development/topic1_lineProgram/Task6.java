package chapter1_Basics_of_software_code_development.topic1_lineProgram;
import java.util.Scanner;

public class Task6 {
        public static void main(String[] args) {

            Scanner in1 = new Scanner(System.in);
            int x = in1.nextInt();
            Scanner in2 = new Scanner(System.in);
            int y = in2.nextInt();
            if (y>=-3 & y<=-0) {
                if (x>=-4 & x<=0){
                    System.out.println(true);
                } else System.out.println(false);
            } else if (y>=-0 & y<=4) {
                if (x>=-2 & x<=2){
                    System.out.println(true);
                } else System.out.println(false);
            } else System.out.println(false);
        }
}
