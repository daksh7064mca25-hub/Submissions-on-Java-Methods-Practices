import java.util.Scanner;

public class AthleteTriangularPark {
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double distance = 5000; // 5 km in meters
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 of triangle: ");
        double a = sc.nextDouble();
        System.out.print("Enter side 2 of triangle: ");
        double b = sc.nextDouble();
        System.out.print("Enter side 3 of triangle: ");
        double c = sc.nextDouble();

        double rounds = calculateRounds(a, b, c);
        System.out.println("The athlete must complete " + rounds + " rounds to run 5 km.");
        sc.close();
    }
}