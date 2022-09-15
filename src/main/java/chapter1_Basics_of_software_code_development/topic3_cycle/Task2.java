package chapter1_Basics_of_software_code_development.topic3_cycle;

import java.util.Scanner;
//  2. Вычислить значения функции на отрезке [а,b] c шагом h:

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите диапазон вычисления [a,b]: ");
        Scanner in1 = new Scanner(System.in);
        int a = in1.nextInt();
        int b = in1.nextInt();
        if (a<b){
            System.out.println("Введите шаг вычисления h: ");
            int h = in1.nextInt();
            int y;
            for (int i=a;i<b;i = i + h){
                if(i<=2){
                    y = -i;
                    System.out.println("y = " + y);
                } else if (i>2){
                    y = i;
                    System.out.println("y = " + y);
                }
            }
        } else {
            System.out.println("incorrect [a,b], you need to write 'b' biggest then 'a' ");
        }

    }
}

//Введите диапазон вычисления [a,b]:
//0
//5
//Введите шаг вычисления h:
//1

//y = 0
//y = -1
//y = -2
//y = 3
//y = 4
