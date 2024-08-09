package Java.Class12;

import java.util.Scanner;

public class Question10 {

    static int N;
    static String ans[][];
    static String key[] = new String[5];

    static void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of participants N = ");
        N = sc.nextInt();
        sc.nextLine();
        System.out.println();
        ans = new String[N][5];

        for (int i = 0; i < ans.length; i++) {
            System.out.print("Participant " + (i + 1) + ": ");
            String ch = sc.nextLine();
            int p = 0;
            for (String c : ch.split(" ")) {
                ans[i][p++] = c;
            }
            System.out.println();
        }

        System.out.print("Key: ");
        int p = 0;
        String ch = sc.nextLine();
        for (String c : ch.split(" ")) {
            key[p++] = c;
        }
        System.out.println();

        sc.close();
    }

    static int getScore(String a[]) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].equalsIgnoreCase(key[i]))
                c++;
        }
        return c;
    }

    static void exec() {

        accept();

        int score[] = new int[N];
        System.out.println("Scores:");
        for (int i = 0; i < score.length; i++) {
            score[i] = getScore(ans[i]);
            System.out.println("Participant " + (i + 1) + ": " + getScore(ans[i]));
        }

        int max = score[0];
        for (int i = 0; i < score.length; i++) {
            if (score[i] > max)
                max = score[i];

        }
        if (score[0] < max)
            score[0] = -1;
        System.out.println("Highest Scores: ");
        for (int i = 0; i < score.length; i++) {
            if (score[i] == max)
                System.out.println("Participant " + (i + 1) + ": " + score[i]);
        }
    }

    public static void main(String[] args) {
        exec();
    }

}
