package Java.Class12;

import java.util.Scanner;

public class Question17 {

    static int N;

    static void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        N = sc.nextInt();
        System.out.println();
        if (N >= 50) {
            System.out.println("OUT OF RANGE");
            System.exit(0);
        }
        sc.close();
    }

    static boolean isLucky(int number) {
        if (number < 1) {
            return false; // Only positive integers can be lucky numbers
        }

        boolean[] isRemoved = new boolean[number + 1]; // Array to mark removed numbers

        int counter = 2; // Start with removing every 2nd number
        while (true) {
            int removedCount = 0;
            int currentIndex = 0;

            for (int i = 1; i <= number; i++) {
                if (!isRemoved[i]) {
                    currentIndex++;
                    if (currentIndex % counter == 0) {
                        isRemoved[i] = true;
                        removedCount++;
                    }
                }
            }

            if (number <= counter) {
                break;
            }
            counter++;
            if (removedCount == 0) {
                break;
            }
        }

        return !isRemoved[number];
    }

    static void exec() {
        accept();
        for (int i = 1; i <= N; i++) {
            if (isLucky(i))
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        exec();
    }

}
