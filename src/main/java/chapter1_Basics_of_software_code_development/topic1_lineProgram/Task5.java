package chapter1_Basics_of_software_code_development.topic1_lineProgram;
import java.util.Scanner;

public class Task5 {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            int T = in.nextInt();
            int HH = T/3600;
            int OstSec = T - HH*3600;
            int MM = OstSec/60;
            int SS = OstSec - MM*60;

            System.out.println(HH + "h" + MM + "m" + SS + "s");
        }
}
