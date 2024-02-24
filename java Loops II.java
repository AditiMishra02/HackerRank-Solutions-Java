import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            genSeries (a,b,n);
        }
        in.close();
    }
    
    private static void genSeries (int a , int b , int n ){
        int res = a;
        for (int j = 0; j < n; j++) {
            res += Math.pow(2, j) * b;
            System.out.print(res + " ");
        }

        System.out.println(); // Move to the next line after printing the series
    }
    }
