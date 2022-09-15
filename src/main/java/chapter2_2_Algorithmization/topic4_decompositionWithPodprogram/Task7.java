package chapter2_2_Algorithmization.topic4_decompositionWithPodprogram;

//Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Task7 {
        private static double fuctorial() {
            int fuck;
            int sumFuck=0;
            long[] fuctorial = new long[5];
            for (int i = 1; i<=9; i=i+2) {
                fuck = 1;
                for (int j = 1; j<=i; j++) {
                    fuck = fuck * j;
                }
                sumFuck = sumFuck+fuck;
                System.out.println(i + "! = " + fuck);
            }
            System.out.println("сумма факториалов = " + sumFuck);
            return 0;
        }

        public static void main(String[] args) {
            fuctorial();
        }
}
