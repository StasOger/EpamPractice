package chapter1_Basics_of_software_code_development;

import java.util.Scanner;

public class Test1 {

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
