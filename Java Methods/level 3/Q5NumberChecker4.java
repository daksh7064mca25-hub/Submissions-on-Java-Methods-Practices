class NumberChecker {


    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    
    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    
    public static boolean isSpy(int num) {
        int sum = 0, product = 1;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        String strNum = String.valueOf(num);
        String strSquare = String.valueOf(square);
        return strSquare.endsWith(strNum);
    }

    
    public static boolean isBuzz(int num) {
        return (num % 7 == 0) || (num % 10 == 7);
    }
}

public class Main {
    public static void main(String[] args) {
        int number = 7;  // test with any number

        System.out.println("Number: " + number);
        System.out.println("Prime Number? " + NumberChecker.isPrime(number));
        System.out.println("Neon Number? " + NumberChecker.isNeon(number));
        System.out.println("Spy Number? " + NumberChecker.isSpy(number));
        System.out.println("Automorphic Number? " + NumberChecker.isAutomorphic(number));
        System.out.println("Buzz Number? " + NumberChecker.isBuzz(number));
    }
}
