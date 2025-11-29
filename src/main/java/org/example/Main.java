package org.example;

import java.util.Stack;

public class Main {

    /**
     * Veri Yapıları Challenge I
     * Stack kullanarak palindrom kontrolü yapar.
     */
    public static boolean checkForPalindrome(String input) {
        if (input == null) return false;

        // Sadece harf ve rakamları al, küçük harfe çevir
        StringBuilder cleaned = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        String str = cleaned.toString();
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    /**
     * Decimal number'u binary formata çevirir.
     */
    public static String convertDecimalToBinary(int number) {
        if (number == 0) return "0";

        Stack<Integer> stack = new Stack<>();
        int n = number;
        while (n > 0) {
            stack.push(n % 2);
            n /= 2;
        }

        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }
}
