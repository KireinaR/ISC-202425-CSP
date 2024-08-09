package Java.Class12;

import java.util.Scanner;

public class Question16 {

    static String[] units = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    static String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    static int n;

    static void accept() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n >= 1000) {
            System.out.println("OUT OF RANGE");
            System.exit(0);
        }
        sc.close();
    }

    static String convertToWords(int num) {
        if (num == 0) {
            return "zero";
        }

        if (num < 20) {
            return units[num];
        }

        if (num < 100) {
            return tens[num / 10] + ((num % 10 != 0) ? "-" + units[num % 10] : "");
        }

        if (num < 1000) {
            return units[num / 100] + " hundred" + ((num % 100 != 0) ? " and " + convertToWords(num % 100) : "");
        }

        return "";
    }

    static void exec() {
        accept();
        System.out.println(convertToWords(n));
    }

    public static void main(String[] args) {
        exec();
    }

}
