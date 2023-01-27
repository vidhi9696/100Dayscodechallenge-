import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int output=0;
        String[] input = br.readLine().split(" ");
        for(String value:input)
        {
            output += Integer.parseInt(value);
        }
        System.out.println(output);
    }
}

