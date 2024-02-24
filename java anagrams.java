/*Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
Input Format

The first line contains a string .
The second line contains a string .

Constraints

Strings  and  consist of English alphabetic characters.
The comparison should NOT be case sensitive.

Sample Input 0

anagram
margana

Sample Output 0

Anagrams */




import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        char [] arrA = a.toCharArray();
        char [] arrB = b.toCharArray();
        
        if(arrA.length != arrB.length ){
            return false ;
        }
        
        // Use an array to count the occurrences of each character
        int[] charCount = new int[26]; // Assuming only English alphabetic characters

        // Increment counts for characters in the first string
        for (char c : arrA) {
            if (Character.isAlphabetic(c)) {
                charCount[c - 'a']++;
            }
        }

        // Decrement counts for characters in the second string
        for (char c : arrB) {
            if (Character.isAlphabetic(c)) {
                charCount[c - 'a']--;
                // If a count becomes negative, strings are not anagrams
                if (charCount[c - 'a'] < 0) {
                    return false;
                }
            }
        }

        // Check if all counts are zero
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
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