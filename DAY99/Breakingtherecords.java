import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();
        int min = a[0];
        int max = a[0];
        int res1 = 0, res2 =0;
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                res1++;
                max = a[i];
            }
            if (a[i] < min) {
                res2++;
                min = a[i];
            }
        }
        System.out.println(res1 + " "+ res2);
    }
}
