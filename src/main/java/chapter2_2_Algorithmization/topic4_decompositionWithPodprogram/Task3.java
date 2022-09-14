package chapter2_2_Algorithmization.topic4_decompositionWithPodprogram;
import java.util.Scanner;

public class Task3 {
        private static double square(double b) {
            double x = 0;
            if (b<=0){
                System.out.println("Неверный формат длины стороны шестиугольника");
            } else {
                x =  6 * 0.5 * Math.pow(b, 2) * Math.sin((Math.PI)/3);
            }
            return x;
        }

        public static void main(String[] args) {
            System.out.println("Введите длину стороны правильного шестиугольника: ");
            Scanner sc = new Scanner(System.in);
            double c = square(sc.nextInt());
            System.out.println("Площадь правильного шестиугольника = " + c);
        }
}
