package Java.Class12;

import java.util.Scanner;

//import java.util.Scanner;

public class Question2 {

    static int N;
    static int factors[];

    static void accept() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.close();
    }

    static void getFac() {
        String f = "";
        int d = N;
        while (d % 2 == 0) {
            f += "2 ";
            d /= 2;
        }

        for (int i = 3; i <= Math.sqrt(d); i += 2) {
            while (d % i == 0) {
                f += Integer.toString(i) + " ";
                d /= i;
            }
        }

        if (d > 2)
            f += Integer.toString(d) + " ";

        factors = new int[f.split(" ").length];
        for (int i = 0; i < factors.length; i++)
            factors[i] = Integer.parseInt(f.split(" ")[i]);
    }

    static boolean hasDup(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (i != j && a[i] == a[j])
                    return true;
            }
        }
        return false;
    }

    static int mobius(int n) {
        if (n == 1)
            return 1;
        else if (hasDup(factors))
            return 0;
        else
            return (int) Math.pow(-1, factors.length);
    }

    static void exec() {
        accept();
        getFac();
        System.out.print(N + " = ");
        if (N == 1)
            System.out.println("1");
        else {
            for (int i = 0; i < factors.length - 1; i++)
                System.out.print(factors[i] + " x ");
            System.out.println(factors[factors.length - 1]);
        }
        if (mobius(N) == -1)
            System.out.println("NUMBER OF DISTINCT PRIME FACTORS = " + factors.length);
        else if (mobius(N) == 0)
            System.out.println("DUPLICATE PRIME FACTORS");
        else if (mobius(N) == 1 && N == 1)
            System.out.println("NO PRIME FACTORS");
        System.out.println("M(" + N + ") = " + mobius(N));

    }

    public static void main(String[] args) {
        exec();
    }

}
