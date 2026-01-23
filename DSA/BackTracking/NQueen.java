package DSA.BackTracking;
 import java.util.Arrays;

public class NQueen {
 


    static int size = 4; // Change this to any N (e.g., 8 for 8-queens)
    static char[][] chessboard = new char[size][size];

    public static void main(String[] args) {
        // Initialize chessboard with 'N'
        for (int i = 0; i < size; i++) {
            Arrays.fill(chessboard[i], 'N');
        }

        // Start placing queens from row 0
        nQueens(chessboard, 0);
    }

    // Function to solve N-Queens using backtracking
    public static void nQueens(char[][] board, int row) {
        if (row == size) {
            printChess(board);
            System.out.println();
            return;
        }

        for (int col = 0; col < size; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                nQueens(board, row + 1); // Place queen in next row
                board[row][col] = 'N'; // Backtrack
            }
        }
    }

    // Check if placing a queen at board[row][col] is safe
    public static boolean isSafe(char[][] board, int row, int col) {
        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < size; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    // Utility function to print the board
    public static void printChess(char[][] board) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

}
/*import java.util.*;
public class Test
{
    static int size = 8;
    public static void printchessboard(char[][] chessboard)
    {
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(chessboard[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static boolean isSafe(char[][] chessboard,int i,int j)
    {
       //cloumn checking
       for(int row=0;row<size;row++) //along each column we are checking all the rows
       {
           if(chessboard[row][j]=='Q')
           {
               return false;
           }
       }
       //row checking
       for(int col=0;col<size;col++)
       {
           if(chessboard[i][col]=='Q') //along each row we are checking all the columns
           {
               return false;
           }
       }
       //diagonal checking
       for(int row=i,col=j;row>=0 && col>=0;row--,col--)
       {
           if(chessboard[row][col]=='Q')
           {
               return false;
           }
       }
       for(int row=i,col=j;row>=0 && col<size;row--,col++)
       {
           if(chessboard[row][col]=='Q')
           {
               return false;
           }
       }
       return true;
       
    }
    public static void nqueens(char[][] chessboard,int i)
    {
        if(i==size)
		printchessboard(chessboard);
        for(int j=0;j<size;j++)
        {
            if(isSafe(chessboard,i,j))
            {
                chessboard[i][j]='Q';
                nqueens(chessboard,i+1);
                chessboard[i][j]='N';
            }
        }
    }
	public static void main(String[] args) {
		char[][] chessboard = new char[size][size];
		for(int i=0;i<size;i++)
		{
		    Arrays.fill(chessboard[i],'N');
		}
		printchessboard(chessboard);
		nqueens(chessboard,0);//0 represents starting index
	}
} */