package Java.Class12;

import java.util.Scanner;

public class Question7 {

    static int N;

    static void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        N = sc.nextInt();
        if (N <= 9 || N > 50) {
            System.out.println("Invalid input. Number is out of range.");
            System.exit(0);
        }
        if (N % 2 != 0) {
            System.out.println("Invalid input. Number is odd.");
            System.exit(0);
        }

        System.out.println();
        sc.close();
    }

    static boolean isPrime(int a) {
        for (int i = 2; i < a / 2; i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }

    static String[] primePair(int n) {

        String pair = "";
        String pf = "";
        String prFac[];
        for (int i = 2; i < n; i++) {
            if (isPrime(i))
                pf += Integer.toString(i) + " ";
        }

        prFac = pf.trim().split(" ");
        for (int i = 0; i < prFac.length - 1; i++) {
            for (int j = i; j < prFac.length; j++) {
                if (Integer.parseInt(prFac[i]) + Integer.parseInt(prFac[j]) == n)
                    pair += prFac[i] + "+" + prFac[j] + " ";
            }
        }
        return pair.trim().split(" ");

    }

    static void exec() {
        accept();
        System.out.println("Prime pairs are:");
        String pairs[] = primePair(N);
        for (int i = 0; i < pairs.length; i++)
            System.out.println(pairs[i]);
    }

    public static void main(String[] args) {
        exec();
    }

}
