//package chapter2_2_Algorithmization.topic4_decompositionWithPodprogram;
//
//public class Task17 {
//    import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.Scanner;
//
//    public class Sum {
//        public static void main(String[] args) {
//            try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
//
//                System.out.println("Введите число: ");
//                Scanner sc = new Scanner(System.in);
//                int n = Integer.valueOf(sc.nextLine());
//                System.out.println("n: " + n);
//                int nn = n;
//                massNumber(n, nn);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        private static void massNumber(int n, int nn) {
////  создаем массив состоящий из цифр числа
//            int length = String.valueOf(n).length();
//            int[] array = new int[length];
//            int j;
//            for (j = length - 1; j >= 0; j--) {
//                int arrayys = n % 10;
//                n /= 10;
//                array[j] = arrayys;
//            }
//            sum(array,n,nn);
//            System.out.println(Arrays.toString(array));
//        }
//
//        private static void sum(int[] array, int n, int nn) {
////  считаем сумму цифр массива
//            int sum = 0;
//            for (int k = 0; k < array.length; k++) {
//                sum = sum + array[k];
//            }
//            System.out.println("сумма цифр: "+ sum);
//            minusRez(sum, nn);
//        }
//
//        private static void minusRez(int sum, int nn) {
////  отнимаем от числа n сумму его цифр
//
//        }
//    }
//
//
//
//
//
//
//
//
//
//    public class EPAM {
//        //    private static int countSubtraction(int number) {
////        int count = 0;
////        while (number > 0) {
////            number -= countSumOfDigits(number);
////            count++;
////        }
////        return count;
////    }
////
////    private static int countSumOfDigits(int number) {
////        int sum = 0;
//////        while (number > 0) {
//////            sum += number % 10;
//////            number /= 10;
////////            sum += String.valueOf(number).length();
//////        }
////        for (int k = 0; k < String.valueOf(number).length(); k++) {
////            sum += String.valueOf(number).length();
////        }
////
////        System.out.print(sum + ", ");
////        return sum;
////    }
////
////    public static void main(String[] args) {
////        int n = countSubtraction(21);
////        System.out.println("\nThe quantity of the substractions: " + n);
////    }
////}
////
////
//        private static int countSubtraction(int number) {
//            int count = 0;
//            while (number > 0) {
//                number -= countSumOfDigits(number);
//                count++;
//            }
//            return count;
//        }
//
//        private static int countSumOfDigits(int number) {
//            int sum = 0;
//            while (number > 0) {
//                sum += number % 10;
//                number /= 10;
//            }
//            System.out.print(sum + ", ");
//            return sum;
//        }
//
//        public static void main(String[] args) {
//            int n = countSubtraction(12);
//            System.out.println("\nThe quantity of the substractions: " + (n+8));
//        }
//    }
//
