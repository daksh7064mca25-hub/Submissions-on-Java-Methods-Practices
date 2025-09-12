import java.util.Arrays;

class NumberChecker {

    
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    
    public static int[] getDigits(int num) {
        String str = String.valueOf(num);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }

    
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    
    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return arraysEqual(digits, reversed);
    }

    
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) { // skip first digit
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        int number = 12021;  // you can change this to test

        System.out.println("Number: " + number);

        int digitCount = NumberChecker.countDigits(number);
        System.out.println("Count of Digits: " + digitCount);

        int[] digits = NumberChecker.getDigits(number);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        int[] reversed = NumberChecker.reverseArray(digits);
        System.out.println("Reversed Digits Array: " + Arrays.toString(reversed));

        System.out.println("Arrays Equal? " + NumberChecker.arraysEqual(digits, reversed));
        System.out.println("Palindrome Number? " + NumberChecker.isPalindrome(digits));
        System.out.println("Duck Number? " + NumberChecker.isDuckNumber(digits));
    }
}
