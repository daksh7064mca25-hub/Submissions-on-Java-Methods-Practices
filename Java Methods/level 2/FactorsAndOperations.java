import java.util.*;

public class FactorsAndOperations {
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        return sum;
    }

    public static int product(int[] arr) {
        int prod = 1;
        for (int n : arr) prod *= n;
        return prod;
    }

    public static double sumOfSquares(int[] arr) {
        double sum = 0;
        for (int n : arr) sum += Math.pow(n, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] factors = findFactors(num);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Sum: " + sum(factors));
        System.out.println("Product: " + product(factors));
        System.out.println("Sum of squares: " + sumOfSquares(factors));
    }
}