package chapter2_2_Algorithmization.topic4_decompositionWithPodprogram;
import java.util.Scanner;

/*
 * Написать метод(методы) для нахождения наибольшего общего делителя и
 * наименьшего общего кратного двух натуральных чисел:
 * НОК(А,В) = A*B / НОД(A,B)
 */

public class Task1 {

        private static int mostCommonMultiple(int x, int y) {
            if (x<=0 || y<=0) throw new UnsupportedOperationException("Incorrect input");
            while(x!=0 && y!=0){
                if (x>y) x=x%y;
                else y=y%x;
            }
            return x+y;
        }

        private static int leastCommonMultiple(int n1, int n2) {
//        int n1 = 72, n2 = 120, gcd = 1;
            int gcd = 1;
            for(int i = 1; i <= n1 && i <= n2; ++i) {
                // Checks if i is factor of both integers
                if(n1 % i == 0 && n2 % i == 0)
                    gcd = i;
            }

            int lcm = (n1 * n2) / gcd;
            return gcd;
        }

        public static void main(String[] args) {

            try {
                System.out.println("Введите два числа: ");
                Scanner sc = new Scanner(System.in);
                int x = Integer.valueOf(sc.nextLine());
                int y = Integer.valueOf(sc.nextLine());
                int nod = mostCommonMultiple(x,y);
                int nok = leastCommonMultiple(x,y);
                System.out.println("NOK: " + nok);
                System.out.println("NOD: " + nod);
            } catch (NumberFormatException | UnsupportedOperationException e) {
                System.out.println(e.getMessage());
            }
        }
}
