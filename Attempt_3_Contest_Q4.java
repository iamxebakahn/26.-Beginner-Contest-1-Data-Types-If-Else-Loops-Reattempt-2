/*Integer Product
Problem Description

Given two lines of input, where the first line contains a decimal number A and the second line contains an integer B.

Your task is to compute the product of these two numbers and output only the integral part of the result.


Problem Constraints
-10000.0 <= A <= 10000.0

1 <= B <= 1000


Input Format
Take Decimal number from user in first line and
take an Integer from user in the second line.


Output Format
Print Integral part of the product.


Example Input
Input 1:
11.4
1
Input 2:
2.9
2


Example Output
Input 1:
11
Input 1:
5


Example Explanation
Explanation 1 :
A (Deciaml Number) = 11.4
B (Integer) = 1


Product (A * B) = 11.4 * 1 = 11.4



Print the Integral part of 11.4 is 11

Explanation 2 :
A (Deciaml Number) = 2.9
B (Integer) = 2


Product (A * B) = 2.9 * 2 = 5.8



Print the Integral part of 5.8 is 5



User Code */
 import java.lang.*;
import java.util.*;

public class Attempt_3_Contest_Q4 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        double A=sc.nextDouble();
        int B=sc.nextInt();
        double res=A*B;
        int new_res=(int)res;
        System.out.print(new_res);
    }
} 