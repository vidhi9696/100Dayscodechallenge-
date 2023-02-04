import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] squares = new int[n];
        for(int squares_i=0; squares_i < n; squares_i++){
            squares[squares_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        // your code goes here
        if(m>n){
            System.out.println(0);
            return;
        }
        int ct = 0;
        int sum = 0;
        for(int i=0; i<m-1; i++){
            sum+=squares[i];
        }
        for(int j=m-1; j<n; j++){
            sum -= (j-m)<0 ? 0 : squares[j-m];
            sum += squares[j];
            if(sum==d)
                ct++;
        }
        System.out.println(ct);
    }
}
