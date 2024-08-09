package Java.Class12;

import java.util.Scanner;

class Question1 {

    static int m, n;

    static void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nm = ");
        m = sc.nextInt();
        System.out.print("\nn = ");
        n = sc.nextInt();

        if (m > n) {
            System.out.println("\nInvalid Input.");
            System.exit(0);
        }

        sc.close();
    }

    static boolean isPrime(int a) {
        for (int i = 2; i < a / 2; i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }

    static int rev(int x) {
        int res = 0;
        while (x != 0) {
            res = (res * 10) + (x % 10);
            x /= 10;
        }
        return res;
    }

    static boolean isRevTo(int b, int c) {
        return new StringBuilder(b).reverse().toString().equals(Integer.toString(c));
    }

    static boolean isAdam(int num) {
        int rev = rev(num);
        int nsq = num * num;
        int rsq = rev * rev;

        return nsq == rev(rsq);
    }

    static void exec() {
        accept();
        int c = 0;
        boolean isNil = true;
        System.out.println("\nThe Prime-Adam integers are:");
        for (int i = m; i <= n; i++) {
            if (isPrime(i) && isAdam(i)) {
                System.out.print(i + "  ");
                c++;
                isNil = false;
            }
        }
        if (isNil)
            System.out.print("\nNIL");
        System.out.println("\nFrequency of Prime-Adam integers is: " + c);
    }

    public static void main(String[] args) {
        exec();
    }

}