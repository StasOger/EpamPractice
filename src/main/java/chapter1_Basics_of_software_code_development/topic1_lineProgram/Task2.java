package chapter1_Basics_of_software_code_development.topic1_lineProgram;

public class Task2 {

        public static void main(String[] args) {
            int a = 2;
            int b = 3;
            int c = 4;
            double z = (b + Math.pow((Math.pow(b, 2) + 4*a*c), 0.5))/(2*a) - Math.pow(a, 3) + Math.pow(b, -2);
            System.out.println(z);
        }
}
