package chapter1_Basics_of_software_code_development.topic1_lineProgram;

public class Task4 {
        public static void main(String[] args) {

            double R = 333.666;
            String str = Double.toString(R);
            StringBuffer buffer = new StringBuffer(str);
            buffer.reverse();
            System.out.println(buffer);
        }
}
