import java.util.Scanner;

class CollinearityChecker {

    public static boolean areCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        double slopeAB = (double)(y2 - y1) / (x2 - x1);
        double slopeAC = (double)(y3 - y1) / (x3 - x1);
        double slopeBC = (double)(y3 - y2) / (x3 - x2);

        return (slopeAB == slopeAC) && (slopeAB == slopeBC);
    }

    public static boolean areCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1, y1: ");
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        System.out.print("Enter x2, y2: ");
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        System.out.print("Enter x3, y3: ");
        int x3 = sc.nextInt(), y3 = sc.nextInt();

        
        boolean slopeCheck = CollinearityChecker.areCollinearSlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear (Slope Method)? " + slopeCheck);

        
        boolean areaCheck = CollinearityChecker.areCollinearArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear (Area Method)? " + areaCheck);

        sc.close();
    }
}
