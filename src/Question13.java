package Java.Class12;

import java.util.Scanner;

public class Question13 {

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

        if (m > n) {
            System.out.println("Invalid Input");
            System.exit(0);
        }
    }

    static boolean isPrime(int a) {
        for (int i = 2; i < a / 2; i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }

    static int digitSum(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    static boolean isMagic(int b) {
        int k = digitSum(b);
        if(digitSum(k) == 1)
            return true;
        else if(digitSum(k) == 0) return false;
    }

    static void exec() {
        accept();
        System.out.println("THE COMPOSITE MAGIC INTEGERS ARE:");
        int c = 0;
        for (int i = m; i <= n; i++) {
            if (!isPrime(i) && isMagic(i)) {
                System.out.print(i + "  ");
                c++;
            }
        }
        System.out.println();
        System.out.println("FREQUENCY OF COMPOSITE MAGIC INTEGERS IS: " + c);
    }

    public static void main(String[] args) {
        exec();
    }

}
