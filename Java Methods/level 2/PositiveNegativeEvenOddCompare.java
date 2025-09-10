import java.util.*;

public class PositiveNegativeEvenOddCompare {
    public static boolean isPositive(int num) { return num > 0; }
    public static boolean isEven(int num) { return num % 2 == 0; }
    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = sc.nextInt();
        }
        for (int n : numbers) {
            if (isPositive(n)) {
                System.out.println(n + " is Positive and " + (isEven(n) ? "Even" : "Odd"));
            } else if (n < 0) {
                System.out.println(n + " is Negative");
            } else {
                System.out.println(n + " is Zero");
            }
        }
        int result = compare(numbers[0], numbers[numbers.length-1]);
        if (result == 0) System.out.println("First and Last are Equal");
        else if (result > 0) System.out.println("First is Greater");
        else System.out.println("First is Smaller");
    }
}