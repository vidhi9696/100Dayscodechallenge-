import java.util.*;
//Reverse an array
public class Main {
    public static void reverse(int numbers[]) {
        int first = 0, last = numbers.length - 1;
        while (first < last) {
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String arg[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[1] + "");
        }
        System.out.println();
    }
}

