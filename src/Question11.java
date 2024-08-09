package Java.Class12;

import java.util.Scanner;

public class Question11 {

    static String str;
    static String enc = "";

    static void accept() {
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        sc.close();
    }

    static void cipher() {
        int ascii = 0;
        int toAdd = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                enc += ' ';
                continue;
            }
            if (!Character.isLetter(str.charAt(i))) {
                enc += str.charAt(i);
                continue;
            }
            ascii = str.charAt(i) + 13;
            if (Character.isUpperCase(str.charAt(i)) && ascii > 90) {
                toAdd = ascii - 90;
                toAdd = 65 + toAdd;
            } else if (Character.isLowerCase(str.charAt(i)) && ascii > 122) {
                toAdd = ascii - 122;
                toAdd = 96 + toAdd;

            } else
                toAdd = ascii;

            enc += Character.toString(toAdd);
        }
    }

    static void exec() {
        accept();
        cipher();
        System.out.println(enc);
    }

    public static void main(String[] args) {
        exec();
    }

}
