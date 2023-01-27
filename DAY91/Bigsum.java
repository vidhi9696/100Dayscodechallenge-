import java.util.Scanner;

public class BigSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long sum = 0;
        while (N-- > 0 ) {
            sum += scanner.nextInt();
        }
        System.out.println(sum);
    }
}


