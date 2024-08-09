package Java.Class12;

import java.util.Scanner;

public class Question20 {
    static String str;
    static int Shift;

    static void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter code text: ");
        str = sc.nextLine();
        System.out.println("Enter shift: ");
        Shift = sc.nextInt();
        if (Shift < 1 || Shift > 26) {
            System.out.println("INVALID SHIFT");
            System.exit(0);
        }
        sc.close();
    }

    static String decode(String codedText, int shift) {
        // Remove spaces and concatenate the text
        String concatenatedText = codedText.replace(" ", "");

        // Decode the text
        StringBuilder decodedText = new StringBuilder();
        for (int i = 0; i < concatenatedText.length(); i++) {
            char currentChar = concatenatedText.charAt(i);
            char decodedChar = decodeCharacter(currentChar, shift);
            decodedText.append(decodedChar);
        }

        // Replace QQ with space
        String decodedString = decodedText.toString().replace("QQ", " ");

        // Remove the extra space added at the end
        if (decodedString.endsWith(" ")) {
            decodedString = decodedString.substring(0, decodedString.length() - 1);
        }

        return decodedString;
    }

    public static char decodeCharacter(char ch, int shift) {
        int originalPosition = ch - 'A';
        int newPosition = (originalPosition + shift) % 26;
        return (char) ('A' + newPosition);
    }

    static void exec() {
        accept();
        System.out.println(decode(str, Shift));
    }

    public static void main(String[] args) {
        exec();
    }
}
