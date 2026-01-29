import java.util.Scanner;

public class Main {
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

        Solution sol = new Solution();
        sol.rotate(matrix);

        // Print rotated matrix
        System.out.println("Rotated matrix:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

class Solution {
    public void rotate(int[][] matrix) {
        int l=0;
        int r=matrix.length-1;
        while(l<r){
            int n=r-l;
            for(int i=0;i<n;i++){
                int top=l;
                int bottom=r;
                //Save the top-left intp temp
                int temp=matrix[top][l+i];
                //Move bottom left into top left
                matrix[top][l+i]=matrix[bottom-i][l];
                 //Move bottom right into bottom left
                matrix[bottom-i][l]=matrix[bottom][r-i];
                 //Move top right into bottom right
                matrix[bottom][r-i]=matrix[top+i][r];
                //Move top left into top right
                matrix[top+i][r]=temp;

            }
            r=r-1;
            l=l+1;
        }
    }
}