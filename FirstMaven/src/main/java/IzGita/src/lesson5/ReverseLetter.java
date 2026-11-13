package IzGita.src.lesson5;

import java.util.Objects;

public class ReverseLetter {

    public static String reverseLetters(String input) {
        Objects.requireNonNull(input, "Input cannot be null");

        char[] chars = input.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;
            } else if (!Character.isLetter(chars[right])) {
                right--;
            } else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                left++;
                right--;
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String input = "J@va the be$t!123";
        System.out.println(reverseLetters(input));
    }
}
