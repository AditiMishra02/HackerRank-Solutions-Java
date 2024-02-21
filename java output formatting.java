/*Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.

To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.

Input Format

Every line of input will contain a String followed by an integer.
Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .

Output Format

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly  characters.
The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

Sample Input

java 100
cpp 65
python 50
Sample Output

================================
java           100 
cpp            065 
python         050 
================================
Explanation

Each String is left-justified with trailing whitespace through the first  characters. The leading digit of the integer is the  character, and each integer that was less than  digits now has leading zeroes.*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.printf("%-15s%03d%n", s1, x);
            }
            System.out.println("================================");

    }
}

/*`System.out.printf` is a method in Java used for formatted output. It allows you to specify a format string with placeholders, and then provides values to be inserted into those placeholders.

In the case of `System.out.printf("%-15s%03d%n", s1, x);`:

- `%15s`: This is a format specifier for a string (`s`). The `%15` specifies that the string should be left-justified in a field of width 15 characters. If the string is less than 15 characters, it will be padded with spaces on the right.

- `%03d`: This is a format specifier for an integer (`d`). The `%03` specifies that the integer should be printed with at least 3 digits. If the integer has fewer than 3 digits, it will be padded with leading zeroes.

- `%n`: This represents a newline character. It is a platform-independent way to represent a newline in the output.

So, `System.out.printf("%-15s%03d%n", s1, x);` will print the string `s1` left-justified in a field of width 15 characters, followed by the integer `x` printed with at least 3 digits (padded with leading zeroes if necessary), and then a newline. The format ensures a consistent and neatly aligned output for each line. */