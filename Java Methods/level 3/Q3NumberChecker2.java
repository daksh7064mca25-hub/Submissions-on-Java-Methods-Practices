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

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

     public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    
    public static boolean isHarshad(int num, int[] digits) {
        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }

    
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2]; // digit, frequency
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }
        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }
}

public class Main {
    public static void main(String[] args) {
        int number = 21; // you can test with any number

        System.out.println("Number: " + number);

        int digitCount = NumberChecker.countDigits(number);
        System.out.println("Count of Digits: " + digitCount);

        int[] digits = NumberChecker.getDigits(number);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        int sumDigits = NumberChecker.sumOfDigits(digits);
        System.out.println("Sum of Digits: " + sumDigits);

        int sumSquares = NumberChecker.sumOfSquares(digits);
        System.out.println("Sum of Squares of Digits: " + sumSquares);

        System.out.println("Harshad Number? " + NumberChecker.isHarshad(number, digits));

        int[][] freq = NumberChecker.digitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " → " + freq[i][1] + " times");
            }
        }
    }
}
