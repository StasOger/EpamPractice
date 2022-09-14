//package chapter2_2_Algorithmization.topic4_decompositionWithPodprogram;
//
//public class Task9 {
//    import java.util.Scanner;
//
//
//    public class EPAM {
//
//        public static void perimetr(int x,int y,int z,int t){
//            {
//                double Ppryamtreug = 0.5 * x * y;
//
//                double c = Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), 0.5);// длина 3 стороны треугольника со сторонами ZTC
//
//                double poluperimetr = (z + t + c) * 0.5;
//
//                double Ptreug = Math.pow((poluperimetr * (poluperimetr - z) * (poluperimetr - t) * (poluperimetr - c)), 0.5);
//                double P = Ppryamtreug + Ptreug; //площадь четырехугольника
//                System.out.println("Периметр четырехугольника равен: " + P);
//            }
//        }
//
//        public static void main(String[] args) {
////    Будем искать P четырехугольника как сумму площадей прямоугольного треугольника и любого второго который образует с первым четырехугольник
//
//            System.out.println("Введите 4 занчения сторон четырехугольника:");
//            Scanner sc = new Scanner(System.in);
//            perimetr(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
//        }else{  // Двойной четный порядок
//            doubleEvenMagic(n,array);
//        }
//        printSquare(array);
//    }
//
//
//
//
//
//    public class EPAM {
//        public static void main(String[] args) {
//            System.out.println("Пожалуйста, выберите порядок вывода магического квадрата:");
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            int array[][] = new int[n][n];
//            if (n%2!=0){  // Нечетный порядок
//                oddMagic(n,array);
//            }else if (n%4!=0){  // Одиночный и четный порядок
//                return;import java.util.Scanner;
//
//
//                public static void oddMagic(int n,int array[][]){
//                    int i = 0;
//                    int j = n/2;
//                    for (int k = 1; k <= n*n; k++) {
//                        array[i][j] = k;
//                        if (k%n==0) {  // Если текущее число кратно n, спускаемся вниз
//                            i++;
//                        }else{  // Если текущее число не кратно n, идем вверх влево
//                            i--;
//                            j++;
//                            if (i<0) i=n-1;
//                            if (j>n-1) j=0;
//                        }
//                    }
//                }
//
//                public static void doubleEvenMagic(int n,int array[][]){
//                    int c1=1,c2=n*n;
//                    for (int i = 0; i < n; i++) {
//                        for (int j = 0; j < n; j++) {
//                            if (i%4==j%4||(i+j)%4==3){  // Диагональ перевернута
//                                array[i][j] = c2;
//                            }else{  // Недиагональный передний ряд
//                                array[i][j] = c1;
//                            }
//                            c2--;
//                            c1++;
//                        }
//                    }
//                }
//
//                public static void singleEvenMagic(int n,int array[][]){
//                    System.out.println("Думаю ... чтобы быть в курсе ...");
//                }
//
//                public static void printSquare(int array[][]){
//                    for (int i = 0; i < array.length; i++) {
//                        for (int j = 0; j < array[i].length; j++) {
//                            System.out.printf("%4d",array[i][j]);
//                        }
//                        System.out.println();
//                    }
//                }
//            }
//
