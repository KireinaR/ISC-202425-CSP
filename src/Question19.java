package Java.Class12;

import java.util.Scanner;

public class Question19 {

    static int matrix[][];
    static int N;

    static void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        N = sc.nextInt();
        matrix = new int[N][N];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    static void getSaddlePoint() {
        boolean saddlePointFound = false;
        for (int i = 0; i < N; i++) {
            int minRowValue = matrix[i][0];
            int minRowIndex = 0;

            // Find the minimum element in the current row
            for (int j = 1; j < N; j++) {
                if (matrix[i][j] < minRowValue) {
                    minRowValue = matrix[i][j];
                    minRowIndex = j;
                }
            }

            // Check if the found minimum element is the maximum in its column
            boolean isSaddlePoint = true;
            for (int k = 0; k < N; k++) {
                if (matrix[k][minRowIndex] > minRowValue) {
                    isSaddlePoint = false;
                    break;
                }
            }

            if (isSaddlePoint) {
                System.out.println("Saddle Point: " + minRowValue);
                saddlePointFound = true;
                break;
            }
        }

        if (!saddlePointFound) {
            System.out.println("NO SADDLE POINT");
        }
    }

    static void exec() {
        accept();
        getSaddlePoint();
    }

    public static void main(String[] args) {
        exec();
    }
}
