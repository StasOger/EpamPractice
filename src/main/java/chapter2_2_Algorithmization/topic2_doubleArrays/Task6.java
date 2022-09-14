package chapter2_2_Algorithmization.topic2_doubleArrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {

        public static void main(String[] args) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                System.out.println("Enter the square matrix with even number n: ");
                int n = Integer.parseInt(reader.readLine());
                int[][] matrix = new int[n][n];

                if (n % 2 == 0) {
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            if ((j >= i && j + i < n ) || ( j <= i && j + i >= n - 1)) {
                                matrix[i][j] = 1;
                            } else {
                                matrix[i][j] = 0;
                            }
                            System.out.printf("%2d ", matrix[i][j]);
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println(" Nnumber N is odd ");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

//         1  1  1  1  1  1
//         0  1  1  1  1  0
//         0  0  1  1  0  0
//         0  0  1  1  0  0
//         0  1  1  1  1  0
//         1  1  1  1  1  1

