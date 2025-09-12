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

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) { // skip first digit
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrong(int num, int[] digits) {
        int n = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, n);
        }
        return sum == num;
    }

    public static void findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + 
            (secondLargest == Integer.MIN_VALUE ? "None" : secondLargest));
    }

    public static void findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }

        System.out.println("Smallest Digit: " + smallest);
        System.out.println("Second Smallest Digit: " + 
            (secondSmallest == Integer.MAX_VALUE ? "None" : secondSmallest));
    }
}

public class Main {
    public static void main(String[] args) {
        int number = 153; // you can test with any number

        System.out.println("Number: " + number);

        int digitCount = NumberChecker.countDigits(number);
        System.out.println("Count of Digits: " + digitCount);

        int[] digits = NumberChecker.getDigits(number);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        System.out.println("Duck Number? " + NumberChecker.isDuckNumber(digits));
        System.out.println("Armstrong Number? " + NumberChecker.isArmstrong(number, digits));

        NumberChecker.findLargestAndSecondLargest(digits);
        NumberChecker.findSmallestAndSecondSmallest(digits);
    }
}
