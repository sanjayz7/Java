import java.util.Scanner;

public class Main {

    // Method to rotate the matrix
    public static void rotate(int[][] matrix) {
        int l = 0;
        int r = matrix.length - 1;

        while (l < r) {
            int n = r - l;

            for (int i = 0; i < n; i++) {
                int top = l;
                int bottom = r;

                // Save top-left
                int temp = matrix[top][l + i];

                // Move bottom-left to top-left
                matrix[top][l + i] = matrix[bottom - i][l];

                // Move bottom-right to bottom-left
                matrix[bottom - i][l] = matrix[bottom][r - i];

                // Move top-right to bottom-right
                matrix[bottom][r - i] = matrix[top + i][r];

                // Move saved top-left to top-right
                matrix[top + i][r] = temp;
            }

            r--;
            l++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read matrix size
        System.out.print("Enter matrix size n: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        // Read matrix elements
        System.out.println("Enter the matrix row by row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Call rotate method
        rotate(matrix);

        // Print rotated matrix
        System.out.println("Rotated matrix:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}