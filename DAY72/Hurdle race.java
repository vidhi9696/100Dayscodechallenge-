import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'hurdleRace' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY height
     */

    public static int hurdleRace(int k, List<Integer> height) {
    // Write your code here
        int maximum =height.get(0);
            for(int i=1;i<height.size();i++)
            {
                if(maximum<height.get(i))
                {
                    maximum=height.get(i);
                }
                
            }
            int n = maximum-k;
            if (n>0)
            {
                return n;
            }
            else
            {
                return 0;
            }

    }

}

    public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        String[] heightTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> height = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int heightItem = Integer.parseInt(heightTemp[i]);
            height.add(heightItem);
        }

        int result = Result.hurdleRace(k, height);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

