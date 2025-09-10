import java.util.*;

public class YoungestTallestFriend {
    public static int findYoungest(int[] ages) {
        int min = ages[0];
        for (int age : ages) if (age < min) min = age;
        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) if (h > max) max = h;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        int[] heights = new int[3];
        String[] names = {"Amar", "Akbar", "Anthony"};
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }
        System.out.println("Youngest age: " + findYoungest(ages));
        System.out.println("Tallest height: " + findTallest(heights));
    }
}