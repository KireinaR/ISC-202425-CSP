package Java.Class12;

import java.util.Scanner;

public class Question14 {

    static int m, n;

    static void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("m = ");
        m = sc.nextInt();
        System.out.println();
        System.out.print("n = ");
        n = sc.nextInt();
        System.out.println();
        sc.close();

        if (m > 3000 || n > 3000 || m > n) {
            System.out.println("OUT OF RANGE");
            System.exit(0);
            ;
        }
    }

    static boolean isPrime(int a) {
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }

    static boolean isPalin(int x) {
        return new StringBuilder(Integer.toString(x)).reverse().toString().equalsIgnoreCase(Integer.toString(x));
    }

    static void exec() {
        accept();
        int c = 0;
        System.out.println("THE PRIME PALINDROME INTEGERS ARE:");
        for (int i = m; i <= n; i++) {
            if (isPalin(i) && isPrime(i)) {
                System.out.print(i + "  ");
                c++;
            }
        }
        System.out.println();
        System.out.println("FREQUENCY OF PRIME PALINDROME INTEGERS:" + c);
    }

    public static void main(String[] args) {
        exec();
    }

}
