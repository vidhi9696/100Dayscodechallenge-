https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true


/*Sample Input 0

anagram
margana
Sample Output 0

Anagrams
Explanation 0

Character	Frequency: anagram	Frequency: margana
A or a	3	3
G or g	1	1
N or n	1	1
M or m	1	1
R or r	1	1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".
import java.util.Scanner;*/

public class Solution {

    static boolean isAnagram(String s1, String s2) {
        // Complete the function
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        
        if(s1.length()==s2.length())

        {
            int[] a = new int[256];
            int[] b = new int[256];
            for (int i = 0; i < s1.length(); i++) {
                a[(int) s1.charAt(i)] += 1;
                b[(int) s2.charAt(i)] += 1;
            }
            for (int i = 0; i < 256; i++) {
                if (a[i] != b[i])
                    return false;

            }
            return true;
        }
        else
        {
            return false;
        }
    }

    

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

