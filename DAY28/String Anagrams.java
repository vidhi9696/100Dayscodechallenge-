 //2 Strings are anagrams of each other 
//What are Anagrams?
Explanation: If two strings contain same caharcter with diffrent order they can said to be anagrams. consider race and care. In this case 
 races character can be  formed in to study, and care character can be formed in to race.Below is a java program to check If two strings are anagram or not 
 
import java .util.Arrays;

public class Main {
    public static void main(String[] args) {
        String Str1 = "earth";
        String Str2 = "heart";
        //Convert String to lowercase.why so that we don't have to check separtely for lower & uppercase//
        Str1 = Str1.toLowerCase();
        Str2 = Str2.toLowerCase();
        //first check-if the length are the same
        if (Str1.length() == Str2.length()) {
            //convert strings in to char array
            char[] Str1charArray = Str1.toCharArray();
            char[] Str2charArray = Str2.toCharArray();
            //sort the char array
            Arrays.sort(Str1charArray);
            Arrays.sort(Str2charArray);
            //if the sorted char array are same or identical then the strings are argram
            boolean result = Arrays.equals(Str1charArray, Str2charArray);
            if (result) {
                System.out.println(Str1 + " and " + Str2 + " are anagram of each other.");
            } else {
                System.out.println(Str1 + " and " + Str2 + " are not anagrams of each other.");

            }
        } else {
            // case when length are not equal
            System.out.println(Str1 + " and " + Str2 + " are not anagram of each other.");
        }

    }


    }
