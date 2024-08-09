package Java.Class12;

import java.util.Scanner;

public class Question3 {
    static int m, n;

    static void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nm = ");
        m = sc.nextInt();
        System.out.print("\nn = ");
        n = sc.nextInt();

        if (m > n || m < 99 || n > 10000) {
            System.out.println("\nInvalid Input.");
            System.exit(0);
        }

        sc.close();
    }

    static long concat(long a) {
        String temp = Long.toString(a);
        temp += Long.toString(a * 2);
        temp += Long.toString(a * 3);
        return Long.parseLong(temp);
    }

    static boolean isFasc(long n) {
        String num = Long.toString(n);
        if (num.length() < 8)
            return false;

        char digits[] = num.toCharArray();
        boolean flag[] = new boolean[10];

        for (char ch : digits) {
            int digit = ch - '0';

            if (flag[digit] && digit != 0)
                return false;
            flag[digit] = true;
        }
        for (int i = 1; i < flag.length; i++) {
            if (!flag[i])
                return false;
        }

        return true;
    }

    static void exec() {
        accept();
        int c = 0;
        boolean isNil = true;
        System.out.println("\nThe Fascinating numbers are:");
        for (int i = m; i <= n; i++) {
            if (isFasc(concat(i))) {
                System.out.print(i + "  ");
                c++;
                isNil = false;
            }
        }
        if (isNil)
            System.out.print("\nNIL");
        System.out.println("\nFrequency of Fascinating numbers is: " + c);
    }

    public static void main(String[] args) {
        exec();
    }

}
