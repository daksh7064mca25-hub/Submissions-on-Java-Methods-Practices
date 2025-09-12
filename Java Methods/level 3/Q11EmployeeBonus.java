import java.util.Random;

class BonusCalculator {

    public static int[][] generateEmployeeData(int n) {
        Random rand = new Random();
        int[][] data = new int[n][2]; 

        for (int i = 0; i < n; i++) {
            int salary = 10000 + rand.nextInt(90000); 
            int years = 1 + rand.nextInt(15);        
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    public static double[][] calculateBonus(int[][] employees) {
        double[][] result = new double[employees.length][2];

        for (int i = 0; i < employees.length; i++) {
            int salary = employees[i][0];
            int years = employees[i][1];

            double bonus;
            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            double newSalary = salary + bonus;
            result[i][0] = bonus;
            result[i][1] = newSalary;
        }
        return result;
    }

    public static void printSummary(int[][] employees, double[][] results) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.printf("%-5s %-10s %-10s %-10s %-12s %-12s%n",
                "ID", "Salary", "Years", "Bonus", "New Salary", "Old+Bonus");

        for (int i = 0; i < employees.length; i++) {
            int salary = employees[i][0];
            int years = employees[i][1];
            double bonus = results[i][0];
            double newSalary = results[i][1];

            System.out.printf("%-5d %-10d %-10d %-10.2f %-12.2f %-12.2f%n",
                    (i + 1), salary, years, bonus, newSalary, salary + bonus);

            totalOldSalary += salary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }

        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-5s %-10.2f %-10s %-10.2f %-12.2f%n",
                "TOTAL", totalOldSalary, "", totalBonus, totalNewSalary);
    }
}

public class Main {
    public static void main(String[] args) {
        int numEmployees = 10;

        int[][] employees = BonusCalculator.generateEmployeeData(numEmployees);

        double[][] results = BonusCalculator.calculateBonus(employees);

        BonusCalculator.printSummary(employees, results);
    }
}
