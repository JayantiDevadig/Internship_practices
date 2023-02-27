
//Java Program to Add Two Matrices

  import java.util.Scanner;
class Example {
   public static void main(String args[]) {
     
      int[][] a = { {5, 2, 3}, {2, 6, 3}, {6, 9, 1} };
      int[][] b = { {2, 7, 5}, {1, 4, 3}, {1, 2, 1} };
      int[][] c = new int[3][3];
      System.out.println("Matrix A:");
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
            System.out.print(a[i][j] + " ");
         }
         System.out.println();
      }
      System.out.println("Matrix B");
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
            System.out.print(b[i][j] + " ");
         }
         System.out.println();
      }
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++){
            for (int k = 0; k < 3; k++) {
               c[i][j] =  a[i][k] + b[k][j];
            }
         }
      }
      System.out.println("The add of two matrices is:");
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
            System.out.print(c[i][j] + " ");
         }
         System.out.println();
      }
   }
}