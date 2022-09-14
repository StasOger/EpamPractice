package chapter1_Basics_of_software_code_development.topic3_cycle;
import java.util.Scanner;

public class Task8 {
        public static void main(String[] args) {

            System.out.println("Введите два числа: ");
            Scanner sc = new Scanner(System.in);
            long a = sc.nextLong();
            long b = sc.nextLong();
            int lengthA = String.valueOf(a).length();
            int lengthB = String.valueOf(b).length();
            //  Количество цифр в числе i
//            System.out.println(i);

            long d1 = 0;
            long d2 = 0;

            for (int i=1; i<=lengthA; i++){
                d1 = (a % 10);
                a/=10;
                for (int j=1; j<=lengthB; j++){
                    d2 = (b % 10);
                    b/=10;
                    if (d1==d2){
                        System.out.println("общие цифры чисел A и B: " + d1);
                    }
                }
            }
        }
    }