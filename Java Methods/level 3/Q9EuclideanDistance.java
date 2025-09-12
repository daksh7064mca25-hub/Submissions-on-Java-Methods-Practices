  import java.util.Scanner;

class GeometryUtils {

    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);   // m
        double intercept = y1 - slope * x1;     // b
        return new double[]{slope, intercept};
    }
}

public class Q9EuclideanDistancen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double distance = GeometryUtils.euclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);

        if (x1 == x2) {
            System.out.println("The line is vertical → Equation: x = " + x1);
        } else {
            double[] line = GeometryUtils.lineEquation(x1, y1, x2, y2);
            System.out.println("Equation of Line: y = " + line[0] + "x + " + line[1]);
        }

        sc.close();
    }
}

