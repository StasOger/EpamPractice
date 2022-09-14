package chapter1_Basics_of_software_code_development.topic1_lineProgram;

public class Task3 {
    public static void main(String[] args) {
        double x = Math.PI / 2;
        double y = Math.PI / 4;
        double z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println(z);
    }
}
