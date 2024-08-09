package Java.Class12;

import java.util.Scanner;

public class Question12 {

    static int M, N;

    static void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 100 <= M <= 10000: ");
        M = sc.nextInt();
        System.out.println();
        System.out.print("Enter 0 < N < 100: ");
        N = sc.nextInt();

        sc.close();

        if (M < 100 || M > 10000) {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }

        if (N <= 0 || N >= 100) {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
    }

    static int digitSum(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    static int getSmallestSum() {
        int n = M + 1;

        while (true) {
            if (digitSum(n) == N)
                return n;
            n++;
        }
    }

    static void exec() {
        accept();
        int s = getSmallestSum();
        System.out.println("The required number = " + s);
        System.out.println("Total number of digits = " + String.valueOf(s).length());
    }

    public static void main(String[] args) {
        exec();
    }

}
