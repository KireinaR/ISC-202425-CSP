package Java.Class12;

import java.util.Scanner;

public class Question5 {

    static int day = 0, year, after;
    static int daysArr[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    static String monthArr[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec" };

    static void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day number and year: ");
        day = sc.nextInt();
        year = sc.nextInt();
        System.out.println("Enter after:");
        after = sc.nextInt();
        if (after >= 100) {
            System.out.println("DATE AFTER (N DAYS) OUT OF RANGE");
        }
        if (day > 366) {
            System.out.println("DAY NUMBER OUT OF RANGE");
            System.exit(0);
        }
        sc.close();
    }

    static boolean isLeap(int ye) {
        boolean flag = false;
        if (year % 100 == 0) {
            if (year % 400 == 0)
                flag = true;
        }
        return flag;
    }

    static String convert(int d, int y) {
        int dup = d;
        if (isLeap(y))
            daysArr[1] = 29;

        int m = 0, day;
        for (int i = 0; i < daysArr.length; i++) {
            if (dup <= 0)
                break;
            dup = dup - daysArr[i];
            m++;
        }

        day = daysArr[m - 1] + dup;
        return "" + monthArr[m - 1] + " " + day + " " + y;
    }

    static void exec() {
        accept();
        System.out.println("DATE: " + convert(day, year));
        int aft = day + after;
        int maxDays = 365;
        int newDay = aft;
        if (isLeap(year))
            maxDays = 366;
        if (aft > maxDays) {
            year += 1;
            newDay = (after + day) - maxDays;
        }
        System.out.println("DATE AFTER " + after + " DAYS: " + convert(newDay, year));
    }

    public static void main(String[] args) {
        exec();
    }

}
