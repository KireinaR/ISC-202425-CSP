package Java.Class12;

import java.util.Scanner;

public class Question9 {

    static int N;

    static void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("N = ");
        N = sc.nextInt();
        if (N > 1000) {
            System.out.println("INVALID INPUT.");
            System.exit(0);
        }
        sc.close();
    }

    static void box() {
        if (N >= 48) {

        }
    }

}
