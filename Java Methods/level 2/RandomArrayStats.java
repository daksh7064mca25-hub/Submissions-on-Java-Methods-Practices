import java.util.*;

public class RandomArrayStats {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(1000 + Math.random() * 9000);
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int n : numbers) {
            if (n < min) min = n;
            if (n > max) max = n;
            sum += n;
        }
        double avg = sum / (double)numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        System.out.println("Numbers: " + Arrays.toString(arr));
        double[] result = findAverageMinMax(arr);
        System.out.println("Average: " + result[0] + ", Min: " + result[1] + ", Max: " + result[2]);
    }
}