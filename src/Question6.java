package Java.Class12;

import java.util.Scanner;

public class Question6 {

    static int a[], b[][], N;

    static void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nN = ");
        N = sc.nextInt();
        a = new int[N];
        b = new int[N][N];

        System.out.print("\nENTER ELEMENTS OF 1D ARRAY: ");
        for (int i = 0; i < a.length; i++)
            a[i] = sc.nextInt();

        sc.close();
    }

    static void sort1D() {
        int n = a.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (a[j - 1] > a[j]) {
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    static void fill2D() {
        int x = 0; // variable used for storing elements in array.
        int m, l;
        for (int i = N; i >= 1; i--) // 1st pattern condition
        {
            for (int j = 1; j <= i; j++) {
                b[x][j - 1] = a[j - 1]; // storing first pattern elements in 2D array
            }
            x++;
        }
        m = 1;
        l = N;
        for (int i = 1; i < N; i++) // 2nd pattern condition
        {
            for (int j = 1; j <= i; j++) {
                b[m][l - 1] = a[j - 1]; // storing 2nd pattern in 2D array
                l++;
            }
            m++;
            l = l - m;
        }
    }

    static void exec() {
        accept();
        sort1D();
        fill2D();
        System.out.println("\nSORTED ARRAY: " + a.toString().replace("[", "").replace("]", ""));
        System.out.println("FILLED MATRIX:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(b[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        exec();
    }

}
