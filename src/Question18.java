package Java.Class12;

import java.util.Scanner;

public class Question18 {

    static int data[];
    static int n;

    static void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give the number of integers: ");
        n = sc.nextInt();
        data = new int[5];
        for (int i = 0; i < data.length; i++) {
            System.out.print("Give integer " + (i + 1) + ": ");
            data[i] = sc.nextInt();
            System.out.println();
        }
        sc.close();
    }

    static void sort() {
        int n = data.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (data[j - 1] > data[j]) {
                    temp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp;
                }

            }
        }
    }

    static void reArrange(int result[]) {
        int n = result.length;
        int mid = n / 2;

        // Step 2: Use a two-pointer approach to rearrange the array in place
        int left = mid;
        int right = mid + 1;
        boolean placeRight = true;

        for (int i = n - 1; i >= 0; i--) {
            if (placeRight) {
                result[right] = data[i];
                right++;
                if (right >= n) {
                    right = mid - 1;
                    placeRight = false;
                }
            } else {
                result[left] = data[i];
                left--;
                if (left < 0) {
                    left = mid + 1;
                    placeRight = true;
                }
            }
        }

        // Copy the rearranged elements back to the original array
        for (int i = 0; i < n; i++) {
            data[i] = result[i];
        }
    }

    static void exec() {

        accept();

        System.out.println("Original Array: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "  ");
        }
        System.out.println();

        sort();
        reArrange(data);

        System.out.println("Rearranged Array: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "  ");
        }
    }

    public static void main(String[] args) {
        exec();
    }

}
