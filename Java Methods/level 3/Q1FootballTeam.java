import java.util.Random;
public class Q1FootballTeam {
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }
     public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }
    public static void main(String[] args) {

         Random rand = new Random();
        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; // (0–100) + 150 → 150–250
        }

        System.out.print("Players' heights (in cms): ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

        System.out.println("Shortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + findTallest(heights) + " cm");
        System.out.println("Mean Height: " + String.format("%.2f", findMean(heights)) + " cm");
        
    }
}
