import java.util.*;

public class SumOfNaturalNumbers {
    public static int recursiveSum(int n) {
        if (n == 0) return 0;
        return n + recursiveSum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number.");
            return;
        }
        int recSum = recursiveSum(n);
        int formulaSum = n * (n + 1) / 2;
        System.out.println("Recursive sum: " + recSum);
        System.out.println("Formula sum: " + formulaSum);
        System.out.println("Both results match: " + (recSum == formulaSum));
    }
}