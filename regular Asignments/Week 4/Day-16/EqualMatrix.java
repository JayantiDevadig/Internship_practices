//Java Program to determine whether two matrices are equal

import java.util.Scanner;
 class EqualMat  {
	public static void main(String[] args) {
		int[][] x = {{1, 2}, {3, 4}};
		int[][] y = {{1, 2}, {5, 4}};
		
		int i, j, isEqual = 1;
		
		for(i = 0; i < x.length; i++)
		{
			for(j = 0; j < x[0].length; j++)
			{
				if(x[i][j] != y[i][j]) {
					isEqual = 0;
					break;
				}
			}
		}
		if(isEqual == 1) {
			System.out.println("Matrix x is Equal to Matrix y");
		}
		else {
			System.out.println("Matrix x is Not Equal to Matrix y");
		}
	}
}