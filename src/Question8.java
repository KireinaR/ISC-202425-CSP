package Java.Class12;

import java.util.Scanner;

public class Question8 {

    static int N;
    static String names[];

    static void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        N = sc.nextInt();
        sc.nextLine();
        if (N < 2 || N > 9) {
            System.out.println("INVALID INPUT.");
            System.exit(0);
        }
        System.out.println();
        names = new String[N];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Team " + (i + 1) + ": ");
            names[i] = sc.nextLine();
            System.out.println();
        }
        sc.close();
    }

    static void display() {
        int maxLength = 0;

        // Find the maximum length of the team names
        for (String name : names) {
            if (name.length() > maxLength) {
                maxLength = name.length();
            }
        }

        // Display the team names vertically
        for (int i = 0; i < maxLength; i++) {
            for (String name : names) {
                if (i < name.length()) {
                    System.out.print(name.charAt(i));
                } else {
                    System.out.print(' ');
                }
                System.out.print("        ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        accept();
        display();
    }
}
