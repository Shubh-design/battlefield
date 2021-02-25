package battlefield;
import java.util.Scanner;
public class battlefield {
	private static void display(int[][] a) {
		 for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < a.length; j++)
	                System.out.print(" "+a[i][j]+" ");
	            System.out.println();
	        }
	}
	private static boolean check(int[][] a, int row, int col) {
		 int i, j;
		 //checking horizontally
	        for (i = 0; i < col; i++)
	            if (a[row][i] == 1)
	                return false;
	     //checking diagonally
	        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
	            if (a[i][j] == 1)
	                return false;
	     //checking vertically
	        for (i = row, j = col; j >= 0 && i < a.length; i++, j--)
	            if (a[i][j] == 1)
	                return false;

	        return true;
	}
	private static boolean solve(int[][] a, int col) {
		  if (col >=a.length)
	            return true;
	        for (int i = 0; i < a.length; i++) {
	            if (check(a, i, col)) {
	                a[i][col] = 1;
	                if (solve(a, col + 1))
	                    return true;
	                a[i][col] = 0;
	            }
	        }
	        return false;
	}
public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[][]=new int[n][n];
		if (!solve(a, 0) || n<4) {
            System.out.print("Solution does not exist");
            return;
        }
		 display(a);
	}
}
