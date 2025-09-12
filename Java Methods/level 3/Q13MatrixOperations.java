import java.util.Random;

class MatrixOps {

    public static int[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // random numbers 0-9
            }
        }
        return matrix;
    }

    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }

    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }

    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = B[0].length, common = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = 0;
                for (int k = 0; k < common; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] transpose(int[][] A) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[j][i] = A[i][j];
        return result;
    }

    public static int determinant2x2(int[][] A) {
        return A[0][0]*A[1][1] - A[0][1]*A[1][0];
    }

    public static int determinant3x3(int[][] A) {
        return A[0][0]*(A[1][1]*A[2][2] - A[1][2]*A[2][1]) 
             - A[0][1]*(A[1][0]*A[2][2] - A[1][2]*A[2][0]) 
             + A[0][2]*(A[1][0]*A[2][1] - A[1][1]*A[2][0]);
    }

    public static double[][] inverse2x2(int[][] A) {
        int det = determinant2x2(A);
        if (det == 0) throw new ArithmeticException("Matrix not invertible");
        double[][] inv = new double[2][2];
        inv[0][0] = A[1][1] / (double)det;
        inv[0][1] = -A[0][1] / (double)det;
        inv[1][0] = -A[1][0] / (double)det;
        inv[1][1] = A[0][0] / (double)det;
        return inv;
    }

    public static double[][] inverse3x3(int[][] A) {
        int det = determinant3x3(A);
        if (det == 0) throw new ArithmeticException("Matrix not invertible");

        double[][] adj = new double[3][3];
        adj[0][0] =  (A[1][1]*A[2][2] - A[1][2]*A[2][1]);
        adj[0][1] = -(A[1][0]*A[2][2] - A[1][2]*A[2][0]);
        adj[0][2] =  (A[1][0]*A[2][1] - A[1][1]*A[2][0]);

        adj[1][0] = -(A[0][1]*A[2][2] - A[0][2]*A[2][1]);
        adj[1][1] =  (A[0][0]*A[2][2] - A[0][2]*A[2][0]);
        adj[1][2] = -(A[0][0]*A[2][1] - A[0][1]*A[2][0]);

        adj[2][0] =  (A[0][1]*A[1][2] - A[0][2]*A[1][1]);
        adj[2][1] = -(A[0][0]*A[1][2] - A[0][2]*A[1][0]);
        adj[2][2] =  (A[0][0]*A[1][1] - A[0][1]*A[1][0]);

        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                inv[i][j] = adj[i][j] / (double)det;

        return inv;
    }

    public static void display(int[][] A) {
        for (int[] row : A) {
            for (int val : row) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }

    public static void display(double[][] A) {
        for (double[] row : A) {
            for (double val : row) {
                System.out.printf("%8.3f", val);
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Example: 3x3 matrices
        int[][] A = MatrixOps.generateMatrix(3,3);
        int[][] B = MatrixOps.generateMatrix(3,3);

        System.out.println("Matrix A:");
        MatrixOps.display(A);

        System.out.println("\nMatrix B:");
        MatrixOps.display(B);

        System.out.println("\nA + B:");
        MatrixOps.display(MatrixOps.addMatrices(A,B));

        System.out.println("\nA - B:");
        MatrixOps.display(MatrixOps.subtractMatrices(A,B));

        System.out.println("\nA * B:");
        MatrixOps.display(MatrixOps.multiplyMatrices(A,B));

        System.out.println("\nTranspose of A:");
        MatrixOps.display(MatrixOps.transpose(A));

        System.out.println("\nDeterminant of A:");
        System.out.println(MatrixOps.determinant3x3(A));

        try {
            System.out.println("\nInverse of A:");
            MatrixOps.display(MatrixOps.inverse3x3(A));
        } catch (ArithmeticException e) {
            System.out.println("Matrix A is not invertible.");
        }
    }
}
