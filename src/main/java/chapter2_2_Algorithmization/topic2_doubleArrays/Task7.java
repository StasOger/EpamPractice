package chapter2_2_Algorithmization.topic2_doubleArrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
        public static void main(String[] args) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                System.out.println("Enter the square matrix with even number n: ");
                int n = Integer.parseInt(reader.readLine());
                double[][] A = new double[n][n];


                for (int i = 0; i < A.length; i++) {
                    for (int j = 0; j < A[i].length; j++) {
                        A[i][j] = Math.sin((Math.pow(i, 2)- Math.pow(j, 2))/n);

                        System.out.printf("%10f", A[i][j]);
                    }
                    System.out.println();
                }

                int count = 0;
                for (int i = 0; i < A.length; i++) {
                    for (int j = 0; j < A[i].length; j++) {
                        if (A[i][j] < 0) {
                            count++;
                        }
                    }
                }
                System.out.println("Amount of positive numbers: " + count);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


//          0,000000 -0,198669 -0,717356 -0,973848  0,058374
//          0,198669  0,000000 -0,564642 -0,999574 -0,141120
//          0,717356  0,564642  0,000000 -0,841471 -0,675463
//          0,973848  0,999574  0,841471  0,000000 -0,985450
//          -0,058374  0,141120  0,675463  0,985450  0,000000
//          Amount of positive numbers: 10
