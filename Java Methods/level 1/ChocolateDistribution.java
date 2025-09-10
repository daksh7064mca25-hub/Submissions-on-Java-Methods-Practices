import java.util.Scanner;

public class ChocolateDistribution {
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        int each = chocolates / children;
        int remainder = chocolates % children;
        return new int[]{each, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets " + result[0] + " chocolates, Remaining: " + result[1]);
        sc.close();
    }
}