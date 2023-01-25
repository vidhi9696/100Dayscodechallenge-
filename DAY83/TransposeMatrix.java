import java.util.Scanner;
 
public class Transpose_matrix {
   public static void main(String args[])
   {
      int m, n, c,d;
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter the number of rows and columns of matrix");
      m = in.nextInt();
      n = in.nextInt();
 
      int first[][] = new int[m][n];
 
      System.out.println("Enter the elements of matrix");
 
      for (  c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
         {
            System.out.print(c+""+d+" Element : ");
            first[c][d] = in.nextInt();
         }
 
     int transpose[][] = new int[n][m];
 
      for ( c = 0 ; c < m ; c++ )
      {
         for ( d = 0 ; d < n ; d++ )               
            transpose[d][c] = first[c][d];
      }
 
      System.out.println("Transpose of entered matrix:-");
 
      for ( c = 0 ; c < n ; c++ )
      {
         for ( d = 0 ; d < m ; d++ )
               System.out.print(transpose[c][d]+"\t");
 
         System.out.print("\n");
      }
   }
}
