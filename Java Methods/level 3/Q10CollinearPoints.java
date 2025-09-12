public class Q10CollinearPoints {
    public static void main(String[] args) {
import java.util.Scanner;

public class Q10CollinearPoints {

    // Method to check collinearity using the area formula
    public static boolean areCollinear(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Area of triangle formed by 3 points = 0 means collinear
        int area = (x1 * (y2 - y3)) + (x2 * (y3 - y1)) + (x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs for 3 points
        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print("Enter x3 y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        // Check if collinear
        if (areCollinear(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are Collinear.");
        } else {
            System.out.println("The points are NOT Collinear.");
        }

        sc.close();
    }
}

    }
}
