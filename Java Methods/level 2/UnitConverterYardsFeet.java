public class UnitConverterYardsFeet {
    public static double convertYardsToFeet(double yards) { return yards * 3; }
    public static double convertFeetToYards(double feet) { return feet * 0.333333; }
    public static double convertMetersToInches(double meters) { return meters * 39.3701; }
    public static double convertInchesToMeters(double inches) { return inches * 0.0254; }
    public static double convertInchesToCm(double inches) { return inches * 2.54; }

    public static void main(String[] args) {
        System.out.println("5 yards = " + convertYardsToFeet(5) + " feet");
        System.out.println("9 feet = " + convertFeetToYards(9) + " yards");
        System.out.println("2 meters = " + convertMetersToInches(2) + " inches");
        System.out.println("50 inches = " + convertInchesToMeters(50) + " meters");
        System.out.println("10 inches = " + convertInchesToCm(10) + " cm");
    }
}