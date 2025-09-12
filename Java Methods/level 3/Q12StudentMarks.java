import java.util.Scanner;

class StudentMarks {

    public static int[][] generateMarks(int n) {
        int[][] marks = new int[n][3]; // PCM scores
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = 40 + (int)(Math.random() * 61); // random 40–100
            }
        }
        return marks;
    }

    public static Object[][] calculateResults(int[][] marks) {
        int n = marks.length;
        Object[][] results = new Object[n][7]; // store: Phy, Chem, Math, Total, Avg, %, Grade

        for (int i = 0; i < n; i++) {
            int phy = marks[i][0];
            int chem = marks[i][1];
            int math = marks[i][2];
            int total = phy + chem + math;
            double avg = Math.round((total / 3.0) * 100.0) / 100.0;
            double percent = Math.round((total / 300.0) * 10000.0) / 100.0; // %
            String grade;

            if (percent >= 80) grade = "A";
            else if (percent >= 70) grade = "B";
            else if (percent >= 60) grade = "C";
            else if (percent >= 50) grade = "D";
            else if (percent >= 40) grade = "E";
            else grade = "R";

            results[i][0] = phy;
            results[i][1] = chem;
            results[i][2] = math;
            results[i][3] = total;
            results[i][4] = avg;
            results[i][5] = percent;
            results[i][6] = grade;
        }
        return results;
    }

    public static void printScorecard(Object[][] results) {
        System.out.printf("%-5s %-7s %-7s %-7s %-7s %-8s %-10s %-6s%n",
                "ID", "Physics", "Chem", "Math", "Total", "Average", "Percent", "Grade");

        for (int i = 0; i < results.length; i++) {
            System.out.printf("%-5d %-7d %-7d %-7d %-7d %-8.2f %-10.2f %-6s%n",
                    (i+1),
                    results[i][0],
                    results[i][1],
                    results[i][2],
                    results[i][3],
                    results[i][4],
                    results[i][5],
                    results[i][6]);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = StudentMarks.generateMarks(n);

        Object[][] results = StudentMarks.calculateResults(marks);

        StudentMarks.printScorecard(results);

        sc.close();
    }
}
