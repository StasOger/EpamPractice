package chapter2_2_Algorithmization.topic2_doubleArrays;

public class Task2 {

//    Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.


        public static void main(String[] args) {
            String[][] arr = new String[21][21];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                    if (i == j || i == x) arr[i][j] = "1";
                    else arr[i][j] = " ";
                    System.out.print(arr[i][j] + " ");
                }
                System.out.print("\n");
            }
        }
}
