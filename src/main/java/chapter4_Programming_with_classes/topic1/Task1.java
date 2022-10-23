package chapter4_Programming_with_classes.topic1;

import java.util.Scanner;

//          Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
//        переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
//        наибольшее значение из этих двух переменных.

public class Task1 {

        public static void main(String[] args) {
            int b = 2;
            int a = 1;
            show(a, b);
            changeNumber(a, b);
            sum(a, b);
            findMore(a, b);
        }

        private static void show(int a, int b){
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }

        private static void changeNumber(int a, int b){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Change a: ");
            a = scanner.nextInt();

            System.out.println("Change b: ");
            b = scanner.nextInt();

            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }

        private static void sum(int a, int b){
            System.out.println("sum = "+ (a+b));
        }

        private static void findMore(int a, int b){
            if (a>b){
                System.out.println("a>b");
            } else if (a<b){
                System.out.println("a<b");
            } else {
                System.out.println("a=b");
            }
        }
}
