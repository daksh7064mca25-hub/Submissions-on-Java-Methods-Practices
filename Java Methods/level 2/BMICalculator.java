import java.util.*;

public class BMICalculator {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] persons = new double[10][3];
        String[] status = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i+1) + ": ");
            persons[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i+1) + ": ");
            persons[i][1] = sc.nextDouble();
            persons[i][2] = calculateBMI(persons[i][0], persons[i][1]);
            status[i] = getBMIStatus(persons[i][2]);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i+1) + " -> Weight: " + persons[i][0] + "kg, Height: " + persons[i][1] + "cm, BMI: " + persons[i][2] + ", Status: " + status[i]);
        }
    }
}