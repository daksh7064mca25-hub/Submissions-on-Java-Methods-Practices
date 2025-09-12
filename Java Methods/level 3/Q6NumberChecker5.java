import java.util.Arrays;

class NumberChecker {

    
    public static int[] getFactors(int num) {
        int count = 0;

        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;

        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    
    public static int greatestFactor(int[] factors) {
        int max = factors[0];
        for (int f : factors) {
            if (f > max) max = f;
        }
        return max;
    }

    
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    
    public static long productOfCubes(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }

    
    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) { // proper divisors exclude num itself
            if (num % i == 0) sum += i;
        }
        return sum == num;
    }

    
    public static boolean isAbundant(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum > num;
    }

    
    public static boolean isDeficient(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum < num;
    }

    
    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    
    public static boolean isStrong(int num) {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }
}

public class Main {
    public static void main(String[] args) {
        int number = 28; // test with any number

        System.out.println("Number: " + number);

        int[] factors = NumberChecker.getFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));

        System.out.println("Greatest Factor: " + NumberChecker.greatestFactor(factors));
        System.out.println("Sum of Factors: " + NumberChecker.sumOfFactors(factors));
        System.out.println("Product of Factors: " + NumberChecker.productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + NumberChecker.productOfCubes(factors));

        System.out.println("Perfect Number? " + NumberChecker.isPerfect(number));
        System.out.println("Abundant Number? " + NumberChecker.isAbundant(number));
        System.out.println("Deficient Number? " + NumberChecker.isDeficient(number));
        System.out.println("Strong Number? " + NumberChecker.isStrong(number));
    }
}
