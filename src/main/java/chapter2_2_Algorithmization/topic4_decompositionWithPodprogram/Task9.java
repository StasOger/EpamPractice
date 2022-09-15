package chapter2_2_Algorithmization.topic4_decompositionWithPodprogram;
import java.util.Scanner;

//          Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы)
//         вычисления его площади, если угол между сторонами длиной X и Y— прямой.

public class Task9 {

        public static void perimetr(int x,int y,int z,int t){
            {
                double Ppryamtreug = 0.5 * x * y;

                double c = Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), 0.5);// длина 3 стороны треугольника со сторонами ZTC

                double poluperimetr = (z + t + c) * 0.5;

                double Ptreug = Math.pow((poluperimetr * (poluperimetr - z) * (poluperimetr - t) * (poluperimetr - c)), 0.5);
                double P = Ppryamtreug + Ptreug; //площадь четырехугольника
                System.out.println("Периметр четырехугольника равен: " + P);
            }
        }

        public static void main(String[] args) {
//    Будем искать P четырехугольника как сумму площадей прямоугольного треугольника и любого второго который образует с первым четырехугольник

            System.out.println("Введите 4 занчения сторон четырехугольника:");
            Scanner sc = new Scanner(System.in);
            perimetr(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        }
}
